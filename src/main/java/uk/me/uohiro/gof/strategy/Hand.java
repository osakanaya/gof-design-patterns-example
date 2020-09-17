package uk.me.uohiro.gof.strategy;

public enum Hand {
	GUU("グー"),
	CHOKI("チョキ"),
	PAA("パー");
	
	private final String displayName;
	
	Hand(String displayName) {
		this.displayName = displayName;
	}
	
	String displayName() {
		return displayName;
	}
	
	public static Hand getHand(int ordinal) {
		return Hand.values()[ordinal];
	}
	
	public boolean isStrongerThan(Hand other) {
		return fight(other) == 1;
	}
	
	public boolean isWeakerThan(Hand other) {
		return fight(other) == -1;
	}
	
	private int fight(Hand other) {
		if (this == other) {
			return 0;
		} else if ((this.ordinal() + 1) % 3 == other.ordinal()) {
			return 1;
		} else {
			return -1;
		}
	}
}
