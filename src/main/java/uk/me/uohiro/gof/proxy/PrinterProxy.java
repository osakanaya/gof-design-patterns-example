package uk.me.uohiro.gof.proxy;

import java.lang.reflect.Constructor;

public class PrinterProxy implements Printable {

	private String printerName;
	private Printable realPrinter;
	
	private String realPrinterClassName;
	
	public PrinterProxy(String printerName, String realPrinterClassName) {
		this.printerName = printerName;
		this.realPrinterClassName = realPrinterClassName;
	}

	@Override
	public synchronized void setPrinterName(String printerName) {
		if (realPrinter != null) {
			realPrinter.setPrinterName(printerName);
		}
		
		this.printerName = printerName;
	}

	@Override
	public String getPrinterName() {
		return printerName;
	}

	@Override
	public void print(String string) {
		realize();
		
		realPrinter.print(string);
	}

	private synchronized void realize() {
		if (realPrinter == null) {
			try {
				Constructor<?> constructor = Class.forName(realPrinterClassName).getConstructor(String.class);
				realPrinter = (Printable)constructor.newInstance(printerName);
			} catch (ClassNotFoundException e) {
				System.err.println("クラス：" + realPrinterClassName + "が見つかりません。");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
