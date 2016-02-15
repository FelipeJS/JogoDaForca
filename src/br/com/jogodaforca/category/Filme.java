package br.com.jogodaforca.category;

import java.util.Arrays;
import java.util.Iterator;

import br.com.jogodaforca.dao.PalavraDAO;
import br.com.jogodaforca.interfaces.PalavraIterator;
import br.com.jogodaforca.model.Palavra;

//Classe que utiliza o DAO e verifica se a categoria é filme e retorna o iterator
public class Filme implements PalavraIterator {
	private Palavra[] filmes = new Palavra[2];
	private Palavra palavra = new Palavra();
	private PalavraDAO dao = new PalavraDAO();
	private int contador = 0;

	// Quantidade de palavras no banco de dados + 1
	private int qntDePalavrasBD = 7;

	public Filme() {
		for (int i = 1; i < qntDePalavrasBD; i++) {
			palavra.setCodigo(i);
			try {
				Palavra palavraRetorno = dao.buscarPalavra(palavra);

				if (palavraRetorno.getCategoria().toLowerCase().equals("filme")) {
					filmes[contador++] = palavraRetorno;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public Iterator<Palavra> createIterator() {
		return Arrays.asList(filmes).iterator();
	}
}
