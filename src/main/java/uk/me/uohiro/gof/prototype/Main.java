package uk.me.uohiro.gof.prototype;

import uk.me.uohiro.gof.prototype.framework.Manager;
import uk.me.uohiro.gof.prototype.framework.Product;
import uk.me.uohiro.gof.prototype.tool.MessageBox;
import uk.me.uohiro.gof.prototype.tool.UnderlinePen;

public class Main {
	public static void main(String[] args) {
		Manager manager = new Manager();
		
		UnderlinePen underlinePen = new UnderlinePen('~');
		MessageBox warningBox = new MessageBox('*');
		MessageBox slashBox = new MessageBox('/');
		
		manager.register("strong message", underlinePen);
		manager.register("warning box", warningBox);
		manager.register("slash box", slashBox);
		
		Product product1 = manager.create("strong message");
		product1.use("Hello, World!");
		
		Product product2 = manager.create("warning box");
		product2.use("Hello, World!");
		
		Product product3 = manager.create("slash box");
		product3.use("Hello, World!");
	}
}
