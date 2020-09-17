package uk.me.uohiro.gof.builder;

public class Main {

	public static void main(String[] args) {
		if (args.length != 1) {
			usage();
			System.exit(-1);
		}
		
		switch(args[0]) {
			case "plain":
				TextBuilder textBuilder = new TextBuilder();
				Director director1 = new Director(textBuilder);
				director1.construct();
				String result = textBuilder.getResult();
				
				System.out.println(result);
				break;
			case "HTML":
				HTMLBuilder htmlBuilder = new HTMLBuilder();
				Director director2 = new Director(htmlBuilder);
				director2.construct();
				String filename = htmlBuilder.getResult();
				
				System.out.println(filename + "Ç™çÏê¨Ç≥ÇÍÇ‹ÇµÇΩÅB");
				break;
			default:
				usage();
				System.exit(-1);
				break;
		}
	}

	
	private static void usage() {
		System.err.println("Usage: java Main plain, or ");
		System.err.println("Usage: java Main HTML");
	}

}
