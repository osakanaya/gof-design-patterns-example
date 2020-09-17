package uk.me.uohiro.gof.strategy.ex01;

public class InsertSorter implements Sorter {

	@Override
	public <T extends Comparable<T>> void sort(T[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i].compareTo(data[j]) > 0) {
					T temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
	}

}
