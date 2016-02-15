package br.com.jogodaforca.interfaces;


public interface Observable {
	public void registerObserver(Observer obj);
	public void removeObserver(Observer obj);
	public void notifyObservers();
}
