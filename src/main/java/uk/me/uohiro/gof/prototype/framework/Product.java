package uk.me.uohiro.gof.prototype.framework;

public interface Product extends Cloneable {
	public abstract void use(String string);
	public abstract Product createClone();
	
}
