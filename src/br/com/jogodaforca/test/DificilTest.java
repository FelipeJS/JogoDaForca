package br.com.jogodaforca.test;

import org.junit.Test;

import br.com.jogodaforca.difficulty.Dificil;

public class DificilTest {
	Dificil dificil = new Dificil();

	@Test
	public void mostraDificuldade() {
		System.out.println(dificil.getDificuldade());
	}
}
