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
import io.ReportarEnLinea.client.model.Clave;
import io.ReportarEnLinea.client.model.Estatus;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CargasPFRegistrarResponse {
  @SerializedName("estatus")
  private Estatus estatus = null;
  @SerializedName("advertencias")
  private List<Clave> advertencias = null;
  @SerializedName("rechazos")
  private List<Clave> rechazos = null;
  public CargasPFRegistrarResponse estatus(Estatus estatus) {
    this.estatus = estatus;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Estatus getEstatus() {
    return estatus;
  }
  public void setEstatus(Estatus estatus) {
    this.estatus = estatus;
  }
  public CargasPFRegistrarResponse advertencias(List<Clave> advertencias) {
    this.advertencias = advertencias;
    return this;
  }
  public CargasPFRegistrarResponse addAdvertenciasItem(Clave advertenciasItem) {
    if (this.advertencias == null) {
      this.advertencias = new ArrayList<Clave>();
    }
    this.advertencias.add(advertenciasItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<Clave> getAdvertencias() {
    return advertencias;
  }
  public void setAdvertencias(List<Clave> advertencias) {
    this.advertencias = advertencias;
  }
  public CargasPFRegistrarResponse rechazos(List<Clave> rechazos) {
    this.rechazos = rechazos;
    return this;
  }
  public CargasPFRegistrarResponse addRechazosItem(Clave rechazosItem) {
    if (this.rechazos == null) {
      this.rechazos = new ArrayList<Clave>();
    }
    this.rechazos.add(rechazosItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<Clave> getRechazos() {
    return rechazos;
  }
  public void setRechazos(List<Clave> rechazos) {
    this.rechazos = rechazos;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CargasPFRegistrarResponse cargasPFRegistrarResponse = (CargasPFRegistrarResponse) o;
    return Objects.equals(this.estatus, cargasPFRegistrarResponse.estatus) &&
        Objects.equals(this.advertencias, cargasPFRegistrarResponse.advertencias) &&
        Objects.equals(this.rechazos, cargasPFRegistrarResponse.rechazos);
  }
  @Override
  public int hashCode() {
    return Objects.hash(estatus, advertencias, rechazos);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CargasPFRegistrarResponse {\n");
    
    sb.append("    estatus: ").append(toIndentedString(estatus)).append("\n");
    sb.append("    advertencias: ").append(toIndentedString(advertencias)).append("\n");
    sb.append("    rechazos: ").append(toIndentedString(rechazos)).append("\n");
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
