package uk.me.uohiro.gof.singleton;

public class Singleton {
	private static Singleton instance = new Singleton();
	
	private Singleton( ) {
		System.out.println("インスタンスを生成しました");
	}
	
	public static Singleton getInstance() {
		return instance;
	}
}
