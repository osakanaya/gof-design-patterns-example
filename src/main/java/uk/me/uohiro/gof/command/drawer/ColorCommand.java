package uk.me.uohiro.gof.command.drawer;

import java.awt.Color;

import uk.me.uohiro.gof.command.command.Command;

public class ColorCommand implements Command {
	
	private Drawable drawable;
	private Color color;
	
	public ColorCommand(Drawable drawable, Color color) {
		this.drawable = drawable;
		this.color = color;
	}
	
	@Override
	public void execute() {
		drawable.setColor(color);
	}

}
