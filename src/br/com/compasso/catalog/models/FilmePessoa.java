package br.com.compasso.catalog.models;

public class FilmePessoa {

	private int idFilme;
	private int idPessoa;
	
	public FilmePessoa(int idFilme, int idPessoa) {
		this.idFilme = idFilme;
		this.idPessoa = idPessoa;
	}
	
	//Getters e Setters

	public int getIdFilme() {
		return idFilme;
	}

	public void setIdFilme(int idFilme) {
		this.idFilme = idFilme;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	
	
	//Equals
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		
		FilmePessoa outraRef = (FilmePessoa) obj;
		
		if(this.idFilme != outraRef.idFilme) return false;
		if(this.idPessoa != outraRef.idPessoa) return false;
		
		return true;
	}

}
