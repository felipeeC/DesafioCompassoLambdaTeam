package br.com.compasso.catalog.models;

public class Pessoa {

	private int id;
	private String nome;
	private int idade;
	
	//Construtor
	
	public Pessoa(String nome, int idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}
	
	public Pessoa() {
		super();
	}
	
	//Hashcode e Equals

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id != other.id)
			return false;
		return true;
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
	
	
}
