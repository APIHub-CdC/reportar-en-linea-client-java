package io.apihub.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Indica el estado del procesamiento de la solicitud.")

public class Estatus {

	@SerializedName("id")
	private String id = null;

	@SerializedName("descripcion")
	private String descripcion = null;

	public Estatus id(String id) {
		this.id = id;
		return this;
	}

	@ApiModelProperty(value = "Identificador de estado de procesamiento de la solicitud.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Estatus descripcion(String descripcion) {
		this.descripcion = descripcion;
		return this;
	}

	@ApiModelProperty(value = "Estado de procesamiento de la solicitud.")
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
		Estatus estatus = (Estatus) o;
		return Objects.equals(this.id, estatus.id) && Objects.equals(this.descripcion, estatus.descripcion);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, descripcion);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Estatus {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
