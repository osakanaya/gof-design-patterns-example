package uk.me.uohiro.gof.builder.ex01;

public interface Builder {
	public abstract void makeTitle(String title);
	public abstract void makeString(String string);
	public abstract void makeItems(String[] items);
	public abstract void close();
}
