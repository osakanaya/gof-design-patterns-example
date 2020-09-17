package uk.me.uohiro.gof.decorator;

public class FullBorder extends Border {
	
	public FullBorder(Display display) {
		super(display);
	}

	@Override
	public int getColumns() {
		return display.getColumns() + 2;
	}

	@Override
	public int getRows() {
		return display.getRows() + 2;
	}

	@Override
	public String getRowText(int row) {
		if (row == 0 || row == display.getRows() + 1) {
			return "+" + makeLine('-', display.getColumns()) + "+";
		} else {
			return "|" + display.getRowText(row - 1) + "|";
		}
	}
	
	private String makeLine(char horizontalBorderChar, int count) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < count; i++) {
			buffer.append(horizontalBorderChar);
		}
		
		return buffer.toString();
	}

}
