package com.brq.internet.projetojspbase.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ValorDollarDto {

    @JsonProperty("USDBRL") 
    public UsdToBrlDto uSDBRL;

	public UsdToBrlDto getuSDBRL() {
		return uSDBRL;
	}

	public void setuSDBRL(UsdToBrlDto uSDBRL) {
		this.uSDBRL = uSDBRL;
	}
}
	