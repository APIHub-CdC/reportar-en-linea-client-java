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
@ApiModel(description = "Contiene información sobre el domicilio del acreditado.")


public class Domicilio {
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
  @SerializedName("estadoExtranjero")
  private String estadoExtranjero = null;
  @SerializedName("cp")
  private String cp = null;
  @SerializedName("fechaResidencia")
  private String fechaResidencia = null;
  @SerializedName("numeroCelular")
  private String numeroCelular = null;
  @SerializedName("numeroTelefono")
  private String numeroTelefono = null;
  @SerializedName("extension")
  private String extension = null;
  @SerializedName("fax")
  private String fax = null;
  @SerializedName("tipoDomicilio")
  private String tipoDomicilio = null;
  @SerializedName("tipoAsentamiento")
  private String tipoAsentamiento = null;
  @SerializedName("origenDomicilio")
  private String origenDomicilio = null;
  public Domicilio direccion(String direccion) {
    this.direccion = direccion;
    return this;
  }
   
  @ApiModelProperty(example = "CONOCIDA S/N", value = " Reportar la dirección del usuario incluyendo nombre de la calle, número exterior y/o interior. Deben considerarse avenida, cerrada, manzana, lote, edificio, departamento, etc.  Es requerido colocar por lo menos dos cadenas de caracteres para que el registro sea válido, de lo contrario el registro será rechazado.  Ejemplo: 'Anzures 6, Zurich SN, Calle 6'")
  public String getDireccion() {
    return direccion;
  }
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }
  public Domicilio coloniaPoblacion(String coloniaPoblacion) {
    this.coloniaPoblacion = coloniaPoblacion;
    return this;
  }
   
  @ApiModelProperty(example = "CONOCIDA", value = "Reportar la colonia a la cual pertenece la dirección del cliente.")
  public String getColoniaPoblacion() {
    return coloniaPoblacion;
  }
  public void setColoniaPoblacion(String coloniaPoblacion) {
    this.coloniaPoblacion = coloniaPoblacion;
  }
  public Domicilio delegacionMunicipio(String delegacionMunicipio) {
    this.delegacionMunicipio = delegacionMunicipio;
    return this;
  }
   
  @ApiModelProperty(example = "ECATEPEC", value = "Reportar la delegación a la cual pertenece la dirección del cliente.")
  public String getDelegacionMunicipio() {
    return delegacionMunicipio;
  }
  public void setDelegacionMunicipio(String delegacionMunicipio) {
    this.delegacionMunicipio = delegacionMunicipio;
  }
  public Domicilio ciudad(String ciudad) {
    this.ciudad = ciudad;
    return this;
  }
   
  @ApiModelProperty(example = "ECATEPEC", value = "Reportar la ciudad a la cual pertenece la dirección del cliente.")
  public String getCiudad() {
    return ciudad;
  }
  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }
  public Domicilio estado(String estado) {
    this.estado = estado;
    return this;
  }
   
  @ApiModelProperty(example = "MEX", value = "Reportar la abreviatura correspondiente. Ver en Tabla del Esquema de Carga: Estados de la República")
  public String getEstado() {
    return estado;
  }
  public void setEstado(String estado) {
    this.estado = estado;
  }
  public Domicilio estadoExtranjero(String estadoExtranjero) {
    this.estadoExtranjero = estadoExtranjero;
    return this;
  }
   
  @ApiModelProperty(value = "?")
  public String getEstadoExtranjero() {
    return estadoExtranjero;
  }
  public void setEstadoExtranjero(String estadoExtranjero) {
    this.estadoExtranjero = estadoExtranjero;
  }
  public Domicilio cp(String cp) {
    this.cp = cp;
    return this;
  }
   
  @ApiModelProperty(example = "55010", value = " El código postal reportado debe estar compuesto por 5 dígitos; para que este sea válido deberá corresponder al rango que se maneja en dicho Estado.  En caso de una longitud de 4 dígitos completar con cero a la izquierda (08564).  Ver Tabla del Esquema de Carga: Rangos Códigos Postales")
  public String getCp() {
    return cp;
  }
  public void setCp(String cp) {
    this.cp = cp;
  }
  public Domicilio fechaResidencia(String fechaResidencia) {
    this.fechaResidencia = fechaResidencia;
    return this;
  }
   
  @ApiModelProperty(value = "Debe reportarse la fecha (AAAAMMDD) desde cuando el cliente vive en la dirección reportada.")
  public String getFechaResidencia() {
    return fechaResidencia;
  }
  public void setFechaResidencia(String fechaResidencia) {
    this.fechaResidencia = fechaResidencia;
  }
  public Domicilio numeroCelular(String numeroCelular) {
    this.numeroCelular = numeroCelular;
    return this;
  }
   
  @ApiModelProperty(value = "Debe reportarse el número celular particular del cliente. Cada caracter debe ser un número de 0-9, si se ingresa cualquier otro caracter el registro será rechazado.")
  public String getNumeroCelular() {
    return numeroCelular;
  }
  public void setNumeroCelular(String numeroCelular) {
    this.numeroCelular = numeroCelular;
  }
  public Domicilio numeroTelefono(String numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
    return this;
  }
   
  @ApiModelProperty(value = "Debe reportarse el número telefónico particular del cliente. Cada caracter debe ser un número de 0-9, si se ingresa cualquier otro caracter el registro será rechazado.")
  public String getNumeroTelefono() {
    return numeroTelefono;
  }
  public void setNumeroTelefono(String numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
  }
  public Domicilio extension(String extension) {
    this.extension = extension;
    return this;
  }
   
  @ApiModelProperty(value = "?")
  public String getExtension() {
    return extension;
  }
  public void setExtension(String extension) {
    this.extension = extension;
  }
  public Domicilio fax(String fax) {
    this.fax = fax;
    return this;
  }
   
  @ApiModelProperty(value = "?")
  public String getFax() {
    return fax;
  }
  public void setFax(String fax) {
    this.fax = fax;
  }
  public Domicilio tipoDomicilio(String tipoDomicilio) {
    this.tipoDomicilio = tipoDomicilio;
    return this;
  }
   
  @ApiModelProperty(example = "C", value = " Reportar el tipo domicilio que el cliente ha indicado.  Valores para este elemento:   N = Negocio  O = Domicilio del Otorgante  C = Casa  P = Apartado Postal  E = Empleo")
  public String getTipoDomicilio() {
    return tipoDomicilio;
  }
  public void setTipoDomicilio(String tipoDomicilio) {
    this.tipoDomicilio = tipoDomicilio;
  }
  public Domicilio tipoAsentamiento(String tipoAsentamiento) {
    this.tipoAsentamiento = tipoAsentamiento;
    return this;
  }
   
  @ApiModelProperty(example = "2", value = "Para verificar los valores aceptados se debe consultar la Tabla del Esquema de Carga: Tipo de Asentamiento.")
  public String getTipoAsentamiento() {
    return tipoAsentamiento;
  }
  public void setTipoAsentamiento(String tipoAsentamiento) {
    this.tipoAsentamiento = tipoAsentamiento;
  }
  public Domicilio origenDomicilio(String origenDomicilio) {
    this.origenDomicilio = origenDomicilio;
    return this;
  }
   
  @ApiModelProperty(value = "Debe contener el país donde se encuentra el domicilio del acreditado. Ver Esquema de Carga Anexo A: Tabla de Nacionalidades")
  public String getOrigenDomicilio() {
    return origenDomicilio;
  }
  public void setOrigenDomicilio(String origenDomicilio) {
    this.origenDomicilio = origenDomicilio;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Domicilio domicilio = (Domicilio) o;
    return Objects.equals(this.direccion, domicilio.direccion) &&
        Objects.equals(this.coloniaPoblacion, domicilio.coloniaPoblacion) &&
        Objects.equals(this.delegacionMunicipio, domicilio.delegacionMunicipio) &&
        Objects.equals(this.ciudad, domicilio.ciudad) &&
        Objects.equals(this.estado, domicilio.estado) &&
        Objects.equals(this.estadoExtranjero, domicilio.estadoExtranjero) &&
        Objects.equals(this.cp, domicilio.cp) &&
        Objects.equals(this.fechaResidencia, domicilio.fechaResidencia) &&
        Objects.equals(this.numeroCelular, domicilio.numeroCelular) &&
        Objects.equals(this.numeroTelefono, domicilio.numeroTelefono) &&
        Objects.equals(this.extension, domicilio.extension) &&
        Objects.equals(this.fax, domicilio.fax) &&
        Objects.equals(this.tipoDomicilio, domicilio.tipoDomicilio) &&
        Objects.equals(this.tipoAsentamiento, domicilio.tipoAsentamiento) &&
        Objects.equals(this.origenDomicilio, domicilio.origenDomicilio);
  }
  @Override
  public int hashCode() {
    return Objects.hash(direccion, coloniaPoblacion, delegacionMunicipio, ciudad, estado, estadoExtranjero, cp, fechaResidencia, numeroCelular, numeroTelefono, extension, fax, tipoDomicilio, tipoAsentamiento, origenDomicilio);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Domicilio {\n");
    
    sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
    sb.append("    coloniaPoblacion: ").append(toIndentedString(coloniaPoblacion)).append("\n");
    sb.append("    delegacionMunicipio: ").append(toIndentedString(delegacionMunicipio)).append("\n");
    sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    estadoExtranjero: ").append(toIndentedString(estadoExtranjero)).append("\n");
    sb.append("    cp: ").append(toIndentedString(cp)).append("\n");
    sb.append("    fechaResidencia: ").append(toIndentedString(fechaResidencia)).append("\n");
    sb.append("    numeroCelular: ").append(toIndentedString(numeroCelular)).append("\n");
    sb.append("    numeroTelefono: ").append(toIndentedString(numeroTelefono)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    tipoDomicilio: ").append(toIndentedString(tipoDomicilio)).append("\n");
    sb.append("    tipoAsentamiento: ").append(toIndentedString(tipoAsentamiento)).append("\n");
    sb.append("    origenDomicilio: ").append(toIndentedString(origenDomicilio)).append("\n");
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
