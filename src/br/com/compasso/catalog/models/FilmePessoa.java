package br.com.compasso.catalog.models;

public class FilmePessoa {

	private Filme filme;
	private Pessoa pessoa;
	
	public FilmePessoa(Filme filme, Pessoa pessoa) {
		super();
		this.filme = filme;
		this.pessoa = pessoa;
	}
	
	//Getters e Setters

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}
