package br.com.compasso.catalog.main;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		int controle = -1;
		Scanner sc = new Scanner(System.in);
		
//		do {
		
		System.out.println("Opção 1: Adicionar um novo Filme");
		System.out.println("Opção 2: Remover um Filme");
		System.out.println("Opção 3: Editar um Filme");
		System.out.println("Opção 4: Listar Filmes");
		System.out.println("Opção 5: Adicionar Pessoa");
		System.out.println("Opção 6: Remover Pessoa");
		System.out.println("Opção 7: Editar Pessoa");
		System.out.println("================================");
		System.out.println("Entre com um número entre 1 e 4:");
		
		controle = sc.nextInt();
		
		switch (controle) {
			
		  case 1:
			  System.out.println("Você escolheu 1");
			  
		    break;
		  case 2:
			  System.out.println("Você escolheu 2");
			  
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
		
		
		
		
		
//		}while(controle!=0);
}

}
