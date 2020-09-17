package uk.me.uohiro.gof.strategy.ex01;

public interface Sorter {
	public abstract <T extends Comparable<T>> void sort(T[] data);
}
