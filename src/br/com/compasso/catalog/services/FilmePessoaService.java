package br.com.compasso.catalog.services;

import java.util.ArrayList;
import java.util.List;

import br.com.compasso.catalog.models.Filme;
import br.com.compasso.catalog.models.FilmePessoa;
import br.com.compasso.catalog.models.Pessoa;

public class FilmePessoaService {

	private List<FilmePessoa> fp = new ArrayList<>();

	// Métodos

	public List<FilmePessoa> imprimeById(int idPessoa) {
		return fp;
	}

	public boolean removeById(int idPessoa, int idFilme) {
		
		for (FilmePessoa filmePessoa : fp) {
			if(filmePessoa.getIdFilme() == idFilme && filmePessoa.getIdPessoa() == idPessoa) {
				fp.remove(filmePessoa);
				System.out.println("Filme removido com sucesso!");
				return true;
			}
		}
		
		System.out.println("O filme não estava em seu catálogo!");
		return false;
	}

	public void adiciona( int idFilme, int idPessoa) {
		
		FilmePessoa filmepessoa = new FilmePessoa(idFilme, idPessoa);
		
		if(!fp.contains(filmepessoa)) {
			fp.add(filmepessoa);
			System.out.println("FilmePessoa adicionado com sucesso!");
		} else {
			System.out.println("Já existe registro para este Filme e esta Pessoa!");
		}
	}

}
