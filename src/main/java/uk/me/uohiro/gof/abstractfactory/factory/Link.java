package uk.me.uohiro.gof.abstractfactory.factory;

public abstract class Link extends Item {
	private String url;
	
	public Link(String caption, String url) {
		super(caption);
		this.url = url;
	}

	protected String getUrl() {
		return url;
	}
}
