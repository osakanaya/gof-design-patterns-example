package uk.me.uohiro.gof.factorymethod.idcard;

import uk.me.uohiro.gof.factorymethod.framework.Product;

public class IDCard extends Product {
	private String owner;
	private int serialNumber;
	
	IDCard(String owner, int serialNumber) {
		System.out.println("�V���A���ԍ�: " + serialNumber + ", ���L��: " + owner + "�̃J�[�h�����܂�");

		this.owner = owner;
		this.serialNumber = serialNumber;
	}

	@Override
	public void use() {
		System.out.println("�V���A���ԍ�: " + serialNumber + ", ���L��: " + owner + "�̃J�[�h���g���܂�");
	}

	public String getOwner() {
		return owner;
	}

	public int getSerialNumber() {
		return serialNumber;
	}	
}
