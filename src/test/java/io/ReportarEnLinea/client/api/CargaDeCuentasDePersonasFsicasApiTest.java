package io.ReportarEnLinea.client.api;

import io.ReportarEnLinea.client.ApiException;
import io.ReportarEnLinea.client.model.CargasPFRegistrarRequest;
import io.ReportarEnLinea.client.model.CargasResponse;
import io.ReportarEnLinea.client.ApiClient;
import io.ReportarEnLinea.client.api.CargaDeCuentasDePersonasFsicasApi;
import io.ReportarEnLinea.client.model.Cuenta;
import io.ReportarEnLinea.client.model.Domicilio;
import io.ReportarEnLinea.client.model.Empleo;
import io.ReportarEnLinea.client.model.Encabezado;
import io.ReportarEnLinea.client.model.Nombre;
import io.ReportarEnLinea.client.model.Persona;
import io.ReportarEnLinea.interceptor.SignerInterceptor;
import okhttp3.OkHttpClient;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;



public class CargaDeCuentasDePersonasFsicasApiTest {
	private final CargaDeCuentasDePersonasFsicasApi api = new CargaDeCuentasDePersonasFsicasApi();
	private ApiClient apiClient;

	@Before()
	public void setUp() {
		this.apiClient = api.getApiClient();
		this.apiClient.setBasePath("the_url");

		OkHttpClient okHttpClient = new OkHttpClient().newBuilder().readTimeout(30, TimeUnit.SECONDS)
				.addInterceptor(new SignerInterceptor()).build();
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
}
