package uk.me.uohiro.gof.strategy.ex01;

public class QuickSorter implements Sorter {

	@Override
	public <T extends Comparable<T>> void sort(T[] data) {
		sort(data, 0, data.length - 1);
	}

	private <T extends Comparable<T>> void sort(T[] data, int low, int high) {
        if (low < high) { 
            int pi = partition(data, low, high); 
   
            // sort each partition recursively 
            sort(data, low, pi-1); 
            sort(data, pi+1, high); 
        } 
	}

	private <T extends Comparable<T>> int partition(T data[], int low, int high) {
		T pi = data[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			// check if current element is less than or equal to pi
			if (data[j].compareTo(pi) < 1) {
				i++;

				T temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}

		T temp = data[i + 1];
		data[i + 1] = data[high];
		data[high] = temp;

		return i + 1;
	}
}
