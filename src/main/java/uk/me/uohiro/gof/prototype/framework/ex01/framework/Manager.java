package uk.me.uohiro.gof.prototype.framework.ex01.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
	private Map<String, Product> showcase = new HashMap<>();
	
	public void register(String name, Product proto) {
		showcase.put(name,  proto);
	}

	public Product create(String name) {
		Product product = showcase.get(name);
		
		return product.createClone();
	}
}
