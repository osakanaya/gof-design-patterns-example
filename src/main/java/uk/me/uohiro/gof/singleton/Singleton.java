package uk.me.uohiro.gof.singleton;

public class Singleton {
	private static Singleton instance = new Singleton();
	
	private Singleton( ) {
		System.out.println("�C���X�^���X�𐶐����܂���");
	}
	
	public static Singleton getInstance() {
		return instance;
	}
}
