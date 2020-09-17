package uk.me.uohiro.gof.strategy;

public class Main {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.err.println("Usage: java Main randomseed1 randomseed2");
			System.exit(-1);
		}
		
		int seed1 = Integer.parseInt(args[0]);
		int seed2 = Integer.parseInt(args[1]);
		
		Player player1 = new Player("Taro", new WinningStrategy(seed1));
//		Player player2 = new Player("Hanako", new ProbabilityStrategy(seed2));
		Player player2 = new Player("Hanako", new RandomStrategy(seed2));
		
		for (int i = 0; i < 10000; i++) {
			Hand player1Hand = player1.nextHand();
			Hand player2Hand = player2.nextHand();
			
			if (player1Hand.isStrongerThan(player2Hand)) {
				System.out.println("Winner: " + player1);
				player1.win();
				player2.lose();
			} else if (player2Hand.isStrongerThan(player1Hand)) {
				System.out.println("Winner: " + player2);
				player1.lose();
				player2.win();
			} else {
				System.out.println("Even...");
				player1.even();
				player2.even();
			}
		}
		
		System.out.println("Total result:");
		System.out.println(player1.toString());
		System.out.println(player2.toString());
	}

}
