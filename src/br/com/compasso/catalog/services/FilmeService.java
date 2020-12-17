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
			if (f.getNome() == nomeFilme.toUpperCase()) {
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
		String nomeMaiusculo = nome.toUpperCase();
		if (filmes.contains(nomeMaiusculo)) {
			System.out.println("Esse filme j� existe!");
		} else {
			Filme filme = new Filme(id, descricao, nomeMaiusculo);
			id++;
			if (descricao != null && nome != null) {
				filmes.add(filme);
				System.out.println("Filme adicionado!");
			}
		}
	}

	public List<Filme> imprimeTodos() {
		return filmes;
	}

}