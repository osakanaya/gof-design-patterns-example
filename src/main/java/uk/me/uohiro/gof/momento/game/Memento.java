package uk.me.uohiro.gof.momento.game;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Memento implements Serializable {
	
	private static final long serialVersionUID = 3790104088137948623L;

	int money;
	List<String> fruits;
	
	Memento(int moeny) {
		this.money = moeny;
		this.fruits = new ArrayList<>();
	}
	
	public int getMoney() {
		return money;
	}
	
	void addFruit(String fruit) {
		fruits.add(fruit);
	}
	
	List<String> getFruits() {
		return fruits.stream().collect(Collectors.toList());
	}
	
}
