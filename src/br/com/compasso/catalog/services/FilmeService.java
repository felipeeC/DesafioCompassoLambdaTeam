package br.com.compasso.catalog.services;

import java.util.ArrayList;
import java.util.List;

import br.com.compasso.catalog.models.Filme;

public class FilmeService {

	private List<Filme> filmes = new ArrayList<>();
	private int id = 0;

	// M�todos

	public boolean imprimeByName(String nomeFilme) {
		for (Filme f : filmes) {
			if (f.getNome() == nomeFilme) {
				return true;
			}
		}
		
		System.out.println("Filme n�o encontrado");
		return false;
	}

	public boolean removeById(int idFilme) {
		for (Filme f : filmes) {
			if (f.getId() == idFilme) {
				filmes.remove(f);
				return true;
			}

		}
		System.out.println("Id n�o encontrado");
		return false;
	}

	public void adiciona(String descricao, String nome) {
		Filme filme = new Filme(id, descricao, nome);
		id++;
		if (descricao != null && nome != null) {
			filmes.add(filme);
		}
	}

	public List<Filme> imprimeTodos() {
		return filmes;
	}

}