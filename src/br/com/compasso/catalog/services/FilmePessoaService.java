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
			System.out.println("Filme e Pessoa removidos com sucesso!");
			return true;
		} 
		
		System.out.println("O Filme e a Pessoa não estavam em seu catálogo!");
		return false;
		
	}

	public void adiciona( int idFilme, int idPessoa) {
		
		FilmePessoa filmepessoa = new FilmePessoa(idFilme, idPessoa);
		
		if(!fp.contains(filmepessoa)) {
			fp.add(filmepessoa);
			System.out.println("Filme e pessoa adicionados com sucesso!");
		} else {
			System.out.println("Já existe registro para este Filme e essa Pessoa!");
		}
	}

}
