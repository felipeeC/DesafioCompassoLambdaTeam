package br.com.compasso.catalog.services;

import java.util.ArrayList;
import java.util.List;

import br.com.compasso.catalog.models.Filme;

public class FilmeService {

	private List<Filme> filmes = new ArrayList<>();
	private int id = 0;

	// Métodos

	public boolean imprimeByName(String nomeFilme) {
		for (Filme f : filmes) {
			if (f.getNome() == nomeFilme.toUpperCase()) {
				return true;
			}
		}

		System.out.println("Filme não encontrado");
		return false;
	}

	public boolean removeById(int idFilme) {
		for (Filme f : filmes) {
			if (f.getId() == idFilme) {
				filmes.remove(f);
				return true;
			}

		}
		System.out.println("Id não encontrado");
		return false;
	}

	public void adiciona(String descricao, String nome) {
		String nomeMaiusculo = nome.toUpperCase();
		
		if(filmes.isEmpty()) {
			Filme filme = new Filme(id, descricao, nomeMaiusculo);
			id++;
			if (descricao != null && nome != null) {
				filmes.add(filme);
				System.out.println("Filme adicionado!");
			}
		} else {
			try {
				for (Filme filme : filmes) {
					if(filme.getNome().equals(nomeMaiusculo)) {
						System.out.println("Este filme já está inserido!");
						break;
					}
					Filme filmeNovo = new Filme(id, descricao, nomeMaiusculo);
					id++;
					if (descricao != null && nome != null) {
						filmes.add(filmeNovo);
						System.out.println("Filme adicionado!");
					}
				}
			} catch (Exception e) {
				
			}
		}
		
		/*if (filmes.contains(nomeMaiusculo)) {
			System.out.println("Esse filme já existe!");
		} else {
			Filme filme = new Filme(id, descricao, nomeMaiusculo);
			id++;
			if (descricao != null && nome != null) {
				filmes.add(filme);
				System.out.println("Filme adicionado!");
			}
		}*/
	}

	public List<Filme> imprimeTodos() {
		return filmes;
	}

}