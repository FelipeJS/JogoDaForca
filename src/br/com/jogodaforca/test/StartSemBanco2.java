package br.com.jogodaforca.test;

import br.com.jogodaforca.game.JogoLetraPorLetra;
import br.com.jogodaforca.model.Palavra;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class StartSemBanco2 {
//
//	public static void main(String[] args) {
//		int erros = 0;
//		Palavra palavra = new Palavra();
//		char[] letrasErradas = new char[22];
//		Map<String, Integer> mapaLetras = new HashMap<>();
//		JogoLetraPorLetra jogoLetraPorLetra = new JogoLetraPorLetra();
//
//		// i representa o codigo da palavra no banco, nesse exemplo meu banco
//		// tem 3 palavras, codigo 1, 2 e 3
//		for (int i = 1; i < 4; i++) {
//			palavra.setCodigo(i);
//			// PalavraDAO dao = new PalavraDAO();
//
//			try {
//				// Palavra palavraRetorno = dao.buscarPalavra(palavra);
//				Palavra palavraRetorno = new Palavra();
//				palavraRetorno.setPalavra("boio");
//				palavraRetorno.setCategoria("Animal"); // Depois comenta esse
//														// trecho e descomenta a
//														// parte do DAO
//
//				char[] palavraDinamica = new char[palavraRetorno.getPalavra()
//						.length()];
//				System.out.println(palavraRetorno.getCategoria());
//				jogoLetraPorLetra.setLetra();
//
//				for (int tentativa = 99; tentativa > 0; --tentativa) {
//					boolean errou = true;
//					Integer quantLetras = 0;
//					for (int tam = 0; tam < palavraRetorno.getPalavra()
//							.length(); tam++) {
//						if (jogoLetraPorLetra.getLetra() == palavraRetorno.getPalavra()
//								.charAt(tam) && errou == true) {
//							quantLetras++;
//							if (!mapaLetras.containsKey(String.valueOf(jogoLetraPorLetra
//									.getLetra()))) {
//								palavraDinamica[tam] = jogoLetraPorLetra.getLetra();
//								errou = false;
//								mapaLetras.put(String.valueOf(jogoLetraPorLetra.getLetra()),
//										quantLetras);
//
//							}
//
//							else {
//								if (mapaLetras.get(
//										String.valueOf(jogoLetraPorLetra.getLetra()))
//										.intValue() < quantLetras) {
//									palavraDinamica[tam] = jogoLetraPorLetra.getLetra();
//									errou = false;
//									mapaLetras.put(
//											String.valueOf(jogoLetraPorLetra.getLetra()),
//											quantLetras);
//
//								}
//							}
//
//						} else {
//							if (palavraDinamica[tam] == '\0') {
//								palavraDinamica[tam] = '-';
//
//							}
//						}
//					}
//
//					if (errou) {
//						letrasErradas[erros] = jogoLetraPorLetra.getLetra();
//						erros++;
//
//						if (erros < 5)
//							System.out.printf("Voc� ainda tem %d tentativas.",
//									5 - erros);
//						else {
//							System.out.println("Game over motherfucker!");
//							break;
//						}
//					}
//
//					boolean isFinished = false;
//					for (int tamDin = 0; tamDin < palavraRetorno.getPalavra()
//							.length(); tamDin++) {
//						if (palavraDinamica[tamDin] == '-') {
//							isFinished = false;
//							break;
//						} else
//							isFinished = true;
//					}
//					if (isFinished) {
//						for (int tamDin = 0; tamDin < palavraRetorno
//								.getPalavra().length(); tamDin++) {
//							System.out.print(palavraDinamica[tamDin]);
//						}
//						System.out.print("\n Parabens voce venceu!!!\n");
//						break;
//					} else {
//						for (int tamDin = 0; tamDin < palavraRetorno
//								.getPalavra().length(); tamDin++) {
//							System.out.print(palavraDinamica[tamDin]);
//						}
//						if (erros != 0) {
//							System.out.print("\nErradas: ");
//							for (int j = 0; j < letrasErradas.length; j++) {
//								System.out.print(letrasErradas[j]);
//							}
//						}
//					}
//
//					jogoLetraPorLetra.setLetra();
//					jogoLetraPorLetra.confereSeLetraErradaJaDada(letrasErradas);
//
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//				System.out.println("Erro ao tentar iniciar o jogo");
//			}
//		}
//
//	}

}
