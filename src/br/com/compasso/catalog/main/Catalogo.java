package br.com.compasso.catalog.main;

import java.util.Scanner;

import br.com.compasso.catalog.services.FilmeService;

public class Catalogo {

	public static void main(String[] args) {
		int controle = -1;
		Scanner sc = new Scanner(System.in);
//		Scanner sc2 = new Scanner(System.in);
		FilmeService filmeService = new FilmeService();
		
		do {
		System.out.println("Opção 1: Adicionar um novo Filme");
		System.out.println("Opção 2: Remover um Filme");
		System.out.println("Opção 3: Editar um Filme");
		System.out.println("Opção 4: Listar Filmes");
		System.out.println("Opção 5: Adicionar Pessoa");
		System.out.println("Opção 6: Remover Pessoa");
		System.out.println("Opção 7: Editar Pessoa");
		System.out.println("================================");
		System.out.println("Entre com um número entre 1 e 7:");
		
		controle = sc.nextInt();
		sc.nextLine();
		
		switch (controle) {
			
		  case 1:
			  String nome;
			  String descricao;
			  System.out.println("Você escolheu Adicionar um novo Filme");
			  System.out.println("Insira o nome do Filme que deseja adicionar:");
			  nome =sc.nextLine();
			  System.out.println("Insira a descrição do filme:");
			  descricao = sc.nextLine();			    
			  filmeService.adiciona(descricao, nome);
			  System.out.println("Filme Adicionado!");
		    break;
		  case 2:
			  int id = 0;
			  System.out.println("Você escolheu Remover um Filme");
			  filmeService.imprimeTodos();
			  System.out.println("Insira o ID que deseja remover:");
			  id = sc.nextInt();
			  sc.nextLine();
			  filmeService.removeById(id);
			  System.out.println("Filme Removido!");
		    break;
		  case 3:
			  System.out.println("Você escolheu 3");
			  
		    break;
		  case 4:
		       System.out.println("Você escolheu 4");
		       
		       break;
		  default:
		       System.out.println("Número inválido");
		  break;
		    
		}
		
		
		
		
		
		}while(controle!=0);
}

}
