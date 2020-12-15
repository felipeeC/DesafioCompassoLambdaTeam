package br.com.compasso.catalog.test;

import br.com.compasso.catalog.services.PessoaService;

public class TestePessoaService {

	public static void main(String[] args) {
		
		PessoaService pessoaService = new PessoaService();
		
		pessoaService.adiciona("Guilherme", 24);
		pessoaService.adiciona("Guilherme", 24);
		pessoaService.adiciona("Guilherme", 23);
		pessoaService.adiciona("Augusto", 24);
		pessoaService.adiciona("Felipe", 23);
		pessoaService.adiciona("Adriana", 30);
		
		System.out.println();
		System.out.println("--------------");
		System.out.println("listagem de pessoas");
		System.out.println("--------------");
		
		pessoaService.imprimeTodos()
			.forEach(pessoa -> System.out.println(pessoa));
		
		System.out.println();
		System.out.println("--------------");
		System.out.println("listagem de pessoas com nome especifico");
		System.out.println("--------------");
		
		pessoaService.imprimeByName("Augusto")
			.forEach(pessoa -> System.out.println(pessoa));

		System.out.println();
		System.out.println("--------------");
		System.out.println("Deleção pelo id");
		System.out.println("--------------");
		
		pessoaService.removeById(1);
		
		pessoaService.imprimeTodos()
			.forEach(pessoa -> System.out.println(pessoa));
		
		System.out.println();
		System.out.println("--------------");
		System.out.println("Deleção pelo id (id não existente)");
		System.out.println("--------------");
		
		pessoaService.removeById(10);
		
		pessoaService.imprimeTodos()
			.forEach(pessoa -> System.out.println(pessoa));
		
	}

}
