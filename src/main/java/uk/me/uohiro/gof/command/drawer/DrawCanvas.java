package uk.me.uohiro.gof.command.drawer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import uk.me.uohiro.gof.command.command.MacroCommand;

public class DrawCanvas extends Canvas implements Drawable {

	private static final long serialVersionUID = 793828587222716592L;
	private static final int RADIUS = 6;

	private MacroCommand history;
	private Color color = Color.red;
	
	public DrawCanvas(int width, int height, MacroCommand history) {
		setSize(width, height);
		setBackground(Color.white);
		
		this.history = history;
	}
	
	@Override
	public void paint(Graphics g) {
		history.execute();
	}

	@Override
	public void draw(int x, int y) {
		Graphics g = getGraphics();
		g.setColor(color);
		g.fillOval(x - RADIUS, y - RADIUS, RADIUS * 2, RADIUS * 2);
	}

	@Override
	public void setColor(Color color) {
		this.color = color;
	}

}
