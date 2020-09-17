package uk.me.uohiro.gof.proxy;

public class Main {

	public static void main(String[] args) {
		Printable printable = new PrinterProxy("Alice", "uk.me.uohiro.gof.proxy.Printer");
		System.out.println("���O�͌��݁A" + printable.getPrinterName() + "�ł��B");
		
		printable.setPrinterName("Bob");
		System.out.println("���O�͌��݁A" + printable.getPrinterName() + "�ł��B");
		
		printable.print("Hello, World!");
	}

}
