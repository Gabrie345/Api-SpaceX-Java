package com.brq.internet.projetojspbase.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.brq.internet.projetojspbase.DTO.InformacoesSobreFoqueteDTO;
import com.brq.internet.projetojspbase.DTO.ValorDollarDto;

@Service
public interface ConsultaService {
	
	//Essa Interface especificar o comportamento que a ConsultaService deve implementar.
	public List<InformacoesSobreFoqueteDTO>  BuscaFoquete();
	
	
}



