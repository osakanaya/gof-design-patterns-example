package uk.me.uohiro.gof.composite;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("Making root entries...");
			
			Directory rootDir = new Directory("root");
			Directory binDir = new Directory("bin");
			Directory tmpDir = new Directory("tmp");
			Directory usrDir = new Directory("usr");
			
			rootDir.add(binDir);
			rootDir.add(tmpDir);
			rootDir.add(usrDir);
			
			binDir.add(new File("vi", 10000));
			binDir.add(new File("latex", 20000));
			
			rootDir.printList();
			
			System.out.println("");
			System.out.println("Making user entries...");
			
			Directory yuki = new Directory("yuki");
			Directory hanako = new Directory("hanako");
			Directory tomura = new Directory("tomura");
			
			usrDir.add(yuki);
			usrDir.add(hanako);
			usrDir.add(tomura);
			
			yuki.add(new File("diary.html", 100));
			yuki.add(new File("Composite.java", 200));
			
			hanako.add(new File("memo.txt", 300));
			
			tomura.add(new File("game.doc", 400));
			tomura.add(new File("junk.mail", 500));
			
			File leaf = new File("hoge.txt", 600);
			tomura.add(leaf);
			
			rootDir.printList();
			
			System.out.println("");
			System.out.println("leaf -> " + leaf.getFullName());

		} catch (FileTreatmentException e) {
			e.printStackTrace();
		}
	}

}
