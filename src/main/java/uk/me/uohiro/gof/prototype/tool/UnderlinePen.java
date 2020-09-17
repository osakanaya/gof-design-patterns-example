package uk.me.uohiro.gof.prototype.tool;

import uk.me.uohiro.gof.prototype.framework.Product;

public class UnderlinePen implements Product {
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

	@Override
	public Product createClone() {
		Product product = null;
		
		try {
			product = (Product)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return product;
	}

}
