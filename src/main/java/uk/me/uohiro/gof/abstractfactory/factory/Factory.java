package uk.me.uohiro.gof.abstractfactory.factory;

public abstract class Factory {
	public static Factory getFactory(String className) {
		Factory factory = null;

		try {
			factory = (Factory)Class.forName(className).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return factory;
	}
	
	public Page createYahooPage() {
		Link us_yahoo = createLink("Yahoo!", "http://www.yahoo.com/");
		Link jp_yahoo = createLink("Yahoo! Japan", "http://www.yahoo.co.jp/");
		
		Page page = createPage("Yahoo Link Page", "Žw“c ‰p—Y");
		page.add(us_yahoo);
		page.add(jp_yahoo);
		
		return page;
	}
	
	public abstract Link createLink(String caption, String url);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title, String author);
}
