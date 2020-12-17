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
		inicializaPessoaService(pessoaService);
		do {
			controle = -1;
			System.out.println("================================");
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
						menuPrincipal(pessoaService);
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

	public static void menuPrincipal(PessoaService pessoaService) {
		int controle = -1;

		Scanner sc = new Scanner(System.in);
		FilmeService filmeService = new FilmeService();
		inicializaFilmeService(filmeService);
		FilmePessoaService filmePessoaService = new FilmePessoaService();
		filmePessoaService.adiciona(0, 0);
		do {

			clearConsole();
			System.out.println("================================");
			System.out.println("Op��o 1: Adicionar um novo Filme"); // ok
			System.out.println("Op��o 2: Remover um Filme"); // ok
			System.out.println("Op��o 3: Listar Todos os Filmes"); // ok
			System.out.println("Op��o 4: Excluir conta"); // ok
			System.out.println("Op��o 5: Editar Pessoa"); //
			System.out.println("Op��o 6: Adicionar Filme ao meu cat�logo"); // ok
			System.out.println("Op��o 7: Remover Filme da Minha Lista"); // ok
			System.out.println("Op��o 8: Ver a minha Lista Pessoal"); // ok
			System.out.println("================================");
			System.out.println("Insira um n�mero entre 1 e 8:");

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

				if (filmeService.removeById(id))
					System.out.println("Filme Removido!");
				break;
			case 3:
				System.out.println("Voc� escolheu Listar Filmes");
				filmeService.imprimeTodos().forEach(filme -> System.out.println(filme));
				System.out.println("");
				break;
			case 4:
				System.out.println("Voc� escolheu Excluir conta");
				pessoaService.removeById(userId);
				System.out.println("Sua conta foi Removida! Adeus!");
				controle = 0;
				break;
			case 5:
				System.out.println("Voc� escolheu Editar Pessoa");
				menuEditaPessoa(pessoaService);
				break;
			case 6:
				System.out.println("Voc� escolheu Adicionar Filme ao meu cat�logo ");
				System.out.println("Id      Nome               Descri��o");
				filmeService.imprimeTodos().forEach(filme -> System.out.println(filme));
				System.out.println("");
				System.out.println("Insira o Id do filme que deseja adicionar � lista:");
				int filmeId = sc.nextInt();
				sc.nextLine();
				filmePessoaService.adiciona(filmeId, userId);
				break;
			case 7:
				System.out.println("Voc� escolheu Remover Filme da Minha Lista");
				filmePessoaService.imprimeMeusFilmes(userId).forEach(filmePessoa -> {
					filmeService.imprimeById(filmePessoa.getIdFilme());
				});
				filmeId = sc.nextInt();
				sc.nextLine();
				filmePessoaService.removeById(filmeId, userId);

				break;
			case 8:
				System.out.println("Voc� escolheu Acessar Minha Lista de Filmes ");
				filmePessoaService.imprimeMeusFilmes(userId).forEach(filmePessoa -> {
					filmeService.imprimeById(filmePessoa.getIdFilme());
				});
				break;
			default:
				System.out.println("N�mero inv�lido");
				break;

			}

		} while (controle != 0);
	}

	public final static void clearConsole() {

		for (int i = 0; i <= 5; i++) {

			System.out.println();

		}
	}

	public static void menuEditaPessoa(PessoaService pessoaService) {
		Scanner sc = new Scanner(System.in);
		int controle;
		do {
			
			System.out.println("================================");
			System.out.println(pessoaService.findById(userId).toString());
			System.out.println("Op��o 1: Edita Nome");
			System.out.println("Op��o 2: Edita Idade");
			System.out.println("Op��o 3: Menu Anterior");
			System.out.println("================================");
			System.out.println("Entre com um n�mero entre 1 e 2:");
			controle = sc.nextInt();
			sc.nextLine();
			
			switch (controle) {

			case 1: 
				System.out.println("Voc� selecionou Editar Nome");
				System.out.println("Insira o novo nome:");
				String novoNome = sc.nextLine();
				pessoaService.editaNomePessoa(userId, novoNome);
				
				break;
			case 2:
				System.out.println("Voc� selecionou Editar Nome");
				System.out.println("Insira a nova idade:");
				int novaIdade = sc.nextInt();
				sc.nextLine();
				pessoaService.editaIdadePessoa(userId, novaIdade);
				break;
			default:
				controle = 0;
				break;
			}
			

		 

		} while (controle != 0);
		
	}

	public static void inicializaPessoaService(PessoaService pessoaService) {

		pessoaService.adiciona("Felipe", 22);
		pessoaService.adiciona("Guilherme", 23);
		pessoaService.adiciona("Augusto", 24);
		pessoaService.adiciona("Adriana", 25);
		pessoaService.adiciona("Eduardo", 26);

	}

	public static void inicializaFilmeService(FilmeService filmeService) {

		filmeService.adiciona("com�dia", "Vovozona");
		filmeService.adiciona("com�dia", "Vovozona2");
		filmeService.adiciona("anima��o", "Carros");
		filmeService.adiciona("sangue", "Vikings");
	}

}