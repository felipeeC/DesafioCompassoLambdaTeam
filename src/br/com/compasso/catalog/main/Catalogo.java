package br.com.compasso.catalog.main;

import java.util.Scanner;

import br.com.compasso.catalog.services.FilmeService;
import br.com.compasso.catalog.services.PessoaService;

public class Catalogo {

	static int userId;

	public static void main(String[] args) {
		int controle = -1;

		Scanner sc = new Scanner(System.in);
		Scanner scId = new Scanner(System.in);
		Scanner scNome = new Scanner(System.in);
		PessoaService pessoaService = new PessoaService();
		pessoaService.adiciona("felipe", 22);
		do {
			controle = -1;
			System.out.println("Op��o 1: Fazer Login");
			System.out.println("Op��o 2: Criar nova conta");
			System.out.println("Op��o 3: Encerrar Programa");
			System.out.println("================================");
			System.out.println("Entre com um n�mero entre 1 e 3:");

			if (sc.hasNextInt()) {
				controle = sc.nextInt();
				sc.nextLine();

			} else {
				System.out.println("Op��o n�o encontrada!");
				sc.nextLine();
			}

			switch (controle) {

			case 1:
				int iD = -1;
				System.out.println("Voc� escolheu fazer login");
				System.out.println("Id      Nome         Idade");
				pessoaService.imprimeTodos().forEach(pessoa -> System.out.println(pessoa));
				System.out.println("Insira o ID do usu�rio desejado: ");
				if (scId.hasNextInt()) {
					iD = scId.nextInt();
					scId.nextLine();

					if (pessoaService.verificaById(iD)) {
						userId = iD;
						menuPrincipal();
					} else {
						System.out.println("Usu�rio n�o encontrado");
						break;
					}
				} else {
					System.out.println("n�o � int");
				}

				break;
			case 2:
				System.out.println("Voce escolheu Criar nova conta");
				System.out.println("Insira o nome: ");
				String nome = scNome.nextLine();
				System.out.println("Insira a idade: ");
				int idade = sc.nextInt();
				sc.nextLine();
				pessoaService.adiciona(nome, idade);
				System.out.println("==========================");

				break;
			case 3:
				System.out.println("Programa encerrado!");

				System.exit(0);
				break;

			default:
				System.out.println("N�mero inv�lido");
				break;

			}

		} while (controle != 0);
		
		
	}

	// ============================Methods====================

	public static void menuPrincipal() {
		int controle = -1;

		Scanner sc = new Scanner(System.in);
		FilmeService filmeService = new FilmeService();
		filmeService.adiciona("mto bom", "cyberpunk");
		do {
			System.out.println("Op��o 1: Adicionar um novo Filme"); // ok
			System.out.println("Op��o 2: Remover um Filme"); // ok
			System.out.println("Op��o 3: Listar Filmes"); //ok
			System.out.println("Op��o 5: Remover Pessoa");
			System.out.println("Op��o 6: Editar Pessoa");
			System.out.println("================================");
			System.out.println("Insira um n�mero entre 1 e 6:");

			controle = sc.nextInt();
			sc.nextLine();

			switch (controle) {

			case 1:
				String nome;
				String descricao;
				System.out.println("Voc� escolheu Adicionar um novo Filme");
				System.out.println("Insira o nome do Filme que deseja adicionar:");
				nome = sc.nextLine();
				System.out.println("Insira a descri��o do filme:");
				descricao = sc.nextLine();
				filmeService.adiciona(descricao, nome);
				System.out.println("Filme Adicionado!");
				break;
			case 2:
				int id = 0;
				System.out.println("Voc� escolheu Remover um Filme");
				filmeService.imprimeTodos().forEach(filme -> System.out.println(filme));
				System.out.println("Insira o ID que deseja remover:");
				id = sc.nextInt();
				sc.nextLine();
				
				if(filmeService.removeById(id))
				System.out.println("Filme Removido!");
				break;
			case 3:
				System.out.println("Voc� escolheu Listar Filmes");
				filmeService.imprimeTodos().forEach(filme -> System.out.println(filme));
				System.out.println("");
				break;
			case 4:
				System.out.println("");
				
				break;
			default:
				System.out.println("N�mero inv�lido");
				break;

			}

		} while (controle != 0);
	}

}
