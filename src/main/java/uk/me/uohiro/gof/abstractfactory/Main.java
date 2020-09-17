package uk.me.uohiro.gof.abstractfactory;

import uk.me.uohiro.gof.abstractfactory.factory.Factory;
import uk.me.uohiro.gof.abstractfactory.factory.Link;
import uk.me.uohiro.gof.abstractfactory.factory.Page;
import uk.me.uohiro.gof.abstractfactory.factory.Tray;

public class Main {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Usage: java Main class.name.of.ConcreteFactory");
			
			System.exit(-1);
		}
		
		Factory factory = Factory.getFactory(args[0]);
		
		Link asahi = factory.createLink("�����V��", "http://www.asahi.com/");
		Link yomiuri = factory.createLink("�ǔ��V��", "htt://www.yomiuri.co.jp/");
		
		Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
		Link jp_yahoo = factory.createLink("Yahoo! Japan", "http://www.yahoo.co.jp/");
		Link excite = factory.createLink("Excite", "http://www.excite.com/");
		Link google = factory.createLink("Google", "http://www.google.com/");
		
		Tray trayNews = factory.createTray("�V��");
		trayNews.add(asahi);
		trayNews.add(yomiuri);
		
		Tray trayYahoo = factory.createTray("Yahoo!");
		trayYahoo.add(us_yahoo);
		trayYahoo.add(jp_yahoo);
		
		Tray traySearch = factory.createTray("�T�[�`�G���W��");
		traySearch.add(trayYahoo);
		traySearch.add(excite);
		traySearch.add(google);
		
		Page page = factory.createPage("LinkPage", "�w�c �p�Y");
		page.add(trayNews);
		page.add(traySearch);
		
		page.output();
	}

}
