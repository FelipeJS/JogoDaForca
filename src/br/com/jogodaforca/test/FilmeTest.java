package br.com.jogodaforca.test;

import org.junit.Test;

import br.com.jogodaforca.category.Filme;
import br.com.jogodaforca.game.PalavrasDoJogo;

public class FilmeTest {
	Filme filme = new Filme();

	@Test
	public void buscarFilmes() {
		Filme filme = new Filme();
		PalavrasDoJogo iteratorTeste = new PalavrasDoJogo(filme);
		iteratorTeste.mostrarPalavras();
	}
}
