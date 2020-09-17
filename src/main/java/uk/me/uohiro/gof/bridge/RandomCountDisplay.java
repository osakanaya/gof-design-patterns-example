package uk.me.uohiro.gof.bridge;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomCountDisplay extends Display {

	public RandomCountDisplay(DisplayImpl impl) {
		super(impl);
	}
	
	public void randomDisplay(int times) {
		open();

		IntStream.range(0,  new Random().nextInt(times)).forEach((count) -> print());
		
		close();
	}
	
}
