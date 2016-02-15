package br.com.jogodaforca.category;

import java.util.ArrayList;
import java.util.Iterator;

import br.com.jogodaforca.dao.PalavraDAO;
import br.com.jogodaforca.interfaces.PalavraIterator;
import br.com.jogodaforca.model.Palavra;

//Classe que utiliza o DAO e verifica se a categoria é animal e retorna o iterator
public class Animal implements PalavraIterator {
	private ArrayList<Palavra> animais = new ArrayList<Palavra>();
	private Palavra palavra = new Palavra();
	private PalavraDAO dao = new PalavraDAO();

	// Quantidade de palavras no banco de dados + 1
	private int qntDePalavrasBD = 7;

	public Animal() {
		for (int i = 1; i < qntDePalavrasBD; i++) {
			palavra.setCodigo(i);
			try {
				Palavra palavraRetorno = dao.buscarPalavra(palavra);

				if (palavraRetorno.getCategoria().toLowerCase()
						.equals("animal")) {
					animais.add(palavraRetorno);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public Iterator<Palavra> createIterator() {
		return animais.iterator();
	}
}
