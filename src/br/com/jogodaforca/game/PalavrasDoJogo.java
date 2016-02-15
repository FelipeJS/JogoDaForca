package br.com.jogodaforca.game;

import java.util.Iterator;
import java.util.Scanner;

import br.com.jogodaforca.interfaces.JogoStrategy;
import br.com.jogodaforca.interfaces.PalavraIterator;
import br.com.jogodaforca.model.Palavra;

//Classe que controla o iterator e verifica qual estrategia será jogada
public class PalavrasDoJogo {
	private PalavraIterator iterPalavra;
	private Scanner scan = new Scanner(System.in);
	private JogoStrategy letraPorLetra = new JogoLetraPorLetra();
	private JogoStrategy todasAsLetras = new JogoTodasAsLetras();

	public PalavrasDoJogo(PalavraIterator iterPalavra) {
		this.iterPalavra = iterPalavra;
	}

	public void mostrarPalavras() {
		Iterator<Palavra> palavra = iterPalavra.createIterator();
		iterarPalavras(palavra);
	}

	public void iterarPalavras(Iterator<Palavra> iterator) {
		while (iterator.hasNext()) {
			Palavra palavra = iterator.next();

			System.out.println("\nQual estrategia deseja jogar?");
			System.out.println("1 - Letra por Letra:");
			System.out.println("2 - Todas as Letras:");
			System.out.println("Digite: ");

			try {
				int escolha = scan.nextInt();
				if (escolha == 1) {
					letraPorLetra.jogar(palavra);
				} else {
					todasAsLetras.jogar(palavra);
				}
			} catch (Exception e) {
				System.out.println("Tem que digitar um numero inteiro");
			}
		}
		System.out.println("Acabaram as palavras");
	}
}
