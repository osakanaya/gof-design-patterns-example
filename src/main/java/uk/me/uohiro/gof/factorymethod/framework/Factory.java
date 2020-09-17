package uk.me.uohiro.gof.factorymethod.framework;

public abstract class Factory<T extends Product> {
	public final T create(String owner) {
		T product = createProduct(owner);
		registerProduct(product);
		
		return product;
	}
	
	protected abstract T createProduct(String owner);
	protected abstract void registerProduct(T product); 
}
