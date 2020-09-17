package uk.me.uohiro.gof.command.drawer;

import java.awt.Color;

public interface Drawable {
	public abstract void draw(int x, int y);
	public abstract void setColor(Color color);
}
