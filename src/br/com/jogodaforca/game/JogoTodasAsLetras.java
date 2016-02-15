package br.com.jogodaforca.game;

import java.util.Scanner;

import br.com.jogodaforca.interfaces.JogoStrategy;
import br.com.jogodaforca.interfaces.Observer;
import br.com.jogodaforca.model.Letra;
import br.com.jogodaforca.model.Palavra;

public class JogoTodasAsLetras implements JogoStrategy, Observer {
	Scanner scan = new Scanner(System.in);
	Letra letra = new Letra();
	boolean continuarJogando = true;

	@Override
	public void jogar(Palavra palavra) {
		int erros = 0;
		char[] letrasErradas = new char[22];

		try {
			char[] palavraDinamica = new char[palavra.getPalavra().length()];

			System.out.println("Jogo da Forca");
			System.out.println("\nAdivinhe a Palavra:");
			for (int y = 0; y < palavra.getPalavra().length(); y++) {
				System.out.print("-");
			}
			System.out.println("\nDigite uma letra\n");
			char c = scan.next().charAt(0);
			letra.setLetra(c);

			while (continuarJogando) {
				boolean errou = true;
				for (int tam = 0; tam < palavra.getPalavra().length(); tam++) {
					if (letra.getLetra() == palavra.getPalavra().charAt(tam)) {
						palavraDinamica[tam] = letra.getLetra();
						errou = false;
					} else {
						if (palavraDinamica[tam] == '\0') {
							palavraDinamica[tam] = '-';

						}
					}
				}

				if (errou) {
					letrasErradas[erros] = letra.getLetra();
					erros++;
					if (erros < 5)
						System.out.printf("Voce ainda tem %d tentativas.\n",
								5 - erros);
					else {
						System.out.println("Game over");
						continuarJogando = false;
						break;
					}
				}

				boolean isFinished = false;
				for (int tamDin = 0; tamDin < palavra.getPalavra().length(); tamDin++) {
					if (palavraDinamica[tamDin] == '-') {
						isFinished = false;
						break;
					} else
						isFinished = true;
				}
				if (isFinished) {
					for (int tamDin = 0; tamDin < palavra.getPalavra().length(); tamDin++) {
						System.out.print(palavraDinamica[tamDin]);
					}
					System.out.print("\n Parabens voce venceu!!!\n");
					continuarJogando = false;
					break;
				} else {
					for (int tamDin = 0; tamDin < palavra.getPalavra().length(); tamDin++) {
						System.out.print(palavraDinamica[tamDin]);
					}
					if (erros != 0) {
						System.out.print("\nErradas: ");
						for (int j = 0; j < letrasErradas.length; j++) {
							System.out.print(letrasErradas[j]);
						}
					}
				}

				System.out.println();
				System.out.println("\nDigite uma letra\n");
				c = scan.next().charAt(0);
				letra.setLetra(c);
				while (confereSeLetraErradaJaDada(letrasErradas)) {
					System.out.println("\nEsta letra já é dada como errada!\n");
					System.out.println("\nDigite uma letra\n");
					c = scan.next().charAt(0);
					letra.setLetra(c);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao tentar iniciar o jogo\n");
		}
	}

	public boolean confereSeLetraErradaJaDada(char[] letrasErradas) {
		@SuppressWarnings("unused")
		boolean letraErradaJaExistente = false;
		for (int j = 0; j < letrasErradas.length; j++) {
			if (letra.getLetra() == letrasErradas[j]) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void update(Object obj) {
		System.out.println("\nDigite uma letra:\n");
	}
}
