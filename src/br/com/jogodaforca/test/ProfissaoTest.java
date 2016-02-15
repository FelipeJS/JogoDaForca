package br.com.jogodaforca.test;

import org.junit.Test;

import br.com.jogodaforca.category.Profissao;
import br.com.jogodaforca.game.PalavrasDoJogo;

public class ProfissaoTest {
	Profissao profissao = new Profissao();

	@Test
	public void buscarProfissoes() {
		Profissao profissao = new Profissao();
		PalavrasDoJogo iteratorTeste = new PalavrasDoJogo(profissao);
		iteratorTeste.mostrarPalavras();
	}
}
