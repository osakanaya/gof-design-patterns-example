package uk.me.uohiro.gof.decorator;

public class UpDownBorder extends Border {
	private char borderChar;
	
	public UpDownBorder(Display display, char borderChar) {
		super(display);
		
		this.borderChar = borderChar;
	}
	
	@Override
	public int getColumns() {
		return display.getColumns();
	}

	@Override
	public int getRows() {
		return display.getRows() + 2;
	}

	@Override
	public String getRowText(int row) {
		if (row == 0 || row == display.getRows() + 1) {
			return makeLine(borderChar, display.getColumns());
		} else {
			return display.getRowText(row - 1);
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
