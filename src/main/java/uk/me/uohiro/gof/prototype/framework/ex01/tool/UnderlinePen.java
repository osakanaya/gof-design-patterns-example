package uk.me.uohiro.gof.prototype.framework.ex01.tool;

import uk.me.uohiro.gof.prototype.framework.ex01.framework.Product;

public class UnderlinePen extends Product {
	private char underlineChar;
	
	public UnderlinePen(char underlineChar) {
		this.underlineChar = underlineChar;
	}
	
	@Override
	public void use(String string) {
		int length = string.getBytes().length;
		
		System.out.println("\"" + string + " " + "\"");

		System.out.print(" ");
		for (int i = 0; i < length; i++) {
			System.out.print(underlineChar);
		}
		System.out.println();
	}
}
