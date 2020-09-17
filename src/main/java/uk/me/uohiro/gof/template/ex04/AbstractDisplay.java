package uk.me.uohiro.gof.template.ex04;

public interface AbstractDisplay {
	abstract void open();
	abstract void print();
	abstract void close();
	
	default void display() {
		open();
		for(int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}
