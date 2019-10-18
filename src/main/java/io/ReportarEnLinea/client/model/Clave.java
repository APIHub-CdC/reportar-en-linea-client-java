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
@ApiModel(description = "Indica el motivo de advertencia o rechazo del registro de cuenta")


public class Clave {
  @SerializedName("clave")
  private String clave = null;
  @SerializedName("descripcion")
  private String descripcion = null;
  public Clave clave(String clave) {
    this.clave = clave;
    return this;
  }
   
  @ApiModelProperty(value = "Clave del motivo de advertencia o rechazo del registro de cuenta")
  public String getClave() {
    return clave;
  }
  public void setClave(String clave) {
    this.clave = clave;
  }
  public Clave descripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }
   
  @ApiModelProperty(value = "Motivo de advertencia o rechazo del registro de cuenta")
  public String getDescripcion() {
    return descripcion;
  }
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Clave clave = (Clave) o;
    return Objects.equals(this.clave, clave.clave) &&
        Objects.equals(this.descripcion, clave.descripcion);
  }
  @Override
  public int hashCode() {
    return Objects.hash(clave, descripcion);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Clave {\n");
    
    sb.append("    clave: ").append(toIndentedString(clave)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
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
