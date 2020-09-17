package uk.me.uohiro.gof.template.ex04;

public class CharDisplay implements AbstractDisplay {
	private char ch;
	
	public CharDisplay(char ch) {
		this.ch = ch;
	}

	@Override
	public void open() {
		System.out.print("<<");
	}

	@Override
	public void print() {
		System.out.print(ch);
	}

	@Override
	public void close() {
		System.out.println(">>");
	}

}
