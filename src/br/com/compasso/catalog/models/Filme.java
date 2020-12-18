package br.com.compasso.catalog.models;

import java.util.ArrayList;
import java.util.List;

public class Filme {
	
	private int id;
	private String descricao;
	private String nome;
	private String comentario;
	private String dataLancamento; //ver datetimelocal
	private String estudio;
	private String diretor;
	private String elenco;
	
	private List<Categoria> categorias = new ArrayList<>();

	public Filme() {
		super();
		
	}

	public Filme(int id, String descricao, String nome) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.nome = nome;
		
	}
	

	//HashCode e Equals

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		
		Filme other = (Filme) obj;
		
		String nomeMaiusculo = this.nome.toUpperCase();
		String otherMaiusculo = other.nome.toUpperCase();
		
		if(!nomeMaiusculo.equals(otherMaiusculo)) return false;
		
		return true;
	}
	
	//Getters e Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getElenco() {
		return elenco;
	}

	public void setElenco(String elenco) {
		this.elenco = elenco;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	
	@Override
	public String toString() {
		return this.id + "\t" + this.nome + "\t\t" + this.descricao;
	}
	
}
