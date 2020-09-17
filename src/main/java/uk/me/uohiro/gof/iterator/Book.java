package uk.me.uohiro.gof.iterator;

public class Book {
	private String name;
	
	@SuppressWarnings("unused")
	private Book() {}
	
	public Book(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
