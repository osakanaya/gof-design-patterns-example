package uk.me.uohiro.gof.command.drawer;

import java.awt.Point;

import uk.me.uohiro.gof.command.command.Command;

public class DrawCommand implements Command {

	protected Drawable drawable;
	private Point position;
	
	public DrawCommand(Drawable drawable, Point position) {
		this.drawable = drawable;
		this.position = position;
	}
	
	@Override
	public void execute() {
		drawable.draw(position.x, position.y);
	}

}
