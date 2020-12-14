package br.com.compasso.catalog.services;

import java.util.ArrayList;
import java.util.List;

import br.com.compasso.catalog.models.Filme;
import br.com.compasso.catalog.models.FilmePessoa;
import br.com.compasso.catalog.models.Pessoa;

public class FilmePessoaService {
	
	private List<FilmePessoa> fp = new ArrayList<>();
	
	//Métodos
	
	public List<FilmePessoa> imprimeById (int idPessoa) {
		return fp;
	}
	
	public void removeById (int idPessoa, int idFilme){
		
	}
	
	public void adiciona (Pessoa pessoa, Filme filme){
		
	}
	
}
