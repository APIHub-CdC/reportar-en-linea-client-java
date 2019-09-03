# reportar-en-linea-client-java

Permite registrar las cuentas nuevas de una persona física.

## Requisitos

1. Java >= 1.7
2. Maven >= 3.3

## Instalación

Para la instalación de las dependencias se deberá ejecutar el siguiente comando:

```shell
mvn install -Dmaven.test.skip=true
```

> **NOTA:** Este fragmento del comando *-Dmaven.test.skip=true* evitará que se lance la prueba unitaria.


## Guía de inicio

### Paso 1. Generar llave y certificado

Antes de lanzar la prueba se deberá tener un keystore para la llave privada y el certificado asociado a ésta.
Para generar el keystore se ejecutan las instrucciones que se encuentran en ***src/main/security/createKeystore.sh*** ó con los siguientes comandos:

**Opcional**: Si desea cifrar su contenedor, coloque una contraseña en una variable de ambiente.

```shell
export KEY_PASSWORD=your_super_secure_password
```

**Opcional**: Si desea cifrar su keystore, coloque una contraseña en una variable de ambiente.

```shell
export KEYSTORE_PASSWORD=your_super_secure_keystore_password
```

- Definición de los nombres de archivos y alias.

```shell
export PRIVATE_KEY_FILE=pri_key.pem
export CERTIFICATE_FILE=certificate.pem
export SUBJECT=/C=MX/ST=MX/L=MX/O=CDC/CN=CDC
export PKCS12_FILE=keypair.p12
export KEYSTORE_FILE=keystore.jks
export ALIAS=cdc
```
- Generar llave y certificado.

```shell
# Genera la llave privada.
openssl ecparam -name secp384r1 -genkey -out ${PRIVATE_KEY_FILE}

# Genera el certificado público
openssl req -new -x509 -days 365 \
  -key ${PRIVATE_KEY_FILE} \
  -out ${CERTIFICATE_FILE} \
  -subj "${SUBJECT}"

```

- Generar contenedor PKCS12 a partir de la llave privada y el certificado

```shell
# Genera el archivo pkcs12 a partir de la llave privada y el certificado.
# Deberá empaquetar su llave privada y el certificado.

openssl pkcs12 -name ${ALIAS} \
  -export -out ${PKCS12_FILE} \
  -inkey ${PRIVATE_KEY_FILE} \
  -in ${CERTIFICATE_FILE} \
  -password pass:${KEY_PASSWORD}

```

- Generar un keystore dummy y eiminar su contenido.

```sh
#Genera un Keystore con un par de llaves dummy.
keytool -genkey -alias dummy -keyalg RSA \
    -keysize 2048 -keystore ${KEYSTORE_FILE} \
    -dname "CN=dummy, OU=, O=, L=, S=, C=" \
    -storepass ${KEYSTORE_PASSWORD} -keypass ${KEY_PASSWORD}
#Elimina el par de llaves dummy.
keytool -delete -alias dummy \
    -keystore ${KEYSTORE_FILE} \
    -storepass ${KEYSTORE_PASSWORD}
```

- Importar el contenedor PKCS12 al keystore

```sh
#Importamos el contenedor PKCS12
keytool -importkeystore -srckeystore ${PKCS12_FILE} \
  -srcstoretype PKCS12 \
  -srcstorepass ${KEY_PASSWORD} \
  -destkeystore ${KEYSTORE_FILE} \
  -deststoretype JKS -storepass ${KEYSTORE_PASSWORD} \
  -alias ${ALIAS}
#Lista el contenido del Kesystore para verificar que
keytool -list -keystore ${KEYSTORE_FILE} \
  -storepass ${KEYSTORE_PASSWORD}
```

### Paso 2. Carga del certificado dentro del portal de desarrolladores
 1. Iniciar sesión.
 2. Dar clic en la sección "**Mis aplicaciones**".
 3. Seleccionar la aplicación.
 4. Ir a la pestaña de "**Certificados para @tuApp**".
    <p align="center">
      <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/applications.png">
    </p>
 5. Al abrirse la ventana emergente, seleccionar el certificado previamente creado y dar clic en el botón "**Cargar**":
    <p align="center">
      <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/upload_cert.png" width="268">
    </p>

### Paso 3. Descarga del certificado de Círculo de Crédito dentro del portal de desarrolladores
 1. Iniciar sesión.
 2. Dar clic en la sección "**Mis aplicaciones**".
 3. Seleccionar la aplicación.
 4. Ir a la pestaña de "**Certificados para @tuApp**".
    <p align="center">
        <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/applications.png">
    </p>
 5. Al abrirse la ventana emergente, dar clic al botón "**Descargar**":
    <p align="center">
        <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/download_cert.png" width="268">
    </p>

### Paso 4. Modificar archivo de configuraciones

Para hacer uso del certificado que se descargó y el keystore que se creó se deberán modificar las rutas que se encuentran en ***src/main/resources/config.properties***

```properties
keystore_file=your_path_for_your_keystore/keystore.jks
cdc_cert_file=your_path_for_certificate_of_cdc/cdc_cert.pem
keystore_password=your_super_secure_keystore_password
key_alias=cdc
key_password=your_super_secure_password
```

### Paso 5. Modificar URL

Modificar la URL de la petición en ***src/main/java/io/apihub/client/ApiClient*** en la línea 40, como se muestra en el siguiente fragmento de código:

```java
public class ApiClient {

    private String basePath = "the_url";
    private Map<String, String> defaultHeaderMap = new HashMap<String, String>();
    private String tempFolderPath = null;
    private JSON json;
```

### Paso 6. Capturar los datos de la petición

En el archivo **CargaDeCuentasDePersonasFsicasApiTest**, que se encuentra en ***src/test/java/io/apihub/client/api*** se deberá modificar el siguiente fragmento de código con los datos correspondientes:

```java
private final CargaDeCuentasDePersonasFsicasApi api = new CargaDeCuentasDePersonasFsicasApi();
private ApiClient apiClient;

@Before()
public void setUp() {
    this.apiClient = api.getApiClient();
    OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
	    .readTimeout(30, TimeUnit.SECONDS)
	    .addInterceptor(new SignerInterceptor())
	    .build();
	apiClient.setHttpClient(okHttpClient);
}

@Test
public void registrarTest() throws ApiException {
    String xApiKey = "XXXXXXXXXXXX";
    String username = "XXXXXXXXXXXX";
    String password = "XXXXXXXXXXXX";
    CargasPFRegistrarRequest request = new CargasPFRegistrarRequest();

    Encabezado encabezado = new Encabezado();
    encabezado.setClaveOtorgante("XXXXXXXXXXXX");
    encabezado.setNombreOtorgante("XXXXXXXXXXXX");

    Persona persona = new Persona();

    Nombre nombre = new Nombre();
    nombre.setNombres("XXXXXXXXXXXX");
    nombre.setApellidoPaterno("XXXXXXXXXXXX");
    nombre.setApellidoMaterno("XXXXXXXXXXXX");
    nombre.setFechaNacimiento("XXXXXXXXXXXX");
    nombre.setRfc("XXXXXXXXXXXX");
    
    Domicilio domicilio = new Domicilio();
    domicilio.setDireccion("XXXXXXXXXXXX");
    domicilio.setColoniaPoblacion("XXXXXXXXXXXX");
    domicilio.setCiudad("XXXXXXXXXXXX");
    domicilio.cp("11230");
    domicilio.setDelegacionMunicipio("XXXXXXXXXXXX");
    domicilio.setEstado("MEX");
    
    Empleo empleo = new Empleo();
    empleo.setNombreEmpresa("XXXXXXXXXXXX");
    empleo.setDireccion("XXXXXXXXXXXX");
    empleo.setColoniaPoblacion("XXXXXXXXXXXX");
    empleo.setDelegacionMunicipio("XXXXXXXXXXXX");
    empleo.setCiudad("XXXXXXXXXXXX");
    empleo.setEstado("MX");
    empleo.cp("XXXXX");
    empleo.setClaveMoneda("MX");
    empleo.setSalarioMensual("XXXXXXXXXXXX");
    empleo.setFechaUltimoDiaEmpleo("XXXXXXX");
    
    Cuenta cuenta = new Cuenta();
    cuenta.setClaveActualOtorgante("XXXXXXXXXXXX");
    cuenta.setNombreOtorgante("XXXXXXXXXXXX");
    cuenta.setCuentaActual("XXXXXXXXXXXX");
    cuenta.setTipoResponsabilidad("X");
    cuenta.setTipoCuenta("X");
    cuenta.setTipoContrato("XX");
    cuenta.setClaveUnidadMonetaria("MX");
    cuenta.setNumeroPagos("XX");
    cuenta.setFrecuenciaPagos("X");
    cuenta.setMontoPagar("X");
    cuenta.setFechaAperturaCuenta("XXXXXXXXXXXX");
    cuenta.setFechaUltimoPago("XXXXXXXXXXXX");
    cuenta.setFechaUltimaCompra("XXXXXXXXXXXX");
    cuenta.setFechaCierreCuenta("XXXXXXXXXXXX");
    cuenta.setFechaCorte("XXXXXXXXXXXX");
    cuenta.setCreditoMaximo("XXXXXXXXXXXX");
    cuenta.setSaldoActual("X");
    cuenta.setLimiteCredito("X");
    cuenta.setSaldoVencido("X");
    cuenta.setNumeroPagosVencidos("X");
    cuenta.setPagoActual(" V");
    cuenta.setTotalPagosReportados("X");
    
    persona.setNombre(nombre);
    persona.setDomicilio(domicilio);
    persona.setEmpleo(empleo);
    persona.setCuenta(cuenta);
    
    request.setEncabezado(encabezado);
    request.setPersona(persona);
    
    CargasResponse response = api.registrar(xApiKey, username, password, request);
    Assert.assertNotNull(response);
}
```

### Paso 7. Ejecutar la prueba unitaria

Teniendo los pasos anteriores ya solo falta ejecutar la prueba unitaria, con el siguiente comando:

```shell
mvn test -Dmaven.install.skip=true
```
