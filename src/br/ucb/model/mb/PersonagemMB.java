package br.ucb.model.mb;

import java.io.Serializable;

import br.ucb.dao.PersonagemDAO;
import br.ucb.model.Personagem;

public class PersonagemMB implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Personagem personagem;
	private PersonagemDAO personagemDAO = new PersonagemDAO();
	
	public PersonagemMB() {
		this.personagem = new Personagem();
	}
	
	public void cadastrar() {
		this.personagemDAO.cadastrar(this.personagem);
	}
	
	public void alterar() {
		this.personagemDAO.aleterar(this.personagem);
	}
	
	public void excluir() {
		this.personagemDAO.excluir(this.personagem);
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}
	
	

	
}
