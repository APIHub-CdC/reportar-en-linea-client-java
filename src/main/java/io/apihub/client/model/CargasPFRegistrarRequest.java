package io.apihub.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.apihub.client.model.Encabezado;
import io.apihub.client.model.Persona;

@ApiModel(description = "Datos de la solicitud.")

public class CargasPFRegistrarRequest {
	@SerializedName("encabezado")
	private Encabezado encabezado = null;
	@SerializedName("persona")
	private Persona persona = null;

	public CargasPFRegistrarRequest encabezado(Encabezado encabezado) {
		this.encabezado = encabezado;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	public Encabezado getEncabezado() {
		return encabezado;
	}

	public void setEncabezado(Encabezado encabezado) {
		this.encabezado = encabezado;
	}

	public CargasPFRegistrarRequest persona(Persona persona) {
		this.persona = persona;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CargasPFRegistrarRequest cargasPFRegistrarRequest = (CargasPFRegistrarRequest) o;
		return Objects.equals(this.encabezado, cargasPFRegistrarRequest.encabezado)
				&& Objects.equals(this.persona, cargasPFRegistrarRequest.persona);
	}

	@Override
	public int hashCode() {
		return Objects.hash(encabezado, persona);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CargasPFRegistrarRequest {\n");

		sb.append("    encabezado: ").append(toIndentedString(encabezado)).append("\n");
		sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
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
