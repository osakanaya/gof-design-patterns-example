package uk.me.uohiro.gof.prototype.framework.ex01.tool;

import uk.me.uohiro.gof.prototype.framework.ex01.framework.Product;

public class MessageBox extends Product {
	private char decoratingChar;
	
	public MessageBox(char decoratingChar) {
		this.decoratingChar = decoratingChar;
	}
	
	@Override
	public void use(String string) {
		int length = string.getBytes().length;
		
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decoratingChar);
		}		
		System.out.println();
		
		System.out.println(decoratingChar + " " + string + " " + decoratingChar);
		
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decoratingChar);
		}
		System.out.println();
	}
}
