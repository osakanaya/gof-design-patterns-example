package uk.me.uohiro.gof.abstractfactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Page implements HTMLable {
	private String title;
	private String author;
	private List<Item> contents = new ArrayList<>();
	
	public Page(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void add(Item item) {
		contents.add(item);
	}
	
	public List<Item> getItems() {
		return Collections.unmodifiableList(contents);
	}
	
	protected String getTitle() {
		return title;
	}

	protected String getAuthor() {
		return author;
	}

	public void output() {
		String filename = title + ".html";
		
		try (Writer writer = new FileWriter(filename)) {
			writer.write(makeHTML());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
