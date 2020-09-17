package uk.me.uohiro.gof.builder.ex02;

public class TextBuilder extends Builder {
	private StringBuffer buffer = new StringBuffer();
	
	@Override
	public void buildTitle(String title) {
		buffer.append("===============================\n");
		buffer.append(" Åu" + title + "Åv \n");
		buffer.append("\n");
	}

	@Override
	public void buildString(String string) {
		buffer.append("Å°" + string + "\n");
		buffer.append("\n");
	}

	@Override
	public void buildItems(String[] items) {
		for (int i = 0; i < items.length; i++) {
			buffer.append("  ÅE" + items[i] + "\n");
		}
		
		buffer.append("\n");
	}

	@Override
	public void buildDone() {
		buffer.append("===============================\n");
	}

	public String getResult( ) {
		return buffer.toString();
	}
}
