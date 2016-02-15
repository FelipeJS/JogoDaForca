package br.com.jogodaforca.test;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import br.com.jogodaforca.dao.Conexao;

public class ConexaoTest {
	@SuppressWarnings("unused")
	@Test
	public void conectar() {
		try {
			Connection conexao = Conexao.conectar();
			System.out.println("Conex�o realizada com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Conex�o falhou!!");
		}
	}
}
