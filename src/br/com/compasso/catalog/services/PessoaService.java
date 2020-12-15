package br.com.compasso.catalog.services;

import java.util.ArrayList;
import java.util.List;

import br.com.compasso.catalog.models.Filme;
import br.com.compasso.catalog.models.Pessoa;

public class PessoaService {

	private List<Pessoa> pessoas = new ArrayList<>();

	//Métodos

	public List<Pessoa> imprimeByName(String pessoa) {
		return pessoas;
	}

	public void removeById(int idPessoa, String nomePessoa) {

	}

	public void adiciona(String pessoa) {
		
	}
	
	public List<Pessoa> imprimeTodos (){
		return pessoas;
	}

}
