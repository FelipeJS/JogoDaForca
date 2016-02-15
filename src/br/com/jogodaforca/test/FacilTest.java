package br.com.jogodaforca.test;

import org.junit.Test;

import br.com.jogodaforca.difficulty.Facil;

public class FacilTest {
	Facil facil = new Facil();

	@Test
	public void mostraDificuldade() {
		System.out.println(facil.getDificuldade());
	}
}
