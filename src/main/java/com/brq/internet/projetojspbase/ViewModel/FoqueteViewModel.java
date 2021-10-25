package com.brq.internet.projetojspbase.ViewModel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class FoqueteViewModel implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> ListaImagens;
	private String nome;
	private String dataPrimeiroVoo;
	private String descricao;
	private int valorPorLancamento;
	private BigDecimal valorPorLancamentoReal;

	

	public BigDecimal getValorPorLancamentoReal() {
		return valorPorLancamentoReal;
	}
	public void setValorPorLancamentoReal(BigDecimal valorPorLancamentoReal) {
		this.valorPorLancamentoReal = valorPorLancamentoReal;
	}
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
