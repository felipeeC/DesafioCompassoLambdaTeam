package br.com.compasso.catalog.services;

import java.util.ArrayList;
import java.util.List;
import br.com.compasso.catalog.models.Filme;
import br.com.compasso.catalog.models.Pessoa;

public class FilmeService {

	private List<Filme> filmes = new ArrayList<>();

	// Métodos

	public List<Filme> imprimeByName(String filme) {
		return filmes;
	}

	public void removeById(int idFilme) {

	}

	public void adiciona(String filme, int id) {

	}
	
	public List<Filme> imprimeTodos (){
		return filmes;
	}

}