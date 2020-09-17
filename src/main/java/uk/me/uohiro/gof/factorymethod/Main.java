package uk.me.uohiro.gof.factorymethod;

import uk.me.uohiro.gof.factorymethod.framework.Factory;
import uk.me.uohiro.gof.factorymethod.framework.Product;
import uk.me.uohiro.gof.factorymethod.idcard.IDCard;
import uk.me.uohiro.gof.factorymethod.idcard.IDCardFactory;

public class Main {
	public static void main(String[] args) {
		Factory<IDCard> factory = new IDCardFactory();
		
		Product card1 = factory.create("Hideo");
		Product card2 = factory.create("Ayako");
		Product card3 = factory.create("Wataru");
		
		card1.use();
		card2.use();
		card3.use();
		
		((IDCardFactory)factory).getOwners()
			.forEach((serialNumber, owner) -> System.out.println(serialNumber + "->" + owner));
		
		System.out.println(((IDCardFactory)factory).getNextSerialNumber());
	}
}
