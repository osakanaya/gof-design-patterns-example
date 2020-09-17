package uk.me.uohiro.gof.facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
	private PageMaker() {}
	
	public static void makeWelcomePage(String mailaddr, String filename) {
		try {
			Properties mailProps = Database.getProperties("maildata");
			String username = mailProps.getProperty(mailaddr);
			
			HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
			writer.title("Welcome to " + username + "'s page!");
			writer.paragraph(username + "のページへようこそ。");
			writer.paragraph("メールまっていますね。");
			writer.mailto(mailaddr, username);
			writer.close();
			
			System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void makeLinkPage(String filename) {
		try {
			Properties mailProps = Database.getProperties("maildata");
			
			HtmlWriter writer = new HtmlWriter(new FileWriter(filename));

			writer.title("Link Page");
			mailProps.forEach((mailaddr, username) -> {
				try {
					writer.mailto((String)mailaddr, (String)username);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});

			writer.close();
			
			System.out.println(filename + " is created.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
