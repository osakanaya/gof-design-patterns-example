package uk.me.uohiro.gof.singleton;

public class Main {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		if (instance1 == instance2) {
			System.out.println("instance1��instance2�͓����C���X�^���X�ł�");
		} else {
			System.out.println("instance1��instance2�͈قȂ�C���X�^���X�ł�");
		}
	}
}
