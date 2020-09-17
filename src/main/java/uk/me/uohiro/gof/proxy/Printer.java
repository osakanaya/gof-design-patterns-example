package uk.me.uohiro.gof.proxy;

public class Printer implements Printable {

	private String printerName;
	
	public Printer(String printerName) {
		this.printerName = printerName;
		
		doHeavyJob("Printer�̃C���X�^���X�i" + printerName + "�j�𐶐���");
	}
	
	private void doHeavyJob(String message) {
		System.out.print(message);
		
		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {}
			
			System.out.print(".");
		}
		
		System.out.println("�����B");
	}

	@Override
	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}

	@Override
	public String getPrinterName() {
		return printerName;
	}

	@Override
	public void print(String string) {
		System.out.println("=== " + printerName + " ===");
		System.out.println(string);
	}

}
