package uk.me.uohiro.gof.decorator;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {
	private List<String> rows = new ArrayList<>();
	private int maxColumns = 0;

	public MultiStringDisplay() {
	}
	
	public void addRow(String row) {
		this.rows.add(row);
		
		this.maxColumns = rows.stream().mapToInt(str -> str.getBytes().length).max().orElse(0);
	}
	
	@Override
	public int getColumns() {
		return maxColumns;
	}

	@Override
	public int getRows() {
		return rows.size();
	}

	@Override
	public String getRowText(int row) {
		StringBuffer trailingSpaces = new StringBuffer();
		
		for(int i = 0; i < maxColumns - rows.get(row).getBytes().length; i++) {
			trailingSpaces.append(' ');
		}
		
		return rows.get(row) + trailingSpaces.toString();
	}

}
