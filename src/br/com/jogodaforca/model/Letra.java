package br.com.jogodaforca.model;

public class Letra {
	private char letra;

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	@Override
	public String toString() {
		return "Letra [letra=" + letra + "]";
	}
}
