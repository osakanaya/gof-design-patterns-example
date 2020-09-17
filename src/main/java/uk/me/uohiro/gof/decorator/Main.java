package uk.me.uohiro.gof.decorator;

public class Main {

	public static void main(String[] args) {
		Display b1 = new StringDisplay("Hello, World!");
		Display b2 = new SideBorder(b1, '#');
		Display b3 = new FullBorder(b2);
		
		b1.show();
		b2.show();
		b3.show();

		Display b4 = new SideBorder(
				new FullBorder(
						new FullBorder(
								new SideBorder(
										new FullBorder(new StringDisplay("こんにちわ。"))
										,'*'))),'/');
		b4.show();
		
		Display b5 = new UpDownBorder(b1, '=');
		b5.show();
		
		Display b6 = new FullBorder(
				new UpDownBorder(
						new SideBorder(
								new UpDownBorder(
										new SideBorder(
												new StringDisplay("こんにちは。"), 
												'*'), 
										'='), 
								'|'), 
						'/'));
		b6.show();
		
		MultiStringDisplay b7 = new MultiStringDisplay();
		b7.addRow("おはようございます。");
		b7.addRow("こんにちは。");
		b7.addRow("おやすみなさい、また明日。");
		
		b7.show();

		Display b8 = new SideBorder(b7, '#');
		b8.show();
		
		Display b9 = new FullBorder(b8);
		b9.show();
	}

}
