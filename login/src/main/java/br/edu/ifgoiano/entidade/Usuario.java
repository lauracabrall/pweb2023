package br.edu.ifgoiano.entidade;

import java.util.Date;

public class Usuario {
	private String email;
	private String senha;
	private String nome;
	private String dataNascimento;
	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String string) {
		this.dataNascimento = string;
	}

}

