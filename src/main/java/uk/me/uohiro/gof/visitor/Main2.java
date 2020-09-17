package uk.me.uohiro.gof.visitor;

public class Main2 {

	public static void main(String[] args) {
		Directory root1 = new Directory("root1");
		root1.add(new File("diary.html", 10));
		root1.add(new File("index.html", 20));
		
		Directory root2 = new Directory("root2");
		root2.add(new File("diary.html", 1000));
		root2.add(new File("index.html", 2000));
		
		AcceptorList acceptor = new AcceptorList();
		acceptor.add(root1);
		acceptor.add(root2);
		
		acceptor.accept(new ListVisitor());
	}
}
