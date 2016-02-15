package br.com.jogodaforca.main;

import java.util.Scanner;

import br.com.jogodaforca.category.Animal;
import br.com.jogodaforca.category.Filme;
import br.com.jogodaforca.category.Profissao;
import br.com.jogodaforca.game.PalavrasDoJogo;
import br.com.jogodaforca.interfaces.Observable;
import br.com.jogodaforca.interfaces.Observer;

/* Autores: 
 * Felipe Ferreira Campos 
 * Fidel Cássio de Souza Silva
 * 
 * Jogo da Forca com Observer, Strategy e Iterator
 * Disciplina de Projetos de Software
 * Goiânia 07/06/2015
 */
public class StartFinal implements Observable {
	private static Scanner scanner;

	public static void main(String[] args) {
		PalavrasDoJogo palavrasDoJogo;
		scanner = new Scanner(System.in);

		System.out.println("Selecione a categoria:");
		System.out.println("1 - Animal:");
		System.out.println("2 - Profissao:");
		System.out.println("3 - Filme:");
		System.out.println("Digite: ");
		try {
			int categoriaEscolhida = scanner.nextInt();

			switch (categoriaEscolhida) {
			case 2:
				System.out.println("Categoria profissao escolhida ");
				Profissao profissao = new Profissao();
				palavrasDoJogo = new PalavrasDoJogo(profissao);
				palavrasDoJogo.mostrarPalavras();
				break;
			case 3:
				System.out.println("Categoria filme escolhida ");
				Filme filme = new Filme();
				palavrasDoJogo = new PalavrasDoJogo(filme);
				palavrasDoJogo.mostrarPalavras();
				break;
			default:
				System.out.println("Categoria animal escolhida ");
				Animal animal = new Animal();
				palavrasDoJogo = new PalavrasDoJogo(animal);
				palavrasDoJogo.mostrarPalavras();
				break;
			}
		} catch (Exception e) {
			System.out.println("Tem que digitar um numero inteiro");
		}
	}
	
	@Override
	public void registerObserver(Observer obj) {
		System.out.println(obj.getClass().getName() + " foi registrado");
		System.out.println();
	}
	
	@Override
	public void removeObserver(Observer obj) {
		System.out.println(obj.getClass().getName() + " foi removido");
		System.out.println();
	}
	
	@Override
	public void notifyObservers() {
		System.out.println("O Jogo começou!!!");
	}
}
