package uk.me.uohiro.gof.abstractfactory.factory;

public abstract class Item implements HTMLable {
	private String caption;
	
	public Item(String caption) {
		this.caption = caption;
	}
	
	protected String getCaption() {
		return caption;
	}
}
