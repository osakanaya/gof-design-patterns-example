package uk.me.uohiro.gof.singleton.ex01;

import java.util.concurrent.atomic.AtomicInteger;

public class TicketMaker {
	public static TicketMaker instance = new TicketMaker();
	
	private AtomicInteger serial = new AtomicInteger(1000);
	
	private TicketMaker() {
		System.out.println("�C���X�^���X�𐶐����܂���");
	}
	
	public static TicketMaker getInstance() {
		return instance;
	}
	
	public int getNextTicketNumber() {
		return serial.getAndIncrement();
	}
}
