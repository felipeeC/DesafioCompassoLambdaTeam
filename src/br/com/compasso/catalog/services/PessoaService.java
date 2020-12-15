package br.com.compasso.catalog.services;

import java.util.ArrayList;
import java.util.List;

import br.com.compasso.catalog.models.Pessoa;

public class PessoaService {

	private List<Pessoa> pessoas = new ArrayList<>();
	private int id = 0;

	//Métodos

	public void removeById(int idPessoa) {
		
		Pessoa pessoaRemovida = null; 
		
		for (Pessoa pessoa : pessoas) {
			if(pessoa.getId() == idPessoa) {
				pessoaRemovida = pessoa;
			}			
		}
		
		if(pessoaRemovida != null) {
			pessoas.remove(pessoaRemovida);
			System.out.println("Pessoa removida com sucesso!");
		} else {
			System.out.println("Não foi encotrada nenhuma pessoa com esse id!");
		}

	}

	public void adiciona(String nome, int idade) {
		Pessoa novaPessoa = new Pessoa(id, nome, idade);
		if(pessoas.contains(novaPessoa)) {
			System.out.println("Pessoa já existe");
		} else {
			id++;
			pessoas.add(novaPessoa);
			System.out.println("Pessoa adicionada com sucesso");
		}
	}
	
	public List<Pessoa> imprimeTodos (){
		return pessoas;
	}
	
	public List<Pessoa> imprimeByName(String nome) {
		List<Pessoa> pessoasEncontradas = new ArrayList<>();
		
		for (Pessoa pessoa : pessoas) {
			if(pessoa.getNome() == nome) {
				pessoasEncontradas.add(pessoa);
			}
		}
		
		return pessoasEncontradas;
	}

}
