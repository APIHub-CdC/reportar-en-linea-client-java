package io.apihub.client.api;

import io.apihub.client.ApiClient;
import io.apihub.client.ApiException;
import io.apihub.client.model.CargasPFRegistrarRequest;
import io.apihub.client.model.CargasResponse;
import io.apihub.client.model.Cuenta;
import io.apihub.client.model.Domicilio;
import io.apihub.client.model.Empleo;
import io.apihub.client.model.Encabezado;
import io.apihub.client.model.Nombre;
import io.apihub.client.model.Persona;
import io.apihub.interceptor.SignerInterceptor;
import okhttp3.OkHttpClient;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CargaDeCuentasDePersonasFsicasApiTest {
	private final CargaDeCuentasDePersonasFsicasApi api = new CargaDeCuentasDePersonasFsicasApi();
	private ApiClient apiClient;

	@Before()
	public void setUp() {
		this.apiClient = api.getApiClient();
		OkHttpClient okHttpClient = new OkHttpClient().newBuilder().readTimeout(30, TimeUnit.SECONDS)
				.addInterceptor(new SignerInterceptor()).build();
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
		domicilio.cp("XXXXX");
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
}
