package uk.me.uohiro.gof.bridge;

import java.util.stream.IntStream;

public class StringDisplayImpl extends DisplayImpl {
	private String string;
	private int width;
	
	public StringDisplayImpl(String string) {
		this.string = string;
		this.width = string.getBytes().length;
	}
	
	@Override
	public void rawOpen() {
		printLine();
	}

	@Override
	public void rawPrint() {
		System.out.println("|" + string + "|");
	}

	@Override
	public void rawClose() {
		printLine();
	}
	
	private void printLine() {
		System.out.print("+");
		IntStream.range(0,  width).forEach((count) -> System.out.print("-"));
		System.out.println("+");
	}

}
