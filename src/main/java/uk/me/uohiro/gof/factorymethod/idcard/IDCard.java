package uk.me.uohiro.gof.factorymethod.idcard;

import uk.me.uohiro.gof.factorymethod.framework.Product;

public class IDCard extends Product {
	private String owner;
	private int serialNumber;
	
	IDCard(String owner, int serialNumber) {
		System.out.println("シリアル番号: " + serialNumber + ", 所有者: " + owner + "のカードを作ります");

		this.owner = owner;
		this.serialNumber = serialNumber;
	}

	@Override
	public void use() {
		System.out.println("シリアル番号: " + serialNumber + ", 所有者: " + owner + "のカードを使います");
	}

	public String getOwner() {
		return owner;
	}

	public int getSerialNumber() {
		return serialNumber;
	}	
}
