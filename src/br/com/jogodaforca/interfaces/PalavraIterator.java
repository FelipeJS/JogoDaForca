package br.com.jogodaforca.interfaces;

import java.util.Iterator;

import br.com.jogodaforca.model.Palavra;

public interface PalavraIterator {
	public Iterator<Palavra> createIterator();
}
