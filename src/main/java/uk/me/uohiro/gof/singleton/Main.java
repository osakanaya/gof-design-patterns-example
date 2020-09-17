package uk.me.uohiro.gof.singleton;

public class Main {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		if (instance1 == instance2) {
			System.out.println("instance1とinstance2は同じインスタンスです");
		} else {
			System.out.println("instance1とinstance2は異なるインスタンスです");
		}
	}
}
