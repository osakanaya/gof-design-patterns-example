package uk.me.uohiro.gof.strategy.ex01;

public class Main {
	public static void main(String args[]) {
		String[] data = {
			"Dumpty", "Bowman", "Carroll", "Elfland", "Alice"
		};
		
//		SortAndPrint<String> sap = new SortAndPrint<>(data, new InsertSorter());
		SortAndPrint<String> sap = new SortAndPrint<>(data, new QuickSorter());

		sap.execute();
	}
}
