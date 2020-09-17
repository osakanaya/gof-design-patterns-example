package uk.me.uohiro.gof.template;

public class Main {

	public static void main(String[] args) {
		AbstractDisplay display1 = new CharDisplay('H');
		AbstractDisplay display2 = new StringDisplay("Hello world.");
		AbstractDisplay display3 = new StringDisplay("Ç±ÇÒÇ…ÇøÇÕÅB");
		
		display1.display();
		display2.display();
		display3.display();
	}
}
