package uk.me.uohiro.gof.observer.ex02;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import uk.me.uohiro.gof.observer.NumberGenerator;
import uk.me.uohiro.gof.observer.Observer;

public class GraphCanvas extends Canvas implements Observer {

	private static final long serialVersionUID = -3708088441133992314L;

	private int number;
	
	@Override
	public void update(NumberGenerator generator) {
		number = generator.getNumber();
		
		repaint();
	}
	
	public void paint(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		
		g.setColor(Color.white);
		g.fillArc(0,  0,  width, height, 0, 360);
		g.setColor(Color.red);
		g.fillArc(0,  0,  width, height, 90, - number * 360 / 50);
	}

}
