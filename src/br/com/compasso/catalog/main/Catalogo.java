package br.com.compasso.catalog.main;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		int controle = -1;
		Scanner sc = new Scanner(System.in);
		
//		do {
		
		System.out.println("Op��o 1: Adicionar um novo Filme");
		System.out.println("Op��o 2: Remover um Filme");
		System.out.println("Op��o 3: Editar um Filme");
		System.out.println("Op��o 4: Listar Filmes");
		System.out.println("Op��o 5: Adicionar Pessoa");
		System.out.println("Op��o 6: Remover Pessoa");
		System.out.println("Op��o 7: Editar Pessoa");
		System.out.println("================================");
		System.out.println("Entre com um n�mero entre 1 e 4:");
		
		controle = sc.nextInt();
		
		switch (controle) {
			
		  case 1:
			  System.out.println("Voc� escolheu 1");
			  
		    break;
		  case 2:
			  System.out.println("Voc� escolheu 2");
			  
		    break;
		  case 3:
			  System.out.println("Voc� escolheu 3");
			  
		    break;
		  case 4:
		       System.out.println("Voc� escolheu 4");
		       
		       break;
		  default:
		       System.out.println("N�mero inv�lido");
		  break;
		    
		}
		
		
		
		
		
//		}while(controle!=0);
}

}
