package uk.me.uohiro.gof.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {

	private String name;
	private List<Entry> entries = new ArrayList<>();

	public Directory(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		return entries.stream().mapToInt(entry -> entry.getSize()).sum();
	}
	
	public Entry add(Entry entry) {
		entries.add(entry);
		entry.parent = this;
		
		return this;
	}

	@Override
	protected void printList(String prefix) {
		System.out.println(prefix +"/" + this);
	
		entries.forEach(entry -> entry.printList(prefix + "/" + name));
	}
	
}
