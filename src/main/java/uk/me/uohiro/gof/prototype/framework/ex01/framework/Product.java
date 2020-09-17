package uk.me.uohiro.gof.prototype.framework.ex01.framework;

public abstract class Product implements Cloneable {
	public abstract void use(String string);

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
