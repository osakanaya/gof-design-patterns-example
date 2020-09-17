package uk.me.uohiro.gof.iterator;

public interface Aggregate<T> {
	public abstract Iterator<T> iterator();
}
