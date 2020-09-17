package uk.me.uohiro.gof.strategy.ex01;

public class SortAndPrint<T extends Comparable<T>> {
	private T[] data;
	private Sorter sorter;
	
	public SortAndPrint(T[] data, Sorter sorter) {
		this.data = data;
		this.sorter = sorter;
	}
	
	public void execute() {
		print();
		sorter.sort(data);
		print();
	}
	
	private void print() {
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + ", ");
		}
		System.out.println("");
	}
}
