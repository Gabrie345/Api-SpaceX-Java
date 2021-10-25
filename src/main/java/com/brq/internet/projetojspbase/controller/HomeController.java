package com.brq.internet.projetojspbase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.brq.internet.projetojspbase.DTO.InformacoesSobreFoqueteDTO;
import com.brq.internet.projetojspbase.DTO.ValorDollarDto;
import com.brq.internet.projetojspbase.ViewModel.FoqueteViewModel;
import com.brq.internet.projetojspbase.ViewModel.mapper.Mapper;
import com.brq.internet.projetojspbase.service.Impl.ConsultaServiceDollarImpl;
import com.brq.internet.projetojspbase.service.Impl.ConsultaServiceImpl;


@Controller
public class HomeController {

	@Autowired
	ConsultaServiceImpl consultaServiceImpl;

	@Autowired
	ConsultaServiceDollarImpl consultaServiceDollarImpl;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public ModelAndView home(ModelAndView model) {
		
		ValorDollarDto buscaValorDollar = consultaServiceDollarImpl.BuscaValorDollar();
		
		List<InformacoesSobreFoqueteDTO> foqueteDto = consultaServiceImpl.BuscaFoquete();
		List<FoqueteViewModel> listaFoquete = Mapper.from(foqueteDto, buscaValorDollar);
		
		System.out.println(buscaValorDollar.uSDBRL.valorDolar);
		model.addObject("listaFoquete", listaFoquete);
		model.setViewName("SpaceXHome");
		
		return model;

	}
}
