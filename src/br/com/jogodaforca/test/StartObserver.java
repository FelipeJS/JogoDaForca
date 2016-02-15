package br.com.jogodaforca.test;


public class StartObserver {
//	private static Scanner scan;
//
//	public static void main(String[] args) {
//		scan = new Scanner(System.in);
//		boolean continuarJogando = true;
//		PalavrasDoJogo palavrasDoJogo = new PalavrasDoJogo();
//		
//		char[] palavraDinamica;
//		int contador;
//		ArrayList<Palavra> palavraRetorno;
//		JogoLetraPorLetra jogoLetraPorLetra = new JogoLetraPorLetra();
//		Dificil dificil = new Dificil();
//		
//		int tentativas = dificil.getDificuldade();
//		
////		//Registrando jogador no observer
////		JogadorObserver jogador1 = new JogadorObserver();
////		jogoObservable.registerObserver(jogador1);
//
//		while (continuarJogando) {
//			System.out.println("Selecione a categoria: ");
//			System.out.println("1 - Animal");
//			System.out.println("2 - Profissao ");
//			System.out.println("3 - Filme ");
//			int categoriaEscolhida = scan.nextInt();
//			
//			palavraRetorno = palavrasDoJogo.escolherCategoria(categoriaEscolhida);
//			palavraDinamica = palavrasDoJogo.getPalavraDinamica();
//			contador = palavrasDoJogo.getContador();
//			
//			jogoLetraPorLetra.setLetra();
//			
//			int erros = 0;
//			while(erros != dificil.getDificuldade()) {
//				boolean errou = true;
//				for(int tam = 0; tam < palavraRetorno.get(contador).getPalavra().length(); tam++) {
//					if(jogoLetraPorLetra.getLetra() == palavraRetorno.get(contador).getPalavra().charAt(tam)){
//						palavraDinamica[tam] = jogoLetraPorLetra.getLetra();
//						errou = false;
//					}else{
//						if(palavraDinamica[tam] == '\0'){
//							palavraDinamica[tam] = '-';
//						}
//					}
//				}
//				
//				if (errou) {
//					erros++;
//					if(erros < 5){
//						tentativas = dificil.getDificuldade() - erros;
//						System.out.println("Voce ainda tem "+ tentativas +" tentativas");
//					}else{
//						System.out.println("Game Over");
//						System.out.println();
//						break;
//					}
//				}
//				
//				boolean isFinished = false;
//				for (int tamDin = 0; tamDin < palavraRetorno.get(contador).getPalavra().length(); tamDin++){
//					if(palavraDinamica[tamDin] == '-'){
//						isFinished = false;
//						break;
//					}else{
//						isFinished = true;
//					}
//				}
//				
//				if(isFinished){
//						palavrasDoJogo.notifyObservers(palavraDinamica);
//						System.out.println("Parabens voce venceu!");
//						System.out.println();
//						break;
//				}else{
//					palavrasDoJogo.notifyObservers(palavraDinamica);
//				}
//				
//				jogoLetraPorLetra.setLetra();
//			}
//
//			System.out.println("1 - Jogar Novamente");
//			System.out.println("2 - Sair do Jogo");
//			int opcao = scan.nextInt();
//			switch (opcao) {
//			case 1:
//				System.out.println();
//				break;
//			default:
//				System.out.println("Game Over");
//				continuarJogando = false;
//				break;
//			}
//		}
//
//	}
}
