package uk.me.uohiro.gof.observer;

import uk.me.uohiro.gof.observer.ex02.FrameObserver;

public class Main {

	public static void main(String[] args) {
//		NumberGenerator generator = new RandomNumberGenerator();

		NumberGenerator generator = new IncrementalNumberGenerator(10, 2, 50);
		Observer observer1 = new DigitObserver();
		Observer observer2 = new GraphObserver();
		Observer observer3 = new FrameObserver();
		
		generator.addObserver(observer1);
		generator.addObserver(observer2);
		generator.addObserver(observer3);
		
		generator.execute();
	}
}
