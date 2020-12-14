package br.com.compasso.catalog.models;

public class Categoria {
	
	private Tipo genero;
	private String descricao;
	private boolean lancamento;
	private int ano;
	
	//Construtor
	
	public Categoria(Tipo genero, String descricao, boolean lancamento, int ano) {
		super();
		this.genero = genero;
		this.descricao = descricao;
		this.lancamento = lancamento;
		this.ano = ano;
	}
	
	//Getters e Setters
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isLancamento() {
		return lancamento;
	}
	public void setLancamento(boolean lancamento) {
		this.lancamento = lancamento;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
