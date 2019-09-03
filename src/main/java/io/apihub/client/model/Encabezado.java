package io.apihub.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Contiene los datos sobre el otorgante de crédito que envía la información a Círculo de Crédito.")

public class Encabezado {

	@SerializedName("claveOtorgante")
	private String claveOtorgante = null;

	@SerializedName("nombreOtorgante")
	private String nombreOtorgante = null;

	public Encabezado claveOtorgante(String claveOtorgante) {
		this.claveOtorgante = claveOtorgante;
		return this;
	}

	@ApiModelProperty(example = "0000080008", value = " Esta se constituye por posiciones:  1-6 corresponde al número del otorgante  7-10 corresponde al tipo de negocio del otorgante.  Esta clave es asignada por Círculo de Crédito.")
	public String getClaveOtorgante() {
		return claveOtorgante;
	}

	public void setClaveOtorgante(String claveOtorgante) {
		this.claveOtorgante = claveOtorgante;
	}

	public Encabezado nombreOtorgante(String nombreOtorgante) {
		this.nombreOtorgante = nombreOtorgante;
		return this;
	}

	@ApiModelProperty(example = "CIRCULO DE CREDITO", value = "Es el nombre corto con el que Círculo de Crédito denomina y entrega al usuario que reporta la información.")
	public String getNombreOtorgante() {
		return nombreOtorgante;
	}

	public void setNombreOtorgante(String nombreOtorgante) {
		this.nombreOtorgante = nombreOtorgante;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Encabezado encabezado = (Encabezado) o;
		return Objects.equals(this.claveOtorgante, encabezado.claveOtorgante)
				&& Objects.equals(this.nombreOtorgante, encabezado.nombreOtorgante);
	}

	@Override
	public int hashCode() {
		return Objects.hash(claveOtorgante, nombreOtorgante);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Encabezado {\n");

		sb.append("    claveOtorgante: ").append(toIndentedString(claveOtorgante)).append("\n");
		sb.append("    nombreOtorgante: ").append(toIndentedString(nombreOtorgante)).append("\n");
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
