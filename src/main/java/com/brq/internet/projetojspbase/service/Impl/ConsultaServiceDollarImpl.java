package com.brq.internet.projetojspbase.service.Impl;

import javax.ws.rs.client.WebTarget;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brq.internet.projetojspbase.DTO.ValorDollarDto;

import com.brq.internet.projetojspbase.service.ConsultaServiceDollar;

@Service
public class ConsultaServiceDollarImpl implements ConsultaServiceDollar {

	@Autowired
	public WebTarget webTargetCotacao;

	public ValorDollarDto BuscaValorDollar() {

		Response response = webTargetCotacao.path("/USD-BRL").request().get();

		return response.readEntity(ValorDollarDto.class);

	}

}
