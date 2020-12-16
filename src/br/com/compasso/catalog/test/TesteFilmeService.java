package br.com.compasso.catalog.test;

import br.com.compasso.catalog.services.FilmeService;


public class TesteFilmeService {

	public static void main(String[] args) {
		
		FilmeService filmeService = new FilmeService();
		
		filmeService.adiciona("Filme Teste", "Teste");
		filmeService.adiciona("Filme Teste 2", "Teste 2");
		filmeService.adiciona("Filme Teste 3", "Teste 3");
		filmeService.adiciona("Filme Teste 4", "Teste 4");
		filmeService.adiciona("Filme Teste 5", "Teste 5");
		filmeService.adiciona("Filme Teste 6", "Teste 6");
		
		System.out.println();
		System.out.println("--------------");
		System.out.println("listagem de filmes");
		System.out.println("--------------");
		
		filmeService.imprimeTodos()
			.forEach(filme -> System.out.println(filme));
		
		System.out.println();
		System.out.println("--------------");
		System.out.println("listagem de pessoas com nome especifico");
		System.out.println("--------------");
		

		System.out.println();
		System.out.println("--------------");
		System.out.println("Deleção pelo id");
		System.out.println("--------------");
		
		filmeService.removeById(1);
		
		filmeService.imprimeTodos()
			.forEach(filme -> System.out.println(filme));
		
		System.out.println();
		System.out.println("--------------");
		System.out.println("Deleção pelo id (id não existente)");
		System.out.println("--------------");
		
		filmeService.removeById(10);
		
		filmeService.imprimeTodos()
			.forEach(filme -> System.out.println(filme));
		
	}

}
