package uk.me.uohiro.gof.bridge;

public class CharDisplayImpl extends DisplayImpl {
	private char header;
	private char body;
	private char footer;
	
	public CharDisplayImpl(char header, char body, char footer) {
		this.header = header;
		this.body = body;
		this.footer = footer;
	}

	@Override
	public void rawOpen() {
		System.out.print(header);
	}

	@Override
	public void rawPrint() {
		System.out.print(body);
	}

	@Override
	public void rawClose() {
		System.out.println(footer);
	}
}
