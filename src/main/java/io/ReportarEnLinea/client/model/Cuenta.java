package io.ReportarEnLinea.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
@ApiModel(description = "Se reportan los datos de la cuenta del cliente.")


public class Cuenta {
  @SerializedName("claveActualOtorgante")
  private String claveActualOtorgante = null;
  @SerializedName("nombreOtorgante")
  private String nombreOtorgante = null;
  @SerializedName("cuentaActual")
  private String cuentaActual = null;
  @SerializedName("tipoResponsabilidad")
  private String tipoResponsabilidad = null;
  @SerializedName("tipoCuenta")
  private String tipoCuenta = null;
  @SerializedName("tipoContrato")
  private String tipoContrato = null;
  @SerializedName("claveUnidadMonetaria")
  private String claveUnidadMonetaria = null;
  @SerializedName("valorActivoValuacion")
  private String valorActivoValuacion = null;
  @SerializedName("numeroPagos")
  private String numeroPagos = null;
  @SerializedName("frecuenciaPagos")
  private String frecuenciaPagos = null;
  @SerializedName("montoPagar")
  private String montoPagar = null;
  @SerializedName("fechaAperturaCuenta")
  private String fechaAperturaCuenta = null;
  @SerializedName("fechaUltimoPago")
  private String fechaUltimoPago = null;
  @SerializedName("fechaUltimaCompra")
  private String fechaUltimaCompra = null;
  @SerializedName("fechaCierreCuenta")
  private String fechaCierreCuenta = null;
  @SerializedName("fechaCorte")
  private String fechaCorte = null;
  @SerializedName("garantia")
  private String garantia = null;
  @SerializedName("creditoMaximo")
  private String creditoMaximo = null;
  @SerializedName("saldoActual")
  private String saldoActual = null;
  @SerializedName("limiteCredito")
  private String limiteCredito = null;
  @SerializedName("saldoVencido")
  private String saldoVencido = null;
  @SerializedName("numeroPagosVencidos")
  private String numeroPagosVencidos = null;
  @SerializedName("pagoActual")
  private String pagoActual = null;
  @SerializedName("historicoPagos")
  private String historicoPagos = null;
  @SerializedName("clavePrevencion")
  private String clavePrevencion = null;
  @SerializedName("totalPagosReportados")
  private String totalPagosReportados = null;
  @SerializedName("claveAnteriorOtorgante")
  private String claveAnteriorOtorgante = null;
  @SerializedName("nombreAnteriorOtorgante")
  private String nombreAnteriorOtorgante = null;
  @SerializedName("numeroCuentaAnterior")
  private String numeroCuentaAnterior = null;
  @SerializedName("fechaPrimerIncumplimiento")
  private String fechaPrimerIncumplimiento = null;
  @SerializedName("saldoInsoluto")
  private String saldoInsoluto = null;
  @SerializedName("montoUltimoPago")
  private String montoUltimoPago = null;
  @SerializedName("fechaIngresoCarteraVencida")
  private String fechaIngresoCarteraVencida = null;
  @SerializedName("montoCorrespondienteIntereses")
  private String montoCorrespondienteIntereses = null;
  @SerializedName("formaPagoActualIntereses")
  private String formaPagoActualIntereses = null;
  @SerializedName("diasVencimiento")
  private String diasVencimiento = null;
  @SerializedName("plazoMeses")
  private String plazoMeses = null;
  @SerializedName("montoCreditoOriginacion")
  private String montoCreditoOriginacion = null;
  @SerializedName("correoElectronicoConsumidor")
  private String correoElectronicoConsumidor = null;
  @SerializedName("estatusCAN")
  private String estatusCAN = null;
  @SerializedName("ordenPrelacionOrigen")
  private String ordenPrelacionOrigen = null;
  @SerializedName("ordenPrelacionActual")
  private String ordenPrelacionActual = null;
  @SerializedName("fechaAperturaCAN")
  private String fechaAperturaCAN = null;
  @SerializedName("fechaCancelacionCAN")
  private String fechaCancelacionCAN = null;
  public Cuenta claveActualOtorgante(String claveActualOtorgante) {
    this.claveActualOtorgante = claveActualOtorgante;
    return this;
  }
   
  @ApiModelProperty(example = "0000080008", value = "Reportar la clave asignada por Círculo de Crédito a 10 posiciones.")
  public String getClaveActualOtorgante() {
    return claveActualOtorgante;
  }
  public void setClaveActualOtorgante(String claveActualOtorgante) {
    this.claveActualOtorgante = claveActualOtorgante;
  }
  public Cuenta nombreOtorgante(String nombreOtorgante) {
    this.nombreOtorgante = nombreOtorgante;
    return this;
  }
   
  @ApiModelProperty(example = "CIRCULO DE CREDITO", value = " Reportar el nombre del otorgante que reporta la cuenta.  Cuando se trate de un reporte especial o sea una cuenta propia de la institución al momento de la consulta, este nombre aparecerá en la sección de detalle de créditos en el reporte de crédito.  El dato correspondiente a este elemento es asignado por Círculo de Crédito.")
  public String getNombreOtorgante() {
    return nombreOtorgante;
  }
  public void setNombreOtorgante(String nombreOtorgante) {
    this.nombreOtorgante = nombreOtorgante;
  }
  public Cuenta cuentaActual(String cuentaActual) {
    this.cuentaActual = cuentaActual;
    return this;
  }
   
  @ApiModelProperty(example = "TCDC000001", value = " Es el número de cuenta del crédito, este número es asignado por el usuario.  Todas las cuentas reportadas en una base deben ser únicas por contrato.")
  public String getCuentaActual() {
    return cuentaActual;
  }
  public void setCuentaActual(String cuentaActual) {
    this.cuentaActual = cuentaActual;
  }
  public Cuenta tipoResponsabilidad(String tipoResponsabilidad) {
    this.tipoResponsabilidad = tipoResponsabilidad;
    return this;
  }
   
  @ApiModelProperty(example = "O", value = " Indica la responsabilidad que tiene el cliente con el crédito otorgado.  Ver Esquema de Carga (Anexo A, Tabla: Tipo de Responsabilidad).")
  public String getTipoResponsabilidad() {
    return tipoResponsabilidad;
  }
  public void setTipoResponsabilidad(String tipoResponsabilidad) {
    this.tipoResponsabilidad = tipoResponsabilidad;
  }
  public Cuenta tipoCuenta(String tipoCuenta) {
    this.tipoCuenta = tipoCuenta;
    return this;
  }
   
  @ApiModelProperty(example = "F", value = " Indica el tipo de cuenta que el Usuarios dio al cliente.  Ver Esquema de Carga (Anexo A, Tabla: Tipo de Cuenta).")
  public String getTipoCuenta() {
    return tipoCuenta;
  }
  public void setTipoCuenta(String tipoCuenta) {
    this.tipoCuenta = tipoCuenta;
  }
  public Cuenta tipoContrato(String tipoContrato) {
    this.tipoContrato = tipoContrato;
    return this;
  }
   
  @ApiModelProperty(example = "BC", value = " Reportar el producto que se otorgó al cliente.  Si se ingresa un tipo de contrato no válido, se rechazará la totalidad del registro.  Ver Esquema de Carga (Anexo A, Tabla: Tipo de Contrato).")
  public String getTipoContrato() {
    return tipoContrato;
  }
  public void setTipoContrato(String tipoContrato) {
    this.tipoContrato = tipoContrato;
  }
  public Cuenta claveUnidadMonetaria(String claveUnidadMonetaria) {
    this.claveUnidadMonetaria = claveUnidadMonetaria;
    return this;
  }
   
  @ApiModelProperty(example = "MX", value = " Los valores posibles son los siguientes:  MX = Pesos  US = Dólares  UD = Unidades de Inversión")
  public String getClaveUnidadMonetaria() {
    return claveUnidadMonetaria;
  }
  public void setClaveUnidadMonetaria(String claveUnidadMonetaria) {
    this.claveUnidadMonetaria = claveUnidadMonetaria;
  }
  public Cuenta valorActivoValuacion(String valorActivoValuacion) {
    this.valorActivoValuacion = valorActivoValuacion;
    return this;
  }
   
  @ApiModelProperty(value = " Aplica en tipos de cuenta de pagos fijos (F), hipotecario (H), quirografario (Q), crédito de habilitación o avio (A), crédito refaccionario (E) y prendario (P).  El dato se refiere al valor total del activo para propósitos de evaluación o recuperación.  Es el valor monetario de la garantía.")
  public String getValorActivoValuacion() {
    return valorActivoValuacion;
  }
  public void setValorActivoValuacion(String valorActivoValuacion) {
    this.valorActivoValuacion = valorActivoValuacion;
  }
  public Cuenta numeroPagos(String numeroPagos) {
    this.numeroPagos = numeroPagos;
    return this;
  }
   
  @ApiModelProperty(example = "17", value = " Es el total de pagos determinado en la apertura del crédito.  Si el tipo de cuenta es pagos fijos (F), hipotecario (H), quirografario (Q), crédito de habilitación o avio (A), crédito refaccionario (E) y prendario (P), este elemento se hace requerido con un valor mayor a cero en caso contrario el registro se rechaza.  Para tipo de cuenta revolvente (R) y sin límite preestablecido (L), es un dato opcional.")
  public String getNumeroPagos() {
    return numeroPagos;
  }
  public void setNumeroPagos(String numeroPagos) {
    this.numeroPagos = numeroPagos;
  }
  public Cuenta frecuenciaPagos(String frecuenciaPagos) {
    this.frecuenciaPagos = frecuenciaPagos;
    return this;
  }
   
  @ApiModelProperty(example = "S", value = " Reportar la perioricidad con que el cliente debe realizar sus pagos.  Para tipo de cuenta revolvente (R) y sin limite preestablecido (L) se debe reportar R (pago mínimo)  Ver Esquema de Carga (Anexo A, Tabla: Frecuencia de Pagos)")
  public String getFrecuenciaPagos() {
    return frecuenciaPagos;
  }
  public void setFrecuenciaPagos(String frecuenciaPagos) {
    this.frecuenciaPagos = frecuenciaPagos;
  }
  public Cuenta montoPagar(String montoPagar) {
    this.montoPagar = montoPagar;
    return this;
  }
   
  @ApiModelProperty(example = "0", value = " Es la cantidad que el cliente debe pagar de acuerdo con la frecuencia de pagos establecida.  La cantidad a pagar debe ser un número entero mayor o igual a cero. (Monto acordado de cada parcialidad).  Para tipo de cuenta revolvente (R) y sin limite preestablecido (L) colocar 0 en caso de no solicitar un pago mínimo.  Ver Esquema de Carga (Anexo A, Tabla: Monto a Pagar y Saldo Actual)")
  public String getMontoPagar() {
    return montoPagar;
  }
  public void setMontoPagar(String montoPagar) {
    this.montoPagar = montoPagar;
  }
  public Cuenta fechaAperturaCuenta(String fechaAperturaCuenta) {
    this.fechaAperturaCuenta = fechaAperturaCuenta;
    return this;
  }
   
  @ApiModelProperty(example = "20151103", value = " Reportar la fecha (AAAAMMDD) en la que se otorgó el crédito.  La fecha no debe ser mayor a 100 años.  Una vez reportado no debe modificarse.")
  public String getFechaAperturaCuenta() {
    return fechaAperturaCuenta;
  }
  public void setFechaAperturaCuenta(String fechaAperturaCuenta) {
    this.fechaAperturaCuenta = fechaAperturaCuenta;
  }
  public Cuenta fechaUltimoPago(String fechaUltimoPago) {
    this.fechaUltimoPago = fechaUltimoPago;
    return this;
  }
   
  @ApiModelProperty(example = "20151201", value = " Es la fecha más reciente en la que el cliente efectuó un pago.  Para cuentas que aún no han realizado su primer pago es requerido reportar la fecha 19010101.  Ver Esquema de Carga (Anexo A, Tabla: Fecha Último Pago y Fecha Última Compra)")
  public String getFechaUltimoPago() {
    return fechaUltimoPago;
  }
  public void setFechaUltimoPago(String fechaUltimoPago) {
    this.fechaUltimoPago = fechaUltimoPago;
  }
  public Cuenta fechaUltimaCompra(String fechaUltimaCompra) {
    this.fechaUltimaCompra = fechaUltimaCompra;
    return this;
  }
   
  @ApiModelProperty(example = "20151103", value = " Fecha más reciente en que el cliente efectuó una compra o disposición de un crédito.  Si el tipo de cuenta es pagos fijos (F), hipotecario (H), quirografario (Q), crédito de habilitación o avio (A), crédito refaccionario (E) y prendario (P),   la fecha de última compra será igual a la fecha de apertura de la cuenta.  Ver Esquema de Carga (Anexo A, Tabla: Fecha Último Pago y Fecha Última Compra)")
  public String getFechaUltimaCompra() {
    return fechaUltimaCompra;
  }
  public void setFechaUltimaCompra(String fechaUltimaCompra) {
    this.fechaUltimaCompra = fechaUltimaCompra;
  }
  public Cuenta fechaCierreCuenta(String fechaCierreCuenta) {
    this.fechaCierreCuenta = fechaCierreCuenta;
    return this;
  }
   
  @ApiModelProperty(example = "20160101", value = "Fecha (AAAAMMDD) en la que se liquidó o cerró un crédito.")
  public String getFechaCierreCuenta() {
    return fechaCierreCuenta;
  }
  public void setFechaCierreCuenta(String fechaCierreCuenta) {
    this.fechaCierreCuenta = fechaCierreCuenta;
  }
  public Cuenta fechaCorte(String fechaCorte) {
    this.fechaCorte = fechaCorte;
    return this;
  }
   
  @ApiModelProperty(example = "20180228", value = "Fecha (AAAAMMDD) correspondiente al periodo que se está reportando.")
  public String getFechaCorte() {
    return fechaCorte;
  }
  public void setFechaCorte(String fechaCorte) {
    this.fechaCorte = fechaCorte;
  }
  public Cuenta garantia(String garantia) {
    this.garantia = garantia;
    return this;
  }
   
  @ApiModelProperty(value = " Reportar una descripción de la garantía utilizada para asegurar el crédito otorgado.  Aplica para tipo de cuenta hipotecario (H) y pagos fijos (F), quirografario (Q), crédito de habilitación o avio (A), crédito refaccionario (E) y prendario (P)")
  public String getGarantia() {
    return garantia;
  }
  public void setGarantia(String garantia) {
    this.garantia = garantia;
  }
  public Cuenta creditoMaximo(String creditoMaximo) {
    this.creditoMaximo = creditoMaximo;
    return this;
  }
   
  @ApiModelProperty(example = "10000", value = " Contiene el máximo importe de crédito utilizado por el Cliente.  El valor debe ser mayor o igual a cero.  Para tipo de cuenta hipotecario (H) y pagos fijos (F), quirografario (Q), crédito de habilitación o avio (A), crédito refaccionario (E) y prendario (P), se debe colocar el monto aprobado.  Para tipo de cuenta revolvente (R) y sin límite preestablecido (L) se debe colocar el monto utilizado por el cliente.  Ver Esquema de Carga (Anexo A, Tabla: Crédito Máximo)")
  public String getCreditoMaximo() {
    return creditoMaximo;
  }
  public void setCreditoMaximo(String creditoMaximo) {
    this.creditoMaximo = creditoMaximo;
  }
  public Cuenta saldoActual(String saldoActual) {
    this.saldoActual = saldoActual;
    return this;
  }
   
  @ApiModelProperty(example = "0", value = " Monto total del adeudo que tiene el cliente a la fecha (capital mas intereses).  En caso de no tener saldo este elemento debe reportarse en cero (0) para cerrar la cuenta.")
  public String getSaldoActual() {
    return saldoActual;
  }
  public void setSaldoActual(String saldoActual) {
    this.saldoActual = saldoActual;
  }
  public Cuenta limiteCredito(String limiteCredito) {
    this.limiteCredito = limiteCredito;
    return this;
  }
   
  @ApiModelProperty(example = "0", value = " Cantidad máxima concedida por el usuario.  Este campo es obligatorio para créditos revolventes.")
  public String getLimiteCredito() {
    return limiteCredito;
  }
  public void setLimiteCredito(String limiteCredito) {
    this.limiteCredito = limiteCredito;
  }
  public Cuenta saldoVencido(String saldoVencido) {
    this.saldoVencido = saldoVencido;
    return this;
  }
   
  @ApiModelProperty(example = "0", value = " Cantidad generada a la fecha de reporte por atraso en pagos.  Deberá ser un número entero y positivo.  En caso de reportar en pagoActual 01...84, deberá colocar una cantidad mayor a 0.  Ver Esquema de Carga (Anexo A, Tabla: Saldo Actual y Saldo Vencido)")
  public String getSaldoVencido() {
    return saldoVencido;
  }
  public void setSaldoVencido(String saldoVencido) {
    this.saldoVencido = saldoVencido;
  }
  public Cuenta numeroPagosVencidos(String numeroPagosVencidos) {
    this.numeroPagosVencidos = numeroPagosVencidos;
    return this;
  }
   
  @ApiModelProperty(example = "2", value = "Número de pagos que NO ha efectuado el cliente.")
  public String getNumeroPagosVencidos() {
    return numeroPagosVencidos;
  }
  public void setNumeroPagosVencidos(String numeroPagosVencidos) {
    this.numeroPagosVencidos = numeroPagosVencidos;
  }
  public Cuenta pagoActual(String pagoActual) {
    this.pagoActual = pagoActual;
    return this;
  }
   
  @ApiModelProperty(example = " V", value = " El valor reportado en el campo indica el comportamiento de pago de un Cliente.  Cuando el valor del pagoActual es vigente, se debe reportar ' V' (espacioV), para todos los demás casos, reportar de 01 a 84 pagos.  Ver Esquema de Carga (Anexo A, Tabla: Pago Actual)")
  public String getPagoActual() {
    return pagoActual;
  }
  public void setPagoActual(String pagoActual) {
    this.pagoActual = pagoActual;
  }
  public Cuenta historicoPagos(String historicoPagos) {
    this.historicoPagos = historicoPagos;
    return this;
  }
   
  @ApiModelProperty(value = " Reportar únicamente en el primer envio de la cuenta a Círculo de Crédito, quien posteriormente lo construirá basándose en la información reportada.  Ver Esquema de Carga (Anexo A, Tabla: Histórico de Pagos)")
  public String getHistoricoPagos() {
    return historicoPagos;
  }
  public void setHistoricoPagos(String historicoPagos) {
    this.historicoPagos = historicoPagos;
  }
  public Cuenta clavePrevencion(String clavePrevencion) {
    this.clavePrevencion = clavePrevencion;
    return this;
  }
   
  @ApiModelProperty(value = " Se utiliza para reportar situaciones especiales que presenta la cuenta.  Al reportar una clavePrevencion se mantiene en la base de datos, aún cuando no se coloque en siguientes cargas.  Ver Esquema de Carga (Anexo A, Tabla: Clave de Observación)")
  public String getClavePrevencion() {
    return clavePrevencion;
  }
  public void setClavePrevencion(String clavePrevencion) {
    this.clavePrevencion = clavePrevencion;
  }
  public Cuenta totalPagosReportados(String totalPagosReportados) {
    this.totalPagosReportados = totalPagosReportados;
    return this;
  }
   
  @ApiModelProperty(example = "0", value = "Es el total de pagos realizados por el cliente a la fecha que se está reportando.")
  public String getTotalPagosReportados() {
    return totalPagosReportados;
  }
  public void setTotalPagosReportados(String totalPagosReportados) {
    this.totalPagosReportados = totalPagosReportados;
  }
  public Cuenta claveAnteriorOtorgante(String claveAnteriorOtorgante) {
    this.claveAnteriorOtorgante = claveAnteriorOtorgante;
    return this;
  }
   
  @ApiModelProperty(value = "Este elemento se hace requerido cuando existe un cambio en el usuario.")
  public String getClaveAnteriorOtorgante() {
    return claveAnteriorOtorgante;
  }
  public void setClaveAnteriorOtorgante(String claveAnteriorOtorgante) {
    this.claveAnteriorOtorgante = claveAnteriorOtorgante;
  }
  public Cuenta nombreAnteriorOtorgante(String nombreAnteriorOtorgante) {
    this.nombreAnteriorOtorgante = nombreAnteriorOtorgante;
    return this;
  }
   
  @ApiModelProperty(value = "El campo aplica cuando por algún motivo se modifica el número de usuario asignado por CC.")
  public String getNombreAnteriorOtorgante() {
    return nombreAnteriorOtorgante;
  }
  public void setNombreAnteriorOtorgante(String nombreAnteriorOtorgante) {
    this.nombreAnteriorOtorgante = nombreAnteriorOtorgante;
  }
  public Cuenta numeroCuentaAnterior(String numeroCuentaAnterior) {
    this.numeroCuentaAnterior = numeroCuentaAnterior;
    return this;
  }
   
  @ApiModelProperty(value = " El campo aplica cuando se efectúa una reasignación de cuenta.  Se captura una sola vez y para la siguiente entrega ya no se reporta el dato.")
  public String getNumeroCuentaAnterior() {
    return numeroCuentaAnterior;
  }
  public void setNumeroCuentaAnterior(String numeroCuentaAnterior) {
    this.numeroCuentaAnterior = numeroCuentaAnterior;
  }
  public Cuenta fechaPrimerIncumplimiento(String fechaPrimerIncumplimiento) {
    this.fechaPrimerIncumplimiento = fechaPrimerIncumplimiento;
    return this;
  }
   
  @ApiModelProperty(value = " Este elemento contiene la fecha (AAAAMMDD) en que el consumidor incumplió por primera vez con algún pago.  Una vez que ya se reportó una primera fecha ésta no debe modificarse.  En caso de no contar con incumplimiento en el crédito deberá de reportar la fecha 19010101 ó 19000101")
  public String getFechaPrimerIncumplimiento() {
    return fechaPrimerIncumplimiento;
  }
  public void setFechaPrimerIncumplimiento(String fechaPrimerIncumplimiento) {
    this.fechaPrimerIncumplimiento = fechaPrimerIncumplimiento;
  }
  public Cuenta saldoInsoluto(String saldoInsoluto) {
    this.saldoInsoluto = saldoInsoluto;
    return this;
  }
   
  @ApiModelProperty(value = " Monto que se adeuda a la fecha de corte, no deberá incluir intereses, comisiones o cualquier otro accesorio.  El saldo insoluto no puede ser mayor al saldo actual, pero sí podrán ser iguales.  En caso de reportar el campo en blanco, el registro se rechazará.")
  public String getSaldoInsoluto() {
    return saldoInsoluto;
  }
  public void setSaldoInsoluto(String saldoInsoluto) {
    this.saldoInsoluto = saldoInsoluto;
  }
  public Cuenta montoUltimoPago(String montoUltimoPago) {
    this.montoUltimoPago = montoUltimoPago;
    return this;
  }
   
  @ApiModelProperty(value = " Es el pago parcial más reciente que el consumidor efectuó.  Cuando el monto de último pago sea mayor a cero y no se reporte la fecha de último pago el registro se rechazará.")
  public String getMontoUltimoPago() {
    return montoUltimoPago;
  }
  public void setMontoUltimoPago(String montoUltimoPago) {
    this.montoUltimoPago = montoUltimoPago;
  }
  public Cuenta fechaIngresoCarteraVencida(String fechaIngresoCarteraVencida) {
    this.fechaIngresoCarteraVencida = fechaIngresoCarteraVencida;
    return this;
  }
   
  @ApiModelProperty(value = "Reportar la fecha en la que el acreditado fue promovido a cartera vencida, debido a que no liquidó el monto total o parcial del capital, cuotas de amortización o intereses de acuerdo a lo pactado.")
  public String getFechaIngresoCarteraVencida() {
    return fechaIngresoCarteraVencida;
  }
  public void setFechaIngresoCarteraVencida(String fechaIngresoCarteraVencida) {
    this.fechaIngresoCarteraVencida = fechaIngresoCarteraVencida;
  }
  public Cuenta montoCorrespondienteIntereses(String montoCorrespondienteIntereses) {
    this.montoCorrespondienteIntereses = montoCorrespondienteIntereses;
    return this;
  }
   
  @ApiModelProperty(value = "Importe correspondiente al monto de los intereses del crédito.")
  public String getMontoCorrespondienteIntereses() {
    return montoCorrespondienteIntereses;
  }
  public void setMontoCorrespondienteIntereses(String montoCorrespondienteIntereses) {
    this.montoCorrespondienteIntereses = montoCorrespondienteIntereses;
  }
  public Cuenta formaPagoActualIntereses(String formaPagoActualIntereses) {
    this.formaPagoActualIntereses = formaPagoActualIntereses;
    return this;
  }
   
  @ApiModelProperty(value = " Indica el comportamiento de pago de los intereses.  El reporte de este pago deberá mensualizarse (períodos de 30 días).  Ejemplo:  00 días =  V  01 - 30 días = 01  31 - 60 días = 02  61 - 90 días = 03, etc.")
  public String getFormaPagoActualIntereses() {
    return formaPagoActualIntereses;
  }
  public void setFormaPagoActualIntereses(String formaPagoActualIntereses) {
    this.formaPagoActualIntereses = formaPagoActualIntereses;
  }
  public Cuenta diasVencimiento(String diasVencimiento) {
    this.diasVencimiento = diasVencimiento;
    return this;
  }
   
  @ApiModelProperty(value = " Reportar el número de días que ha estado vencido el crédito, sí este se encuentra al corriente reportar cero (0)  El dato reportado debe corresponder con el campo pagoActual.")
  public String getDiasVencimiento() {
    return diasVencimiento;
  }
  public void setDiasVencimiento(String diasVencimiento) {
    this.diasVencimiento = diasVencimiento;
  }
  public Cuenta plazoMeses(String plazoMeses) {
    this.plazoMeses = plazoMeses;
    return this;
  }
   
  @ApiModelProperty(value = " Es el plazo original del crédito se debe de reportar en días.  Sólo aplica a tipo de cuenta pagos fijos (F), hipotecario (H), quirografario (Q), crédito de habilitación o avio (A), crédito refaccionario (E) y prendario (P)  En caso de reportar tipo de cuenta revolvente (R) y sin límite preestablecido (L), colocar 0.  Nota: Círculo de Crédito toma en cuenta que un mes equivale a 30.4 días.")
  public String getPlazoMeses() {
    return plazoMeses;
  }
  public void setPlazoMeses(String plazoMeses) {
    this.plazoMeses = plazoMeses;
  }
  public Cuenta montoCreditoOriginacion(String montoCreditoOriginacion) {
    this.montoCreditoOriginacion = montoCreditoOriginacion;
    return this;
  }
   
  @ApiModelProperty(value = " Monto que se otorgó al cliente en la apertura del crédito.   Aplica a tipo de cuenta de pagos fijos (F), hipotecario (H), quirografario (Q), crédito de habilitación o avio (A), crédito refaccionario (E) y prendario (P)  Para tipo de cuenta revolvente (R) debe reportar el límite de crédito.  Para tipo de cuenta sin límite preestablecido (L), no se reporta el dato.")
  public String getMontoCreditoOriginacion() {
    return montoCreditoOriginacion;
  }
  public void setMontoCreditoOriginacion(String montoCreditoOriginacion) {
    this.montoCreditoOriginacion = montoCreditoOriginacion;
  }
  public Cuenta correoElectronicoConsumidor(String correoElectronicoConsumidor) {
    this.correoElectronicoConsumidor = correoElectronicoConsumidor;
    return this;
  }
   
  @ApiModelProperty(value = "Ingresar la cuenta de correo electrónico del cliente.")
  public String getCorreoElectronicoConsumidor() {
    return correoElectronicoConsumidor;
  }
  public void setCorreoElectronicoConsumidor(String correoElectronicoConsumidor) {
    this.correoElectronicoConsumidor = correoElectronicoConsumidor;
  }
  public Cuenta estatusCAN(String estatusCAN) {
    this.estatusCAN = estatusCAN;
    return this;
  }
   
  @ApiModelProperty(example = "01", value = "Se reporta el campo cuando el crédito otorgado es asociado a la nómina del acréditado. Los valores aceptados son: 01: Activo 02: Cancelado")
  public String getEstatusCAN() {
    return estatusCAN;
  }
  public void setEstatusCAN(String estatusCAN) {
    this.estatusCAN = estatusCAN;
  }
  public Cuenta ordenPrelacionOrigen(String ordenPrelacionOrigen) {
    this.ordenPrelacionOrigen = ordenPrelacionOrigen;
    return this;
  }
   
  @ApiModelProperty(example = "01", value = "Orden de prelación con el que se originó el crédito.")
  public String getOrdenPrelacionOrigen() {
    return ordenPrelacionOrigen;
  }
  public void setOrdenPrelacionOrigen(String ordenPrelacionOrigen) {
    this.ordenPrelacionOrigen = ordenPrelacionOrigen;
  }
  public Cuenta ordenPrelacionActual(String ordenPrelacionActual) {
    this.ordenPrelacionActual = ordenPrelacionActual;
    return this;
  }
   
  @ApiModelProperty(example = "01", value = "Orden de prelación actual que tiene el crédito.")
  public String getOrdenPrelacionActual() {
    return ordenPrelacionActual;
  }
  public void setOrdenPrelacionActual(String ordenPrelacionActual) {
    this.ordenPrelacionActual = ordenPrelacionActual;
  }
  public Cuenta fechaAperturaCAN(String fechaAperturaCAN) {
    this.fechaAperturaCAN = fechaAperturaCAN;
    return this;
  }
   
  @ApiModelProperty(example = "20151001", value = "Fecha en qué el crédito fue asociado a la nómina en formato AAAAMMDD.")
  public String getFechaAperturaCAN() {
    return fechaAperturaCAN;
  }
  public void setFechaAperturaCAN(String fechaAperturaCAN) {
    this.fechaAperturaCAN = fechaAperturaCAN;
  }
  public Cuenta fechaCancelacionCAN(String fechaCancelacionCAN) {
    this.fechaCancelacionCAN = fechaCancelacionCAN;
    return this;
  }
   
  @ApiModelProperty(value = "Fecha de baja de domiciliación a la nómina en formato AAAAMMDD.")
  public String getFechaCancelacionCAN() {
    return fechaCancelacionCAN;
  }
  public void setFechaCancelacionCAN(String fechaCancelacionCAN) {
    this.fechaCancelacionCAN = fechaCancelacionCAN;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cuenta cuenta = (Cuenta) o;
    return Objects.equals(this.claveActualOtorgante, cuenta.claveActualOtorgante) &&
        Objects.equals(this.nombreOtorgante, cuenta.nombreOtorgante) &&
        Objects.equals(this.cuentaActual, cuenta.cuentaActual) &&
        Objects.equals(this.tipoResponsabilidad, cuenta.tipoResponsabilidad) &&
        Objects.equals(this.tipoCuenta, cuenta.tipoCuenta) &&
        Objects.equals(this.tipoContrato, cuenta.tipoContrato) &&
        Objects.equals(this.claveUnidadMonetaria, cuenta.claveUnidadMonetaria) &&
        Objects.equals(this.valorActivoValuacion, cuenta.valorActivoValuacion) &&
        Objects.equals(this.numeroPagos, cuenta.numeroPagos) &&
        Objects.equals(this.frecuenciaPagos, cuenta.frecuenciaPagos) &&
        Objects.equals(this.montoPagar, cuenta.montoPagar) &&
        Objects.equals(this.fechaAperturaCuenta, cuenta.fechaAperturaCuenta) &&
        Objects.equals(this.fechaUltimoPago, cuenta.fechaUltimoPago) &&
        Objects.equals(this.fechaUltimaCompra, cuenta.fechaUltimaCompra) &&
        Objects.equals(this.fechaCierreCuenta, cuenta.fechaCierreCuenta) &&
        Objects.equals(this.fechaCorte, cuenta.fechaCorte) &&
        Objects.equals(this.garantia, cuenta.garantia) &&
        Objects.equals(this.creditoMaximo, cuenta.creditoMaximo) &&
        Objects.equals(this.saldoActual, cuenta.saldoActual) &&
        Objects.equals(this.limiteCredito, cuenta.limiteCredito) &&
        Objects.equals(this.saldoVencido, cuenta.saldoVencido) &&
        Objects.equals(this.numeroPagosVencidos, cuenta.numeroPagosVencidos) &&
        Objects.equals(this.pagoActual, cuenta.pagoActual) &&
        Objects.equals(this.historicoPagos, cuenta.historicoPagos) &&
        Objects.equals(this.clavePrevencion, cuenta.clavePrevencion) &&
        Objects.equals(this.totalPagosReportados, cuenta.totalPagosReportados) &&
        Objects.equals(this.claveAnteriorOtorgante, cuenta.claveAnteriorOtorgante) &&
        Objects.equals(this.nombreAnteriorOtorgante, cuenta.nombreAnteriorOtorgante) &&
        Objects.equals(this.numeroCuentaAnterior, cuenta.numeroCuentaAnterior) &&
        Objects.equals(this.fechaPrimerIncumplimiento, cuenta.fechaPrimerIncumplimiento) &&
        Objects.equals(this.saldoInsoluto, cuenta.saldoInsoluto) &&
        Objects.equals(this.montoUltimoPago, cuenta.montoUltimoPago) &&
        Objects.equals(this.fechaIngresoCarteraVencida, cuenta.fechaIngresoCarteraVencida) &&
        Objects.equals(this.montoCorrespondienteIntereses, cuenta.montoCorrespondienteIntereses) &&
        Objects.equals(this.formaPagoActualIntereses, cuenta.formaPagoActualIntereses) &&
        Objects.equals(this.diasVencimiento, cuenta.diasVencimiento) &&
        Objects.equals(this.plazoMeses, cuenta.plazoMeses) &&
        Objects.equals(this.montoCreditoOriginacion, cuenta.montoCreditoOriginacion) &&
        Objects.equals(this.correoElectronicoConsumidor, cuenta.correoElectronicoConsumidor) &&
        Objects.equals(this.estatusCAN, cuenta.estatusCAN) &&
        Objects.equals(this.ordenPrelacionOrigen, cuenta.ordenPrelacionOrigen) &&
        Objects.equals(this.ordenPrelacionActual, cuenta.ordenPrelacionActual) &&
        Objects.equals(this.fechaAperturaCAN, cuenta.fechaAperturaCAN) &&
        Objects.equals(this.fechaCancelacionCAN, cuenta.fechaCancelacionCAN);
  }
  @Override
  public int hashCode() {
    return Objects.hash(claveActualOtorgante, nombreOtorgante, cuentaActual, tipoResponsabilidad, tipoCuenta, tipoContrato, claveUnidadMonetaria, valorActivoValuacion, numeroPagos, frecuenciaPagos, montoPagar, fechaAperturaCuenta, fechaUltimoPago, fechaUltimaCompra, fechaCierreCuenta, fechaCorte, garantia, creditoMaximo, saldoActual, limiteCredito, saldoVencido, numeroPagosVencidos, pagoActual, historicoPagos, clavePrevencion, totalPagosReportados, claveAnteriorOtorgante, nombreAnteriorOtorgante, numeroCuentaAnterior, fechaPrimerIncumplimiento, saldoInsoluto, montoUltimoPago, fechaIngresoCarteraVencida, montoCorrespondienteIntereses, formaPagoActualIntereses, diasVencimiento, plazoMeses, montoCreditoOriginacion, correoElectronicoConsumidor, estatusCAN, ordenPrelacionOrigen, ordenPrelacionActual, fechaAperturaCAN, fechaCancelacionCAN);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cuenta {\n");
    
    sb.append("    claveActualOtorgante: ").append(toIndentedString(claveActualOtorgante)).append("\n");
    sb.append("    nombreOtorgante: ").append(toIndentedString(nombreOtorgante)).append("\n");
    sb.append("    cuentaActual: ").append(toIndentedString(cuentaActual)).append("\n");
    sb.append("    tipoResponsabilidad: ").append(toIndentedString(tipoResponsabilidad)).append("\n");
    sb.append("    tipoCuenta: ").append(toIndentedString(tipoCuenta)).append("\n");
    sb.append("    tipoContrato: ").append(toIndentedString(tipoContrato)).append("\n");
    sb.append("    claveUnidadMonetaria: ").append(toIndentedString(claveUnidadMonetaria)).append("\n");
    sb.append("    valorActivoValuacion: ").append(toIndentedString(valorActivoValuacion)).append("\n");
    sb.append("    numeroPagos: ").append(toIndentedString(numeroPagos)).append("\n");
    sb.append("    frecuenciaPagos: ").append(toIndentedString(frecuenciaPagos)).append("\n");
    sb.append("    montoPagar: ").append(toIndentedString(montoPagar)).append("\n");
    sb.append("    fechaAperturaCuenta: ").append(toIndentedString(fechaAperturaCuenta)).append("\n");
    sb.append("    fechaUltimoPago: ").append(toIndentedString(fechaUltimoPago)).append("\n");
    sb.append("    fechaUltimaCompra: ").append(toIndentedString(fechaUltimaCompra)).append("\n");
    sb.append("    fechaCierreCuenta: ").append(toIndentedString(fechaCierreCuenta)).append("\n");
    sb.append("    fechaCorte: ").append(toIndentedString(fechaCorte)).append("\n");
    sb.append("    garantia: ").append(toIndentedString(garantia)).append("\n");
    sb.append("    creditoMaximo: ").append(toIndentedString(creditoMaximo)).append("\n");
    sb.append("    saldoActual: ").append(toIndentedString(saldoActual)).append("\n");
    sb.append("    limiteCredito: ").append(toIndentedString(limiteCredito)).append("\n");
    sb.append("    saldoVencido: ").append(toIndentedString(saldoVencido)).append("\n");
    sb.append("    numeroPagosVencidos: ").append(toIndentedString(numeroPagosVencidos)).append("\n");
    sb.append("    pagoActual: ").append(toIndentedString(pagoActual)).append("\n");
    sb.append("    historicoPagos: ").append(toIndentedString(historicoPagos)).append("\n");
    sb.append("    clavePrevencion: ").append(toIndentedString(clavePrevencion)).append("\n");
    sb.append("    totalPagosReportados: ").append(toIndentedString(totalPagosReportados)).append("\n");
    sb.append("    claveAnteriorOtorgante: ").append(toIndentedString(claveAnteriorOtorgante)).append("\n");
    sb.append("    nombreAnteriorOtorgante: ").append(toIndentedString(nombreAnteriorOtorgante)).append("\n");
    sb.append("    numeroCuentaAnterior: ").append(toIndentedString(numeroCuentaAnterior)).append("\n");
    sb.append("    fechaPrimerIncumplimiento: ").append(toIndentedString(fechaPrimerIncumplimiento)).append("\n");
    sb.append("    saldoInsoluto: ").append(toIndentedString(saldoInsoluto)).append("\n");
    sb.append("    montoUltimoPago: ").append(toIndentedString(montoUltimoPago)).append("\n");
    sb.append("    fechaIngresoCarteraVencida: ").append(toIndentedString(fechaIngresoCarteraVencida)).append("\n");
    sb.append("    montoCorrespondienteIntereses: ").append(toIndentedString(montoCorrespondienteIntereses)).append("\n");
    sb.append("    formaPagoActualIntereses: ").append(toIndentedString(formaPagoActualIntereses)).append("\n");
    sb.append("    diasVencimiento: ").append(toIndentedString(diasVencimiento)).append("\n");
    sb.append("    plazoMeses: ").append(toIndentedString(plazoMeses)).append("\n");
    sb.append("    montoCreditoOriginacion: ").append(toIndentedString(montoCreditoOriginacion)).append("\n");
    sb.append("    correoElectronicoConsumidor: ").append(toIndentedString(correoElectronicoConsumidor)).append("\n");
    sb.append("    estatusCAN: ").append(toIndentedString(estatusCAN)).append("\n");
    sb.append("    ordenPrelacionOrigen: ").append(toIndentedString(ordenPrelacionOrigen)).append("\n");
    sb.append("    ordenPrelacionActual: ").append(toIndentedString(ordenPrelacionActual)).append("\n");
    sb.append("    fechaAperturaCAN: ").append(toIndentedString(fechaAperturaCAN)).append("\n");
    sb.append("    fechaCancelacionCAN: ").append(toIndentedString(fechaCancelacionCAN)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
