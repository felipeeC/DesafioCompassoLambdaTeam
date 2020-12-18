package br.com.compasso.catalog.models;

public class Pessoa {

	private int id;
	private String nome;
	private int idade;
	
	//Construtor
	
	public Pessoa(int id, String nome, int idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}
	
	public Pessoa() {
		super();
	}
	
	
	//Getters e Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return this.id + "\t" + this.nome + "\t\t" + this.idade;
	}
	
	//Equals

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		
		Pessoa outraPessoa = (Pessoa) obj;
		
		if(!this.nome.toUpperCase().equals(outraPessoa.nome.toUpperCase())) return false;
		if(this.idade != outraPessoa.idade) return false;
		
		return true;
		
	}	
	
}
