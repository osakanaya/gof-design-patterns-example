package uk.me.uohiro.gof.proxy;

public interface Printable {
	public abstract void setPrinterName(String printerName);
	public abstract String getPrinterName();
	public abstract void print(String string);
}
