package uk.me.uohiro.gof.proxy;

public class Main {

	public static void main(String[] args) {
		Printable printable = new PrinterProxy("Alice", "uk.me.uohiro.gof.proxy.Printer");
		System.out.println("名前は現在、" + printable.getPrinterName() + "です。");
		
		printable.setPrinterName("Bob");
		System.out.println("名前は現在、" + printable.getPrinterName() + "です。");
		
		printable.print("Hello, World!");
	}

}
