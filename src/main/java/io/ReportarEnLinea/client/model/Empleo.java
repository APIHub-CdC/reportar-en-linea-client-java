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
@ApiModel(description = "Contiene la información sobre los empleos que ha tenido el cliente.")


public class Empleo {
  @SerializedName("nombreEmpresa")
  private String nombreEmpresa = null;
  @SerializedName("direccion")
  private String direccion = null;
  @SerializedName("coloniaPoblacion")
  private String coloniaPoblacion = null;
  @SerializedName("delegacionMunicipio")
  private String delegacionMunicipio = null;
  @SerializedName("ciudad")
  private String ciudad = null;
  @SerializedName("estado")
  private String estado = null;
  @SerializedName("cp")
  private String cp = null;
  @SerializedName("numeroTelefono")
  private String numeroTelefono = null;
  @SerializedName("extension")
  private String extension = null;
  @SerializedName("fax")
  private String fax = null;
  @SerializedName("puesto")
  private String puesto = null;
  @SerializedName("fechaContratacion")
  private String fechaContratacion = null;
  @SerializedName("claveMoneda")
  private String claveMoneda = null;
  @SerializedName("salarioMensual")
  private String salarioMensual = null;
  @SerializedName("fechaUltimoDiaEmpleo")
  private String fechaUltimoDiaEmpleo = null;
  @SerializedName("fechaVerificacionEmpleo")
  private String fechaVerificacionEmpleo = null;
  @SerializedName("origenRazonSocialDomicilio")
  private String origenRazonSocialDomicilio = null;
  public Empleo nombreEmpresa(String nombreEmpresa) {
    this.nombreEmpresa = nombreEmpresa;
    return this;
  }
   
  @ApiModelProperty(example = "VTA DE TORTILLAS", value = " Debe reportarse el nombre o razón social de la empresa que emplea al cliente.  Cuando el consumidor sea trabajador independiente, no está asociado a una empresa o no cuenta con un trabajo podrá reportarse uno de los siguientes posibles valores:  Trabajador Independiente  Estudiante  Labores de Hogar  Jubilado  Desempleado  Exempleado")
  public String getNombreEmpresa() {
    return nombreEmpresa;
  }
  public void setNombreEmpresa(String nombreEmpresa) {
    this.nombreEmpresa = nombreEmpresa;
  }
  public Empleo direccion(String direccion) {
    this.direccion = direccion;
    return this;
  }
   
  @ApiModelProperty(example = "CONOCIDA S/N", value = " Reportar la dirección del empleo del cliente incluyendo nombre de la calle, número exterior y/o interior.   Deben considerarse avenida, cerrada, manzana, lote, edificio, departamento etc.   Es requerido colocar por lo menos dos cadenas de caracteres para que el registro sea válido, de lo contrario el registro será rechazado.  En caso de no contar con algún empleo, colocar la misma información de la dirección del acreditado.  Ejemplo: 'Anzures 6, Zurich SN, Calle 6'")
  public String getDireccion() {
    return direccion;
  }
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }
  public Empleo coloniaPoblacion(String coloniaPoblacion) {
    this.coloniaPoblacion = coloniaPoblacion;
    return this;
  }
   
  @ApiModelProperty(example = "CONOCIDA", value = "Reportar la colonia a la cual pertenece la dirección del empleo del cliente.")
  public String getColoniaPoblacion() {
    return coloniaPoblacion;
  }
  public void setColoniaPoblacion(String coloniaPoblacion) {
    this.coloniaPoblacion = coloniaPoblacion;
  }
  public Empleo delegacionMunicipio(String delegacionMunicipio) {
    this.delegacionMunicipio = delegacionMunicipio;
    return this;
  }
   
  @ApiModelProperty(example = "ECATEPEC", value = "Reportar la delegación a la cual pertenece la dirección de empleo del cliente.")
  public String getDelegacionMunicipio() {
    return delegacionMunicipio;
  }
  public void setDelegacionMunicipio(String delegacionMunicipio) {
    this.delegacionMunicipio = delegacionMunicipio;
  }
  public Empleo ciudad(String ciudad) {
    this.ciudad = ciudad;
    return this;
  }
   
  @ApiModelProperty(example = "ECATEPEC", value = "Reportar la ciudad a la cual pertenece la dirección de empleo del cliente.")
  public String getCiudad() {
    return ciudad;
  }
  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }
  public Empleo estado(String estado) {
    this.estado = estado;
    return this;
  }
   
  @ApiModelProperty(example = "MX", value = "")
  public String getEstado() {
    return estado;
  }
  public void setEstado(String estado) {
    this.estado = estado;
  }
  public Empleo cp(String cp) {
    this.cp = cp;
    return this;
  }
   
  @ApiModelProperty(example = "55010", value = " El código postal reportado debe estar compuesto por 5 dígitos; para que este sea válido deberá corresponder al rango que se maneja en dicho Estado.  En caso de una longitud de 4 dígitos completar con cero a la izquierda (08564)  Ver Tabla del Esquema de Carga: Rangos Códigos Postales")
  public String getCp() {
    return cp;
  }
  public void setCp(String cp) {
    this.cp = cp;
  }
  public Empleo numeroTelefono(String numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
    return this;
  }
   
  @ApiModelProperty(value = " Reportar el número telefónico de empleo del acreditado.   Cada caracter debe ser un número de 0-9, si se ingresa cualquier otro caracter el registro será rechazado.  En caso de no contar con algun empleo, colocar el mismo dato del teléfono del acreditado.")
  public String getNumeroTelefono() {
    return numeroTelefono;
  }
  public void setNumeroTelefono(String numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
  }
  public Empleo extension(String extension) {
    this.extension = extension;
    return this;
  }
   
  @ApiModelProperty(value = "Si se cuenta con la información reportar la extensión telefónica del cliente.")
  public String getExtension() {
    return extension;
  }
  public void setExtension(String extension) {
    this.extension = extension;
  }
  public Empleo fax(String fax) {
    this.fax = fax;
    return this;
  }
   
  @ApiModelProperty(value = "Mismos criterios de validación que en el elemento numeroTelefono.")
  public String getFax() {
    return fax;
  }
  public void setFax(String fax) {
    this.fax = fax;
  }
  public Empleo puesto(String puesto) {
    this.puesto = puesto;
    return this;
  }
   
  @ApiModelProperty(value = "Reportar el título o posición de empleo del acreditado, si se tiene disponible.")
  public String getPuesto() {
    return puesto;
  }
  public void setPuesto(String puesto) {
    this.puesto = puesto;
  }
  public Empleo fechaContratacion(String fechaContratacion) {
    this.fechaContratacion = fechaContratacion;
    return this;
  }
   
  @ApiModelProperty(value = "Reportar la fecha (AAAAMMDD) en la que el empleador contrató al acreditado.")
  public String getFechaContratacion() {
    return fechaContratacion;
  }
  public void setFechaContratacion(String fechaContratacion) {
    this.fechaContratacion = fechaContratacion;
  }
  public Empleo claveMoneda(String claveMoneda) {
    this.claveMoneda = claveMoneda;
    return this;
  }
   
  @ApiModelProperty(example = "MX", value = " Es el tipo de moneda que se le paga al acreditado en su empleo.  Valores para este elemento:  MX = Pesos Mexicanos  US = Dólares  UD = Unidades de Inversión  En caso de reportar salarioMensual este elemento se hace requerido.")
  public String getClaveMoneda() {
    return claveMoneda;
  }
  public void setClaveMoneda(String claveMoneda) {
    this.claveMoneda = claveMoneda;
  }
  public Empleo salarioMensual(String salarioMensual) {
    this.salarioMensual = salarioMensual;
    return this;
  }
   
  @ApiModelProperty(example = "5600", value = " Reportar el ingreso mensual del acreditado.  En caso de colocar claveMoneda este elemento es requerido.  Se aceptan números enteros y sin caracteres especiales.")
  public String getSalarioMensual() {
    return salarioMensual;
  }
  public void setSalarioMensual(String salarioMensual) {
    this.salarioMensual = salarioMensual;
  }
  public Empleo fechaUltimoDiaEmpleo(String fechaUltimoDiaEmpleo) {
    this.fechaUltimoDiaEmpleo = fechaUltimoDiaEmpleo;
    return this;
  }
   
  @ApiModelProperty(example = "20180228", value = "Debe reportarse la fecha (AAAAMMDD) del último día de trabajo en esa empresa.")
  public String getFechaUltimoDiaEmpleo() {
    return fechaUltimoDiaEmpleo;
  }
  public void setFechaUltimoDiaEmpleo(String fechaUltimoDiaEmpleo) {
    this.fechaUltimoDiaEmpleo = fechaUltimoDiaEmpleo;
  }
  public Empleo fechaVerificacionEmpleo(String fechaVerificacionEmpleo) {
    this.fechaVerificacionEmpleo = fechaVerificacionEmpleo;
    return this;
  }
   
  @ApiModelProperty(value = "Fecha en que el otorgante verificó los datos proporcionados por el Acreditado.")
  public String getFechaVerificacionEmpleo() {
    return fechaVerificacionEmpleo;
  }
  public void setFechaVerificacionEmpleo(String fechaVerificacionEmpleo) {
    this.fechaVerificacionEmpleo = fechaVerificacionEmpleo;
  }
  public Empleo origenRazonSocialDomicilio(String origenRazonSocialDomicilio) {
    this.origenRazonSocialDomicilio = origenRazonSocialDomicilio;
    return this;
  }
   
  @ApiModelProperty(value = " Debe contener el país donde se encuentra el domicilio.  Ver Esquema de Carga Anexo A: Tabla de Nacionalidades")
  public String getOrigenRazonSocialDomicilio() {
    return origenRazonSocialDomicilio;
  }
  public void setOrigenRazonSocialDomicilio(String origenRazonSocialDomicilio) {
    this.origenRazonSocialDomicilio = origenRazonSocialDomicilio;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Empleo empleo = (Empleo) o;
    return Objects.equals(this.nombreEmpresa, empleo.nombreEmpresa) &&
        Objects.equals(this.direccion, empleo.direccion) &&
        Objects.equals(this.coloniaPoblacion, empleo.coloniaPoblacion) &&
        Objects.equals(this.delegacionMunicipio, empleo.delegacionMunicipio) &&
        Objects.equals(this.ciudad, empleo.ciudad) &&
        Objects.equals(this.estado, empleo.estado) &&
        Objects.equals(this.cp, empleo.cp) &&
        Objects.equals(this.numeroTelefono, empleo.numeroTelefono) &&
        Objects.equals(this.extension, empleo.extension) &&
        Objects.equals(this.fax, empleo.fax) &&
        Objects.equals(this.puesto, empleo.puesto) &&
        Objects.equals(this.fechaContratacion, empleo.fechaContratacion) &&
        Objects.equals(this.claveMoneda, empleo.claveMoneda) &&
        Objects.equals(this.salarioMensual, empleo.salarioMensual) &&
        Objects.equals(this.fechaUltimoDiaEmpleo, empleo.fechaUltimoDiaEmpleo) &&
        Objects.equals(this.fechaVerificacionEmpleo, empleo.fechaVerificacionEmpleo) &&
        Objects.equals(this.origenRazonSocialDomicilio, empleo.origenRazonSocialDomicilio);
  }
  @Override
  public int hashCode() {
    return Objects.hash(nombreEmpresa, direccion, coloniaPoblacion, delegacionMunicipio, ciudad, estado, cp, numeroTelefono, extension, fax, puesto, fechaContratacion, claveMoneda, salarioMensual, fechaUltimoDiaEmpleo, fechaVerificacionEmpleo, origenRazonSocialDomicilio);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Empleo {\n");
    
    sb.append("    nombreEmpresa: ").append(toIndentedString(nombreEmpresa)).append("\n");
    sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
    sb.append("    coloniaPoblacion: ").append(toIndentedString(coloniaPoblacion)).append("\n");
    sb.append("    delegacionMunicipio: ").append(toIndentedString(delegacionMunicipio)).append("\n");
    sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    cp: ").append(toIndentedString(cp)).append("\n");
    sb.append("    numeroTelefono: ").append(toIndentedString(numeroTelefono)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    puesto: ").append(toIndentedString(puesto)).append("\n");
    sb.append("    fechaContratacion: ").append(toIndentedString(fechaContratacion)).append("\n");
    sb.append("    claveMoneda: ").append(toIndentedString(claveMoneda)).append("\n");
    sb.append("    salarioMensual: ").append(toIndentedString(salarioMensual)).append("\n");
    sb.append("    fechaUltimoDiaEmpleo: ").append(toIndentedString(fechaUltimoDiaEmpleo)).append("\n");
    sb.append("    fechaVerificacionEmpleo: ").append(toIndentedString(fechaVerificacionEmpleo)).append("\n");
    sb.append("    origenRazonSocialDomicilio: ").append(toIndentedString(origenRazonSocialDomicilio)).append("\n");
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
