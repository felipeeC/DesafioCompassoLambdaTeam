package br.com.compasso.catalog.services;

import java.util.ArrayList;
import java.util.List;

import br.com.compasso.catalog.models.Filme;
import br.com.compasso.catalog.models.FilmePessoa;
import br.com.compasso.catalog.models.Pessoa;

public class FilmePessoaService {

	private List<FilmePessoa> fp = new ArrayList<>();

	// M�todos

	public List<FilmePessoa> imprimeMeusFilmes(int idPessoa) {
		List<FilmePessoa> meusFilmes = new ArrayList<>();
		for (FilmePessoa filmePessoa : fp) {
			if(filmePessoa.getIdPessoa() == idPessoa) {
				meusFilmes.add(filmePessoa);
			}
		}
		
		return meusFilmes;
	}

	public boolean removeById(int idFilme, int idPessoa) {
		
		FilmePessoa filmepessoa = new FilmePessoa(idFilme, idPessoa);
		
		if(fp.contains(filmepessoa)) {
			fp.remove(filmepessoa);
			System.out.println("Filme removido de seu cat�logo!");
			return true;
		} 
		
		System.out.println("O Filme n�o estava em seu cat�logo.");
		return false;
		
	}

	public void adiciona( int idFilme, int idPessoa) {
		
		FilmePessoa filmepessoa = new FilmePessoa(idFilme, idPessoa);
		
		if(!fp.contains(filmepessoa)) {
			fp.add(filmepessoa);
			System.out.println("Filme adicionado ao seu cat�logo pessoal!");
		} else {
			System.out.println("Este filme j� est� em seu cat�logo pessoal.");
		}
	}

}
