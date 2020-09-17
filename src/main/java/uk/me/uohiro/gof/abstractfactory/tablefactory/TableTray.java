package uk.me.uohiro.gof.abstractfactory.tablefactory;

import uk.me.uohiro.gof.abstractfactory.factory.Item;
import uk.me.uohiro.gof.abstractfactory.factory.Tray;

public class TableTray extends Tray {
	
	public TableTray(String caption) {
		super(caption);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("<td>");
		buffer.append("<table width=\"100%\" border=\"1\"><tr>");
		buffer.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"" + getItems().size() + "\"><b>"
				+ getCaption() + "</b></td>");
		buffer.append("</tr>\n");
		
		buffer.append("<tr>\n");
		for(Item item : getItems()) {
			buffer.append(item.makeHTML());
		}
		buffer.append("</tr></table>");
		buffer.append("</td>");
		
		return buffer.toString();
	}

}
