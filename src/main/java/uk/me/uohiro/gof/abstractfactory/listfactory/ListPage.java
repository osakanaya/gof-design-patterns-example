package uk.me.uohiro.gof.abstractfactory.listfactory;

import uk.me.uohiro.gof.abstractfactory.factory.Item;
import uk.me.uohiro.gof.abstractfactory.factory.Page;

public class ListPage extends Page {
	public ListPage(String title, String author) {
		super(title, author);
	}
	
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("<html><head><title>" + getTitle()+ "</title></head>\n");
		buffer.append("<body>");
		buffer.append("<h1>" + getTitle() + "</h1>\n");
		
		buffer.append("<ul>\n");
		for(Item item : getItems()) {
			buffer.append(item.makeHTML());
		}
		buffer.append("</ul>\n");
		
		buffer.append("<hr><address>" + getAuthor() + "</address>");
		buffer.append("<body></html>\n");
		
		return buffer.toString();
	}
}
