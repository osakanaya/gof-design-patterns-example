package uk.me.uohiro.gof.adapter1;

public class Main {
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		
		p.printWeak();
		p.printStrong();
	}
}
