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

- Generar un keystore dummy y eliminar su contenido.

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

### Paso 5. Capturar los datos de la petición

En el archivo **CargaDeCuentasDePersonasFsicasApiTest**, que se encuentra en ***src/test/java/io/ReportarEnLinea/client/api***. Se deberá modificar los datos de la petición y de la URL para el consumo de la API en ***setBasePath("the_url")***, como se muestra en el siguiente fragmento de código con los datos correspondientes:

```java
private final CargaDeCuentasDePersonasFsicasApi api = new CargaDeCuentasDePersonasFsicasApi();
private ApiClient apiClient;

@Before()
public void setUp() {
    this.apiClient = api.getApiClient();
    this.apiClient.setBasePath("the_url");

    OkHttpClient okHttpClient = new OkHttpClient()
            .newBuilder()
            .readTimeout(30, TimeUnit.SECONDS)
            .addInterceptor(new SignerInterceptor())
            .build();
    apiClient.setHttpClient(okHttpClient);
}

@Test
public void registrarTest() throws ApiException {

    String xApiKey = "XXXXXXXXXXXXXXXXXXX";
    String username = "XXXXXXXXX";
    String password = "XXXXXXXXX";

    CargasPFRegistrarRequest request = new CargasPFRegistrarRequest();

    Encabezado encabezado = new Encabezado();
    encabezado.setClaveOtorgante("OTORGANTE");
    encabezado.setNombreOtorgante("100000");

    Persona persona = new Persona();

    Nombre nombre = new Nombre();
    nombre.setApellidoPaterno("PATERNO");
    nombre.setApellidoMaterno("MATERNO");
    nombre.setApellidoAdicional(null);
    nombre.setNombres("NOMBRE");
    nombre.setFechaNacimiento("19860627");
    nombre.setRfc("PAPN860627");
    nombre.setCurp("PAPN860627MOCNSB02");
    nombre.setNumeroSeguridadSocial(null);
    nombre.setNacionalidad("MX");
    nombre.setResidencia("1");
    nombre.setNumeroLicenciaConducir(null);
    nombre.setEstadoCivil("S");
    nombre.setSexo("F");
    nombre.setClaveElectorIFE(null);
    nombre.setNumeroDependientes("0");
    nombre.setFechaDefuncion(null);
    nombre.setTipoPersona("PF");
    nombre.setIndicadorDefuncion("1");
    
    Domicilio domicilio = new Domicilio();
    domicilio.setDireccion("CONOCIDA S/N");
    domicilio.setColoniaPoblacion("CONOCIDA");
    domicilio.setDelegacionMunicipio("ECATEPEC");
    domicilio.setCiudad("ECATEPEC");
    domicilio.setEstado("MEX");
    domicilio.setEstadoExtranjero(null);
    domicilio.setCp("55010");
    domicilio.setFechaResidencia(null);
    domicilio.setNumeroCelular(null);
    domicilio.setNumeroTelefono(null);
    domicilio.setExtension(null);
    domicilio.setFax(null);
    domicilio.setTipoDomicilio("C");
    domicilio.setTipoAsentamiento("2");
    domicilio.setOrigenDomicilio("2");

    Empleo empleo = new Empleo();
    empleo.setNombreEmpresa("VTA DE TORTILLAS");
    empleo.setDireccion("CONOCIDA S/N");
    empleo.setColoniaPoblacion("CONOCIDA");
    empleo.setDelegacionMunicipio("ECATEPEC");
    empleo.setCiudad("ECATEPEC");
    empleo.setEstado("MX");
    empleo.setCp("55010");
    empleo.setNumeroTelefono(null);
    empleo.setExtension(null);
    empleo.setFax(null);
    empleo.setPuesto(null);
    empleo.setFechaContratacion(null);
    empleo.setClaveMoneda("MX");
    empleo.setSalarioMensual("5600");
    empleo.setFechaUltimoDiaEmpleo("20180228");
    empleo.setFechaVerificacionEmpleo(null);
    empleo.setOrigenRazonSocialDomicilio("2");

    Cuenta cuenta = new Cuenta();
    cuenta.setClaveActualOtorgante("0000080008");
    cuenta.setNombreOtorgante("CIRCULO DE CREDITO");
    cuenta.setCuentaActual("TCDC100004");
    cuenta.setTipoResponsabilidad("O");
    cuenta.setTipoCuenta("F");
    cuenta.setTipoContrato("BC");
    cuenta.setClaveUnidadMonetaria("MX");
    cuenta.setValorActivoValuacion(null);
    cuenta.setNumeroPagos("17");
    cuenta.setFrecuenciaPagos("S");
    cuenta.setMontoPagar("0");
    cuenta.setFechaAperturaCuenta("20151103");
    cuenta.setFechaUltimoPago("20151201");
    cuenta.setFechaUltimaCompra("20151103");
    cuenta.setFechaCierreCuenta("20160101");
    cuenta.setFechaCorte("20180228");
    cuenta.setGarantia(null);
    cuenta.setCreditoMaximo("10000");
    cuenta.setSaldoActual("0");
    cuenta.setLimiteCredito("0");
    cuenta.setSaldoVencido("0");
    cuenta.setNumeroPagosVencidos("2");
    cuenta.setPagoActual(" V");
    cuenta.setHistoricoPagos(null);
    cuenta.setClavePrevencion("1");
    cuenta.setTotalPagosReportados("0");
    cuenta.setClaveAnteriorOtorgante(null);
    cuenta.setNombreAnteriorOtorgante(null);
    cuenta.setNumeroCuentaAnterior(null);
    cuenta.setFechaPrimerIncumplimiento("");
    cuenta.setSaldoInsoluto(null);
    cuenta.setMontoUltimoPago(null);
    cuenta.setFechaIngresoCarteraVencida(null);
    cuenta.setMontoCorrespondienteIntereses("2");
    cuenta.setFormaPagoActualIntereses("2");
    cuenta.setDiasVencimiento("3");
    cuenta.setPlazoMeses(null);
    cuenta.setMontoCreditoOriginacion(null);
    cuenta.setCorreoElectronicoConsumidor(null);
    cuenta.setEstatusCAN("01");
    cuenta.setOrdenPrelacionOrigen("01");
    cuenta.setOrdenPrelacionActual("01");
    cuenta.setFechaAperturaCAN("20151001");
    cuenta.setFechaCancelacionCAN("null");

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
