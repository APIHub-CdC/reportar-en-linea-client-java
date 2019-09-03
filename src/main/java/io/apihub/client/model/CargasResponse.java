package io.apihub.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.apihub.client.model.Estatus;

public class CargasResponse {
	@SerializedName("estatus")
	private Estatus estatus = null;

	public CargasResponse estatus(Estatus estatus) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CargasResponse cargasResponse = (CargasResponse) o;
		return Objects.equals(this.estatus, cargasResponse.estatus);
	}

	@Override
	public int hashCode() {
		return Objects.hash(estatus);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CargasResponse {\n");

		sb.append("    estatus: ").append(toIndentedString(estatus)).append("\n");
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
