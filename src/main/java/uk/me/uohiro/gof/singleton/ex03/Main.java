package uk.me.uohiro.gof.singleton.ex03;

public class Main extends Thread {
	public Main(String name) {
		super(name);
	}

	public static void main(String[] args) {
		new Main("A").start();
		new Main("B").start();
		new Main("C").start();
		
	}
	
	public void run() {
		Singleton singleton = Singleton.getInstance();
		System.out.println(getName() + ": singleton -> "+ singleton);
	}
}
