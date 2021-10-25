package com.brq.internet.projetojspbase.ViewModel.mapper;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.brq.internet.projetojspbase.DTO.InformacoesSobreFoqueteDTO;
import com.brq.internet.projetojspbase.DTO.ValorDollarDto;
import com.brq.internet.projetojspbase.ViewModel.FoqueteViewModel;
import com.brq.internet.projetojspbase.service.Impl.ConsultaServiceDollarImpl;

public class Mapper {
	

	

	public static List <FoqueteViewModel> from(List<InformacoesSobreFoqueteDTO> foquetes, ValorDollarDto buscaValorDollar) {
		
		List <FoqueteViewModel> listaDeFoquete = new ArrayList<FoqueteViewModel>();
		
		for (InformacoesSobreFoqueteDTO informacaoDTO : foquetes) {
			
			FoqueteViewModel foqueteViewModel = new FoqueteViewModel();
			
			
			foqueteViewModel.setNome(informacaoDTO.getNome());
			foqueteViewModel.setDescricao(informacaoDTO.getDescricao());
			foqueteViewModel.setListaImagens(informacaoDTO.getListaImagens());
			foqueteViewModel.setValorPorLancamento(informacaoDTO.getValorPorLancamento());
			foqueteViewModel.setDataPrimeiroVoo(informacaoDTO.getDataPrimeiroVoo());
			
			//Utiliza a Api de cotação de dollar para calcular o valor exato do dollar na hora da requição
			BigDecimal dolar=(new BigDecimal(buscaValorDollar.uSDBRL.getValorDolar()));
			BigDecimal valorEmReal = dolar.multiply(new BigDecimal (informacaoDTO.getValorPorLancamento()));
			
			foqueteViewModel.setValorPorLancamentoReal(valorEmReal);
			
			
			

			
			listaDeFoquete.add(foqueteViewModel);
		}

		
		return listaDeFoquete;


	}
}

// filmeViewModel.setTituloOriginal(filme.getTituloOriginal());