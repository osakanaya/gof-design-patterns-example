package uk.me.uohiro.gof.bridge;

public class IncreaseDisplay extends CountDisplay {
	private int increment;
	
	public IncreaseDisplay(DisplayImpl impl, int increment) {
		super(impl);
		this.increment = increment;
	}
	
	public void increaseDisplay(int level) {
		int count = 0;
		
		for (int i = 0; i < level; i++) {
			multiDisplay(count);
			count = count + increment;
		}
	}

}
