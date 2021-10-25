package com.brq.internet.projetojspbase.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UsdToBrlDto {

	@JsonProperty("bid") 
	public String valorDolar;

	public String getValorDolar() {
		return valorDolar;
	}

	public void setValorDolar(String valorDolar) {
		this.valorDolar = valorDolar;
	}

}
