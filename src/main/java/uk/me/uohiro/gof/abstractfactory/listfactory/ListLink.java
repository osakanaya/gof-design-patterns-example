package uk.me.uohiro.gof.abstractfactory.listfactory;

import uk.me.uohiro.gof.abstractfactory.factory.Link;

public class ListLink extends Link {
	ListLink(String caption, String url) {
		super(caption, url);
	}
	
	public String makeHTML() {
		return "<li><a href=\"" + getUrl() + "\">" + getCaption() + "</a></li>\n";
	}
}
