package com.brq.internet.projetojspbase.DTO;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InformacoesSobreFoqueteDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("flickr_images") 
	private List<String> ListaImagens;
		
	@JsonProperty("name") 
	private String nome;
		
	@JsonProperty("first_flight") 
	private String dataPrimeiroVoo;
		
	@JsonProperty("description") 
	private String descricao;
		
	@JsonProperty("cost_per_launch") 
	private int valorPorLancamento;

	public List<String> getListaImagens() {
		return ListaImagens;
	}

	public void setListaImagens(List<String> listaImagens) {
		ListaImagens = listaImagens;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataPrimeiroVoo() {
		return dataPrimeiroVoo;
	}

	public void setDataPrimeiroVoo(String dataPrimeiroVoo) {
		this.dataPrimeiroVoo = dataPrimeiroVoo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getValorPorLancamento() {
		return valorPorLancamento;
	}

	public void setValorPorLancamento(int valorPorLancamento) {
		this.valorPorLancamento = valorPorLancamento;
	}

	
	}

