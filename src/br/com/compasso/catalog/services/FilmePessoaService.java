package br.com.compasso.catalog.services;

import java.util.ArrayList;
import java.util.List;

import br.com.compasso.catalog.models.Filme;
import br.com.compasso.catalog.models.FilmePessoa;
import br.com.compasso.catalog.models.Pessoa;

public class FilmePessoaService {

	private List<FilmePessoa> fp = new ArrayList<>();

	// Métodos

	public List<FilmePessoa> imprimeTodos(int idFilme, int idPessoa) {
		return fp;
	}

	public boolean removeById(int idFilme, int idPessoa) {
		
		FilmePessoa filmepessoa = new FilmePessoa(idFilme, idPessoa);
		
		if(fp.contains(filmepessoa)) {
			fp.remove(filmepessoa);
			System.out.println("FilmePessoa removido com sucesso!");
			return true;
		} 
		
		System.out.println("O FilmePessoa não estava em seu catálogo!");
		return false;
		
	}

	public void adiciona( int idFilme, int idPessoa) {
		
		FilmePessoa filmepessoa = new FilmePessoa(idFilme, idPessoa);
		
		if(!fp.contains(filmepessoa)) {
			fp.add(filmepessoa);
			System.out.println("FilmePessoa adicionado com sucesso!");
		} else {
			System.out.println("Já existe registro para este FilmePessoa!");
		}
	}

}
