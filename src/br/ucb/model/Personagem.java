package br.ucb.model;

import java.io.Serializable;

public class Personagem implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nome;
	private String sexo;
	private String temporadaSurgiu;
	private String temporadaMorreu;
	
	public Personagem() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTemporadaSurgiu() {
		return temporadaSurgiu;
	}

	public void setTemporadaSurgiu(String temporadaSurgiu) {
		this.temporadaSurgiu = temporadaSurgiu;
	}

	public String getTemporadaMorreu() {
		return temporadaMorreu;
	}

	public void setTemporadaMorreu(String temporadaMorreu) {
		this.temporadaMorreu = temporadaMorreu;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
