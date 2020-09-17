package uk.me.uohiro.gof.singleton.ex01;

public class Main {

	public static void main(String[] args) {
		TicketMaker instance1 = TicketMaker.getInstance();
		TicketMaker instance2 = TicketMaker.getInstance();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(instance1.getNextTicketNumber());
			System.out.println(instance2.getNextTicketNumber());
		}
	}

}
