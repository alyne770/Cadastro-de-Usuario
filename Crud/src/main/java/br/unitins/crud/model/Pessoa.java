package br.unitins.crud.model;

public class Pessoa {

	private String nome;
	private String sobrenome;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public boolean isBlank() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
