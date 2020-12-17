package br.com.compasso.catalog.main;

import java.util.Scanner;

import br.com.compasso.catalog.services.FilmePessoaService;
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
			System.out.println("================================");
			System.out.println("Opção 1: Fazer Login");
			System.out.println("Opção 2: Criar nova conta");
			System.out.println("Opção 3: Encerrar Programa");
			System.out.println("================================");
			System.out.println("Entre com um número entre 1 e 3:");

			if (sc.hasNextInt()) {
				controle = sc.nextInt();
				sc.nextLine();

			} else {
				System.out.println("Opção não encontrada!");
				sc.nextLine();
			}

			switch (controle) {

			case 1:
				int iD = -1;
				System.out.println("Você escolheu fazer login");
				System.out.println("Id      Nome         Idade");
				pessoaService.imprimeTodos().forEach(pessoa -> System.out.println(pessoa));
				System.out.println("Insira o ID do usuário desejado: ");
				if (scId.hasNextInt()) {
					iD = scId.nextInt();
					scId.nextLine();

					if (pessoaService.verificaById(iD)) {
						userId = iD;
						menuPrincipal();
					} else {
						System.out.println("Usuário não encontrado");
						break;
					}
				} else {
					System.out.println("não é int");
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
				System.out.println("Número inválido");
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
		FilmePessoaService filmePessoaService = new FilmePessoaService();
		filmePessoaService.adiciona(0, 0);
		PessoaService pessoaService = new PessoaService();
		do {

			clearConsole();
			System.out.println("================================");
			System.out.println("Opção 1: Adicionar um novo Filme"); // ok
			System.out.println("Opção 2: Remover um Filme"); // ok
			System.out.println("Opção 3: Listar Todos os Filmes"); // ok
			System.out.println("Opção 4: Excluir conta"); // ok
			System.out.println("Opção 5: Editar Pessoa"); // 
			System.out.println("Opção 6: Adicionar Filme ao meu catálogo"); // ok
			System.out.println("Opção 7: Remover Filme da Minha Lista"); // ok
			System.out.println("Opção 8: Ver a minha Lista Pessoal"); // ok
			System.out.println("================================");
			System.out.println("Insira um número entre 1 e 8:");

			controle = sc.nextInt();
			sc.nextLine();

			switch (controle) {

			case 1:
				String nome;
				String descricao;
				System.out.println("Você escolheu Adicionar um novo Filme");
				System.out.println("Insira o nome do Filme que deseja adicionar:");
				nome = sc.nextLine();
				System.out.println("Insira a descrição do filme:");
				descricao = sc.nextLine();
				filmeService.adiciona(descricao, nome);
				System.out.println("Filme Adicionado!");
				break;
			case 2:
				int id = 0;
				System.out.println("Você escolheu Remover um Filme");
				filmeService.imprimeTodos().forEach(filme -> System.out.println(filme));
				System.out.println("Insira o ID que deseja remover:");
				id = sc.nextInt();
				sc.nextLine();

				if (filmeService.removeById(id))
					System.out.println("Filme Removido!");
				break;
			case 3:
				System.out.println("Você escolheu Listar Filmes");
				filmeService.imprimeTodos().forEach(filme -> System.out.println(filme));
				System.out.println("");
				break;
			case 4:
				System.out.println("Você escolheu Excluir conta");
				pessoaService.removeById(userId);
				System.out.println("Sua conta foi Removida!");
				break;
			case 5:
				System.out.println(" ");

				break;
			case 6:
				System.out.println("Você escolheu Adicionar Filme ao meu catálogo ");
				System.out.println("Id      Nome               Descrição");
				filmeService.imprimeTodos().forEach(filme -> System.out.println(filme));
				System.out.println("");
				System.out.println("Insira o Id do filme que deseja adicionar à lista:");
				int filmeId = sc.nextInt();
				sc.nextLine();
				filmePessoaService.adiciona(filmeId, userId);
				break;
			case 7:
				System.out.println("Você escolheu Remover Filme da Minha Lista");
				filmePessoaService.imprimeMeusFilmes(userId).forEach(filmePessoa -> {
					filmeService.imprimeById(filmePessoa.getIdFilme());
				});
				filmeId = sc.nextInt();
				sc.nextLine();
				filmePessoaService.removeById(filmeId, userId);

				break;
			case 8:
				System.out.println("Você escolheu Acessar Minha Lista de Filmes ");
				filmePessoaService.imprimeMeusFilmes(userId).forEach(filmePessoa -> {
					filmeService.imprimeById(filmePessoa.getIdFilme());
				});
				break;
			default:
				System.out.println("Número inválido");
				break;

			}

		} while (controle != 0);
	}

	public final static void clearConsole() {

		for (int i = 0; i <= 5; i++) {

			System.out.println();

		}
	}
	
	
	
	
	
}