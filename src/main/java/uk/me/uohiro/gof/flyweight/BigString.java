package uk.me.uohiro.gof.flyweight;

public class BigString {

	private BigChar[] bigChars;
	
	public BigString(String string, boolean shared) {
		if (shared) {
			init_shared(string);
		} else {
			init_unshared(string);
		}
	}
	
	private void init_shared(String string) {
		bigChars = new BigChar[string.length()];
		BigCharFactory factory = BigCharFactory.getInstance();
		
		for (int i = 0; i < bigChars.length; i++) {
			bigChars[i] = factory.getBigChar(string.charAt(i));
		}
	}
	
	private void init_unshared(String string) {
		bigChars = new BigChar[string.length()];

		for (int i = 0; i < bigChars.length; i++) {
			bigChars[i] = new BigChar(string.charAt(i));
		}
	}
	
	public void print() {
		for (int i = 0; i < bigChars.length; i++) {
			bigChars[i].print();
		}
	}
}
