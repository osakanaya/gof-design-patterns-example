package uk.me.uohiro.gof.singleton.ex02;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(Triple.getInstance(i % 3).getId());
		}
	}
}
