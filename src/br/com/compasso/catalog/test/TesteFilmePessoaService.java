package br.com.compasso.catalog.test;

import br.com.compasso.catalog.models.Filme;
import br.com.compasso.catalog.models.Pessoa;
import br.com.compasso.catalog.services.FilmePessoaService;
import br.com.compasso.catalog.services.FilmeService;
import br.com.compasso.catalog.services.PessoaService;

public class TesteFilmePessoaService {

	public static void main(String[] args) {
		
        PessoaService pessoaService = new PessoaService();
        FilmePessoaService fpService = new FilmePessoaService();
        FilmeService filmeService = new FilmeService();
        
        pessoaService.adiciona("Guilherme", 24);
        filmeService.adiciona("Teste 1", "Teste");
        fpService.adiciona(1, 1);
        
	}

}
