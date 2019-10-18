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
@ApiModel(description = "Contiene todos los datos personales del cliente.")


public class Nombre {
  @SerializedName("apellidoPaterno")
  private String apellidoPaterno = null;
  @SerializedName("apellidoMaterno")
  private String apellidoMaterno = null;
  @SerializedName("apellidoAdicional")
  private String apellidoAdicional = null;
  @SerializedName("nombres")
  private String nombres = null;
  @SerializedName("fechaNacimiento")
  private String fechaNacimiento = null;
  @SerializedName("rfc")
  private String rfc = null;
  @SerializedName("curp")
  private String curp = null;
  @SerializedName("numeroSeguridadSocial")
  private String numeroSeguridadSocial = null;
  @SerializedName("nacionalidad")
  private String nacionalidad = null;
  @SerializedName("residencia")
  private String residencia = null;
  @SerializedName("numeroLicenciaConducir")
  private String numeroLicenciaConducir = null;
  @SerializedName("estadoCivil")
  private String estadoCivil = null;
  @SerializedName("sexo")
  private String sexo = null;
  @SerializedName("claveElectorIFE")
  private String claveElectorIFE = null;
  @SerializedName("numeroDependientes")
  private String numeroDependientes = null;
  @SerializedName("fechaDefuncion")
  private String fechaDefuncion = null;
  @SerializedName("tipoPersona")
  private String tipoPersona = null;
  @SerializedName("indicadorDefuncion")
  private String indicadorDefuncion = null;
  public Nombre apellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
    return this;
  }
   
  @ApiModelProperty(example = "SANTOS", value = " Apellido paterno completo del cliente.  No usar abreviaturas, iniciales y/o puntos.")
  public String getApellidoPaterno() {
    return apellidoPaterno;
  }
  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }
  public Nombre apellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
    return this;
  }
   
  @ApiModelProperty(example = "MARTINEZ", value = "Si el cliente solo tiene un apellido, este debe ser colocado en apellidoPaterno y el apellido materno debe ser reportado como: 'NO PROPORCIONADO'")
  public String getApellidoMaterno() {
    return apellidoMaterno;
  }
  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }
  public Nombre apellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
    return this;
  }
   
  @ApiModelProperty(value = "Se debe utilizar para reportar el apellido de casada.")
  public String getApellidoAdicional() {
    return apellidoAdicional;
  }
  public void setApellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
  }
  public Nombre nombres(String nombres) {
    this.nombres = nombres;
    return this;
  }
   
  @ApiModelProperty(example = "LAURA", value = " Reportar el nombre completo del usuario (primer nombre, segundo nombre y/o nombres compuestos)  No usar abreviaturas, iniciales, acentos y/o puntos.")
  public String getNombres() {
    return nombres;
  }
  public void setNombres(String nombres) {
    this.nombres = nombres;
  }
  public Nombre fechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }
   
  @ApiModelProperty(example = "19860627", value = " Reportar la fecha de nacimiento (AAAAMMDD) del cliente.  En caso de cliente extranjero también debe reportarse.  Nota: No se deben reportar fechas de nacimiento menores de 15 años y mayores de 100 años.")
  public String getFechaNacimiento() {
    return fechaNacimiento;
  }
  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }
  public Nombre rfc(String rfc) {
    this.rfc = rfc;
    return this;
  }
   
  @ApiModelProperty(example = "SAML860627", value = " Reglas:  Las primeras 4 posiciones deben ser alfabéticas.  5 y 6 deben contener un número entre 00 y 99  7 y 8 deben contener un número entre 01 a 12  9 y 10 deben contener un número entre 01 a 31  11 -13 homoclave (opcional)  Los RFC´s de personas extranjeras  deben cumplir con las características arriba mencionadas.")
  public String getRfc() {
    return rfc;
  }
  public void setRfc(String rfc) {
    this.rfc = rfc;
  }
  public Nombre curp(String curp) {
    this.curp = curp;
    return this;
  }
   
  @ApiModelProperty(example = "SAML860627MOCNSB02", value = " Reglas:  4 posiciones deben ser alfabéticas.  5 y 6 posiciones deben contener un número entre 00 y 99 (año).  7 y 8 posiciones deben contener un número entre 01 y 12 (mes).  9 y 10 posiciones deben contener un número entre 01 y  31 (día).  11-16 posiciones deben ser alfabéticas.  17 alfanumérico (homoclave).  18 numérico (dígito verificador).")
  public String getCurp() {
    return curp;
  }
  public void setCurp(String curp) {
    this.curp = curp;
  }
  public Nombre numeroSeguridadSocial(String numeroSeguridadSocial) {
    this.numeroSeguridadSocial = numeroSeguridadSocial;
    return this;
  }
   
  @ApiModelProperty(value = "Reportar el número con el que el cliente se encuentra afiliado a una institución de seguro social.")
  public String getNumeroSeguridadSocial() {
    return numeroSeguridadSocial;
  }
  public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
    this.numeroSeguridadSocial = numeroSeguridadSocial;
  }
  public Nombre nacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
    return this;
  }
   
  @ApiModelProperty(example = "MX", value = " Reportar la clave de la nacionalidad del cliente, los valores posibles se obtendrán del Esquema de Carga Anexo A: Tabla de Nacionalidades")
  public String getNacionalidad() {
    return nacionalidad;
  }
  public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
  }
  public Nombre residencia(String residencia) {
    this.residencia = residencia;
    return this;
  }
   
  @ApiModelProperty(example = "1", value = " Se describe la situación de la vivienda del cliente, los valores permitidos son:  1 = Propietario  2 = Renta  3 = Vive con familiares  4 = Vivienda hipotecada  5 = No disponible")
  public String getResidencia() {
    return residencia;
  }
  public void setResidencia(String residencia) {
    this.residencia = residencia;
  }
  public Nombre numeroLicenciaConducir(String numeroLicenciaConducir) {
    this.numeroLicenciaConducir = numeroLicenciaConducir;
    return this;
  }
   
  @ApiModelProperty(value = "Colocar el número de licencia de conducir del cliente.")
  public String getNumeroLicenciaConducir() {
    return numeroLicenciaConducir;
  }
  public void setNumeroLicenciaConducir(String numeroLicenciaConducir) {
    this.numeroLicenciaConducir = numeroLicenciaConducir;
  }
  public Nombre estadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
    return this;
  }
   
  @ApiModelProperty(example = "S", value = " Reportar el estado civil del cliente.  Posibles valores para este elemento:  D = Divorciado  L = Unión Libre   C = Casado  S = Soltero  V = Viudo  E = Separado")
  public String getEstadoCivil() {
    return estadoCivil;
  }
  public void setEstadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
  }
  public Nombre sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }
   
  @ApiModelProperty(example = "F", value = " Reportar uno de los valores permitidos para este elemento:  F = Femenino  M = Masculino")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }
  public Nombre claveElectorIFE(String claveElectorIFE) {
    this.claveElectorIFE = claveElectorIFE;
    return this;
  }
   
  @ApiModelProperty(value = "Reportar la clave que se encuentra ubicada en la parte posterior de la credencial, a un costado izquierdo o en la nueva versión aparecen los números marcados.")
  public String getClaveElectorIFE() {
    return claveElectorIFE;
  }
  public void setClaveElectorIFE(String claveElectorIFE) {
    this.claveElectorIFE = claveElectorIFE;
  }
  public Nombre numeroDependientes(String numeroDependientes) {
    this.numeroDependientes = numeroDependientes;
    return this;
  }
   
  @ApiModelProperty(value = "Reportar el número de dependientes económicos del cliente.")
  public String getNumeroDependientes() {
    return numeroDependientes;
  }
  public void setNumeroDependientes(String numeroDependientes) {
    this.numeroDependientes = numeroDependientes;
  }
  public Nombre fechaDefuncion(String fechaDefuncion) {
    this.fechaDefuncion = fechaDefuncion;
    return this;
  }
   
  @ApiModelProperty(value = " Reportar la fecha en que el cliente falleció.  La fecha reportada debe ser mayor o igual a la fecha de apertura.")
  public String getFechaDefuncion() {
    return fechaDefuncion;
  }
  public void setFechaDefuncion(String fechaDefuncion) {
    this.fechaDefuncion = fechaDefuncion;
  }
  public Nombre tipoPersona(String tipoPersona) {
    this.tipoPersona = tipoPersona;
    return this;
  }
   
  @ApiModelProperty(example = "PF", value = " Valores posibles para este elemento:  PF = Persona Física.")
  public String getTipoPersona() {
    return tipoPersona;
  }
  public void setTipoPersona(String tipoPersona) {
    this.tipoPersona = tipoPersona;
  }
  public Nombre indicadorDefuncion(String indicadorDefuncion) {
    this.indicadorDefuncion = indicadorDefuncion;
    return this;
  }
   
  @ApiModelProperty(value = "Si el cliente falleció pero no se conoce la fecha debe reportarse una Y.")
  public String getIndicadorDefuncion() {
    return indicadorDefuncion;
  }
  public void setIndicadorDefuncion(String indicadorDefuncion) {
    this.indicadorDefuncion = indicadorDefuncion;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Nombre nombre = (Nombre) o;
    return Objects.equals(this.apellidoPaterno, nombre.apellidoPaterno) &&
        Objects.equals(this.apellidoMaterno, nombre.apellidoMaterno) &&
        Objects.equals(this.apellidoAdicional, nombre.apellidoAdicional) &&
        Objects.equals(this.nombres, nombre.nombres) &&
        Objects.equals(this.fechaNacimiento, nombre.fechaNacimiento) &&
        Objects.equals(this.rfc, nombre.rfc) &&
        Objects.equals(this.curp, nombre.curp) &&
        Objects.equals(this.numeroSeguridadSocial, nombre.numeroSeguridadSocial) &&
        Objects.equals(this.nacionalidad, nombre.nacionalidad) &&
        Objects.equals(this.residencia, nombre.residencia) &&
        Objects.equals(this.numeroLicenciaConducir, nombre.numeroLicenciaConducir) &&
        Objects.equals(this.estadoCivil, nombre.estadoCivil) &&
        Objects.equals(this.sexo, nombre.sexo) &&
        Objects.equals(this.claveElectorIFE, nombre.claveElectorIFE) &&
        Objects.equals(this.numeroDependientes, nombre.numeroDependientes) &&
        Objects.equals(this.fechaDefuncion, nombre.fechaDefuncion) &&
        Objects.equals(this.tipoPersona, nombre.tipoPersona) &&
        Objects.equals(this.indicadorDefuncion, nombre.indicadorDefuncion);
  }
  @Override
  public int hashCode() {
    return Objects.hash(apellidoPaterno, apellidoMaterno, apellidoAdicional, nombres, fechaNacimiento, rfc, curp, numeroSeguridadSocial, nacionalidad, residencia, numeroLicenciaConducir, estadoCivil, sexo, claveElectorIFE, numeroDependientes, fechaDefuncion, tipoPersona, indicadorDefuncion);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Nombre {\n");
    
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("    apellidoAdicional: ").append(toIndentedString(apellidoAdicional)).append("\n");
    sb.append("    nombres: ").append(toIndentedString(nombres)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    rfc: ").append(toIndentedString(rfc)).append("\n");
    sb.append("    curp: ").append(toIndentedString(curp)).append("\n");
    sb.append("    numeroSeguridadSocial: ").append(toIndentedString(numeroSeguridadSocial)).append("\n");
    sb.append("    nacionalidad: ").append(toIndentedString(nacionalidad)).append("\n");
    sb.append("    residencia: ").append(toIndentedString(residencia)).append("\n");
    sb.append("    numeroLicenciaConducir: ").append(toIndentedString(numeroLicenciaConducir)).append("\n");
    sb.append("    estadoCivil: ").append(toIndentedString(estadoCivil)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    claveElectorIFE: ").append(toIndentedString(claveElectorIFE)).append("\n");
    sb.append("    numeroDependientes: ").append(toIndentedString(numeroDependientes)).append("\n");
    sb.append("    fechaDefuncion: ").append(toIndentedString(fechaDefuncion)).append("\n");
    sb.append("    tipoPersona: ").append(toIndentedString(tipoPersona)).append("\n");
    sb.append("    indicadorDefuncion: ").append(toIndentedString(indicadorDefuncion)).append("\n");
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
