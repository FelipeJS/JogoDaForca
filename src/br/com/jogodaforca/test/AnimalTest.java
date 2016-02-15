package br.com.jogodaforca.test;

import org.junit.Test;

import br.com.jogodaforca.category.Animal;
import br.com.jogodaforca.game.PalavrasDoJogo;

public class AnimalTest {
	Animal animal = new Animal();

	@Test
	public void buscarAnimais() {
		Animal animal = new Animal();
		PalavrasDoJogo iteratorTeste = new PalavrasDoJogo(animal);
		iteratorTeste.mostrarPalavras();
	}
}
