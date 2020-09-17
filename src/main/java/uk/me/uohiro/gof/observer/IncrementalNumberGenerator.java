package uk.me.uohiro.gof.observer;

public class IncrementalNumberGenerator extends NumberGenerator {
	private int start;
	private int increment;
	private int end;
	
	private int current;
	
	public IncrementalNumberGenerator(int start, int increment, int end) {
		this.start = start;
		this.increment = increment;
		this.end = end;
		
		this.current = start;
	}
	
	@Override
	public int getNumber() {
		return current;
	}

	@Override
	public void execute() {
		for(int now = start; now < end; now += increment) {
			current = now;
			
			notifyObservers();
		}
	}

}
