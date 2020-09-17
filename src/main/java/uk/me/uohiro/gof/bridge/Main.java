package uk.me.uohiro.gof.bridge;

public class Main {

	public static void main(String[] args) {
		Display d1 = new Display(new StringDisplayImpl("Hello, Japan!"));
		Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World!"));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe!"));

		RandomCountDisplay d4 = new RandomCountDisplay(new StringDisplayImpl("Hello, Hideo!"));
		Display d5 = new Display(new FileDisplayImpl("LinkPage.html"));
		IncreaseDisplay d6 = new IncreaseDisplay(new CharDisplayImpl('<', '#', '>'), 2);
		
		d1.display();
		d2.display();
		d3.multiDisplay(5);

		d4.randomDisplay(10);
		d5.display();
		d6.increaseDisplay(5);
	}

}
