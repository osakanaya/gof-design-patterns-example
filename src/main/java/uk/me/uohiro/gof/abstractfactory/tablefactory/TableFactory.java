package uk.me.uohiro.gof.abstractfactory.tablefactory;

import uk.me.uohiro.gof.abstractfactory.factory.Factory;
import uk.me.uohiro.gof.abstractfactory.factory.Link;
import uk.me.uohiro.gof.abstractfactory.factory.Page;
import uk.me.uohiro.gof.abstractfactory.factory.Tray;

public class TableFactory extends Factory {

	@Override
	public Link createLink(String caption, String url) {
		return new TableLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new TableTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new TablePage(title, author);
	}

}
