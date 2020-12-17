package br.com.compasso.catalog.services;

import java.util.ArrayList;
import java.util.List;

import br.com.compasso.catalog.models.Pessoa;

public class PessoaService {

	private List<Pessoa> pessoas = new ArrayList<>();
	private int id = 0;

	//Métodos

	public void removeById(int idPessoa) {
		
		Pessoa pessoaRemovida = this.findById(idPessoa);
		
		if(pessoaRemovida != null) {
			pessoas.remove(pessoaRemovida);
			System.out.println("Pessoa removida com sucesso!");
		} else {
			System.out.println("Não foi encotrada nenhuma pessoa com esse id!");
		}

	}
	
	public void editaNomePessoa(int idPessoa, String novoNome) {
		
		if(novoNome != null && novoNome != "") {			
			Pessoa pessoaEditada = this.findById(idPessoa);
			
			if(pessoaEditada != null) {
				pessoaEditada.setNome(novoNome);
				System.out.println("Pessoa editada com sucesso!");
			} else {
				System.out.println("Pessoa não encontrada!");
			}
		} else {
			System.out.println("Nome inválido!");
		}
		
		
	}
	
	public void editaIdadePessoa(int idPessoa, int novaIdade) {
		if(novaIdade > 0) {
			Pessoa pessoaEditada = this.findById(idPessoa);
			if(pessoaEditada != null) {
				pessoaEditada.setIdade(novaIdade);
				System.out.println("Pessoa editada com sucesso");
			} else {
				System.out.println("Pessoa não encontrada!");
			}
		} else {
			System.out.println("Idade inválida!");
		}
		
		
	}

	public void adiciona(String nome, int idade) {
		Pessoa novaPessoa = new Pessoa(id, nome, idade);
		
		if(pessoas.contains(novaPessoa)) {
			System.out.println("Pessoa já existe");
		} else {
			id++;
			pessoas.add(novaPessoa);
			System.out.println("Pessoa adicionada com sucesso!");
		}
	}
	
	public List<Pessoa> imprimeTodos (){
		return pessoas;
	}
	
	public Pessoa findById(int idPessoa) {
		Pessoa pessoaEncontrada = null;
		
		for (Pessoa pessoa : pessoas) {
			if(pessoa.getId() == idPessoa) {
				pessoaEncontrada = pessoa;
			}
		}
		
		return pessoaEncontrada;
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
	
	public boolean verificaById(int id) {
		for (Pessoa pessoa : pessoas) {
			if(pessoa.getId() == id) return true;
		}
		return false;
	}

}
