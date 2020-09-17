package uk.me.uohiro.gof.abstractfactory.tablefactory;

import uk.me.uohiro.gof.abstractfactory.factory.Link;

public class TableLink extends Link {

	public TableLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		return "<td><a href=\"" + getUrl() + "\">" + getCaption() + "</a></td>\n";
	}

}
