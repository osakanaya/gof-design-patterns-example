package uk.me.uohiro.gof.flyweight;

public class Main {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Usage: java Main digits");
			System.exit(0);
		}
		
		BigString bigString = new BigString(args[0], true);
		bigString.print();

		bigString = new BigString(args[0], false);
		bigString.print();
	}

}
