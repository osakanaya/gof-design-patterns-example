package uk.me.uohiro.gof.abstractfactory.tablefactory;

import uk.me.uohiro.gof.abstractfactory.factory.Item;
import uk.me.uohiro.gof.abstractfactory.factory.Page;

public class TablePage extends Page {

	public TablePage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("<html><head><title>" + getTitle() + "</title></head>\n");
		buffer.append("<body>");
		buffer.append("<h1>" + getTitle() + "</h1>\n");
		
		buffer.append("<table width=\"80%\" border=\"3\">\n");
		for(Item item : getItems()) {
			buffer.append("<tr>" + item.makeHTML() + "</tr>");
		}
		buffer.append("</table>\n");
		
		buffer.append("<hr><address>" + getAuthor() + "</address>");
		buffer.append("<body></html>\n");
		
		return buffer.toString();
	}

}
