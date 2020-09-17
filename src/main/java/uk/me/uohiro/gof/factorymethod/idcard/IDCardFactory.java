package uk.me.uohiro.gof.factorymethod.idcard;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import uk.me.uohiro.gof.factorymethod.framework.Factory;

public class IDCardFactory extends Factory<IDCard> {
	private Map<Integer, String> owners = new HashMap<>();
	private int nextSerialNumber = 1;

	@Override
	protected IDCard createProduct(String owner) {
		return new IDCard(owner, nextSerialNumber++);
	}

	@Override
	protected void registerProduct(IDCard product) {
		owners.put(product.getSerialNumber(), product.getOwner());
	}
	
	public Map<Integer, String> getOwners() {
		return owners;
	}

	public int getNextSerialNumber() {
		return nextSerialNumber;
	}
}
