package br.com.compasso.catalog.services;

import java.util.ArrayList;
import java.util.List;

import br.com.compasso.catalog.models.Filme;
import br.com.compasso.catalog.models.FilmePessoa;
import br.com.compasso.catalog.models.Pessoa;

public class FilmePessoaService {

	private List<FilmePessoa> fp = new ArrayList<>();

	// Métodos

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
			System.out.println("Filme removido de seu catálogo!");
			return true;
		} 
		
		System.out.println("O Filme não estava em seu catálogo.");
		return false;
		
	}

	public void adiciona( int idFilme, int idPessoa) {
		
		FilmePessoa filmepessoa = new FilmePessoa(idFilme, idPessoa);
		
		if(!fp.contains(filmepessoa)) {
			fp.add(filmepessoa);
			System.out.println("Filme adicionado ao seu catálogo pessoal!");
		} else {
			System.out.println("Este filme já está em seu catálogo pessoal.");
		}
	}

}
