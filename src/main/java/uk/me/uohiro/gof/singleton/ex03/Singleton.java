package uk.me.uohiro.gof.singleton.ex03;

public class Singleton {
	private static Singleton singleton = null;
	
	private Singleton() {
		System.out.println("インスタンスを生成しました");
	}
	
	public static synchronized Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		} 
		
		return singleton;
	}
}
