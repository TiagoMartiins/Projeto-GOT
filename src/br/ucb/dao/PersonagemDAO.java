package br.ucb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.ucb.model.Personagem;

public class PersonagemDAO {

private Connection con = ConnectionFactory.getConnection();
	
	
	/**
	 * Metodo responsavel por fazer o registro na base de dados.
	 * @param usuario objeto que sera cadastrado no banco de dados.
	 */
	public void cadastrar(Personagem personagem) {
		String sql = "insert into personagem(nome,sexo,temporadaSurgiu,temporadaMorte)values(?,?,?)";
		try(PreparedStatement preparestatement = con.prepareStatement(sql)) {
			
			preparestatement.setString(1, personagem.getNome()); //substitui o ? pelo dado do usuario
			preparestatement.setString(2, personagem.getSexo());
			preparestatement.setString(3, personagem.getTemporadaSurgiu());
			preparestatement.setString(3, personagem.getTemporadaMorreu());
			
			
			preparestatement.execute();
			preparestatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * Metodo que faz a alteração / update de um registro .
	 * @param usuario objeto que sera alterado quando esse metodo for chamado.
	 */
	public void aleterar(Personagem personagem){
		String sql = "update personagem set nome = ?, sexo = ?, temporadaSurgiu = ?, temporadaMorte where idPersonagem = ?";
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setString(1, personagem.getNome());
			preparedStatement.setString(2, personagem.getSexo());
			preparedStatement.setString(3, personagem.getTemporadaSurgiu());
			preparedStatement.setString(3, personagem.getTemporadaMorreu());
			preparedStatement.setInt(4, personagem.getId());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	public void excluir(Personagem personagem){
		String sql = "delete from personagem where idPersonagem = ?";
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setInt(1, personagem.getId());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	


}
