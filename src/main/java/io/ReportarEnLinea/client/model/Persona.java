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
import io.ReportarEnLinea.client.model.Cuenta;
import io.ReportarEnLinea.client.model.Domicilio;
import io.ReportarEnLinea.client.model.Empleo;
import io.ReportarEnLinea.client.model.Nombre;
import java.io.IOException;
@ApiModel(description = "Contiene todos los datos del consumidor y su información crediticia.")


public class Persona {
  @SerializedName("nombre")
  private Nombre nombre = null;
  @SerializedName("domicilio")
  private Domicilio domicilio = null;
  @SerializedName("empleo")
  private Empleo empleo = null;
  @SerializedName("cuenta")
  private Cuenta cuenta = null;
  public Persona nombre(Nombre nombre) {
    this.nombre = nombre;
    return this;
  }
   
  @ApiModelProperty(required = true, value = "")
  public Nombre getNombre() {
    return nombre;
  }
  public void setNombre(Nombre nombre) {
    this.nombre = nombre;
  }
  public Persona domicilio(Domicilio domicilio) {
    this.domicilio = domicilio;
    return this;
  }
   
  @ApiModelProperty(required = true, value = "")
  public Domicilio getDomicilio() {
    return domicilio;
  }
  public void setDomicilio(Domicilio domicilio) {
    this.domicilio = domicilio;
  }
  public Persona empleo(Empleo empleo) {
    this.empleo = empleo;
    return this;
  }
   
  @ApiModelProperty(required = true, value = "")
  public Empleo getEmpleo() {
    return empleo;
  }
  public void setEmpleo(Empleo empleo) {
    this.empleo = empleo;
  }
  public Persona cuenta(Cuenta cuenta) {
    this.cuenta = cuenta;
    return this;
  }
   
  @ApiModelProperty(required = true, value = "")
  public Cuenta getCuenta() {
    return cuenta;
  }
  public void setCuenta(Cuenta cuenta) {
    this.cuenta = cuenta;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Persona persona = (Persona) o;
    return Objects.equals(this.nombre, persona.nombre) &&
        Objects.equals(this.domicilio, persona.domicilio) &&
        Objects.equals(this.empleo, persona.empleo) &&
        Objects.equals(this.cuenta, persona.cuenta);
  }
  @Override
  public int hashCode() {
    return Objects.hash(nombre, domicilio, empleo, cuenta);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Persona {\n");
    
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
    sb.append("    empleo: ").append(toIndentedString(empleo)).append("\n");
    sb.append("    cuenta: ").append(toIndentedString(cuenta)).append("\n");
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
