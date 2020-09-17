package uk.me.uohiro.gof.iterator;

public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf();
		
		bookShelf.appendBook(new Book("Around the World in 80 Dadys"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Lengs"));
		
		Iterator<Book> iter = bookShelf.iterator();
		while (iter.hasNext()) {
			Book book = iter.next();
			
			System.out.println(book.getName());
		}
	}
}
