package uk.me.uohiro.gof.builder.ex01;

public class TextBuilder implements Builder {
	private StringBuffer buffer = new StringBuffer();
	
	@Override
	public void makeTitle(String title) {
		buffer.append("===============================\n");
		buffer.append(" Åu" + title + "Åv \n");
		buffer.append("\n");
	}

	@Override
	public void makeString(String string) {
		buffer.append("Å°" + string + "\n");
		buffer.append("\n");
	}

	@Override
	public void makeItems(String[] items) {
		for (int i = 0; i < items.length; i++) {
			buffer.append("  ÅE" + items[i] + "\n");
		}
		
		buffer.append("\n");
	}

	@Override
	public void close() {
		buffer.append("===============================\n");
	}

	public String getResult( ) {
		return buffer.toString();
	}
}
