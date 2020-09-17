package uk.me.uohiro.gof.facade;

import uk.me.uohiro.gof.facade.pagemaker.PageMaker;

public class Main {

	public static void main(String[] args) {
		PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");

		PageMaker.makeLinkPage("linkpage.html");
	}

}
