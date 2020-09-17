package uk.me.uohiro.gof.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {
	private List<Observer> observers = new ArrayList<>();
	
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}
	
	public void deleteObserver(Observer observer) {
		this.observers.remove(observer);
	}
	
	protected void notifyObservers() {
		this.observers.forEach(observer -> observer.update(this));
	}
	
	public abstract int getNumber();
	public abstract void execute();
	
}
