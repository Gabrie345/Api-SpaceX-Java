package com.brq.internet.projetojspbase.service.Impl;

import java.util.List;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brq.internet.projetojspbase.DTO.InformacoesSobreFoqueteDTO;
import com.brq.internet.projetojspbase.service.ConsultaService;


@Service
public class ConsultaServiceImpl implements ConsultaService  {

	@Autowired
	private WebTarget webTarget;
	
	//Faz uma consulta e retorna uma FilmeDto com a lista de Filme.
	
	@Override
	public List<InformacoesSobreFoqueteDTO> BuscaFoquete() {
	
		Response response = webTarget.path("/rockets")
				.request()
				.get();
		return response.readEntity(new GenericType<List<InformacoesSobreFoqueteDTO>>() {});
	}

}
