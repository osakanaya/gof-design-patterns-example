package uk.me.uohiro.gof.abstractfactory.factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Tray extends Item {
	private List<Item> items = new ArrayList<>();
	
	public Tray(String caption) {
		super(caption);
	}
	
	public void add(Item item) {
		items.add(item);
	}
	
	public List<Item> getItems() {
		return Collections.unmodifiableList(items);
	}
}
