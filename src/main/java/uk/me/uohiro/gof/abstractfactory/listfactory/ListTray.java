package uk.me.uohiro.gof.abstractfactory.listfactory;

import uk.me.uohiro.gof.abstractfactory.factory.Item;
import uk.me.uohiro.gof.abstractfactory.factory.Tray;

public class ListTray extends Tray {
	public ListTray(String caption) {
		super(caption);
	}
	
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("<li>\n");
		buffer.append(getCaption() + "\n");
		
		buffer.append("<ul>\n");
		for(Item item : getItems()) {
			buffer.append(item.makeHTML());
		}
		buffer.append("</ul>");
		
		buffer.append("</li>");
		
		return buffer.toString();
	}
}
