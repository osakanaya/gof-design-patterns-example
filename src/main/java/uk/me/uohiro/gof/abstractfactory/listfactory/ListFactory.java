package uk.me.uohiro.gof.abstractfactory.listfactory;

import uk.me.uohiro.gof.abstractfactory.factory.Factory;
import uk.me.uohiro.gof.abstractfactory.factory.Link;
import uk.me.uohiro.gof.abstractfactory.factory.Page;
import uk.me.uohiro.gof.abstractfactory.factory.Tray;

public class ListFactory extends Factory {

	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new ListPage(title, author);
	}

}
