package uk.me.uohiro.gof.interpreter.language.turtole;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import uk.me.uohiro.gof.interpreter.language.Executor;
import uk.me.uohiro.gof.interpreter.language.ExecutorFactory;

public class TurtleCanvas extends Canvas implements ExecutorFactory {

	private static final long serialVersionUID = 6687471564694072757L;

	final static int UNIT_LENGTH = 30;

	final static int DIRECTION_UP = 0;
	final static int DIRECTION_RIGHT = 3;
	final static int DIRECTION_DOWN = 6;
	final static int DiRECTION_LEFT= 9;
	
	final static int RELATIVE_DIRECTION_RIGHT = 3;
	final static int RELATIVE_DIRECTION_LEFT = -3;
	
	final static int RADIUS = 3;
	
	private int direction = 0;
	private Point position;
	
	public TurtleCanvas(int width, int height) {
		setSize(width, height);
		initialize();
	}
	
	public void initialize() {
		Dimension size = getSize();
		
		position = new Point(size.width / 2, size.height / 2);
		direction = 0;

		setForeground(Color.red);
		setBackground(Color.white);
		
		Graphics g = getGraphics();
		if (g != null) {
			g.clearRect(0, 0, size.width, size.height);
		}
	}
	
	@Override
	public Executor createExecutor(String name) {
		if (name.equals("go")) {
			return new GoExecutor(this);
		} else if (name.equals("right")) {
			return new DirectionExecutor(this, RELATIVE_DIRECTION_RIGHT);
		} else if (name.equals("left")) {
			return new DirectionExecutor(this, RELATIVE_DIRECTION_LEFT);
		} else {
			return null;
		}
	}
	
	abstract class TurtleExecutor implements Executor {
		protected TurtleCanvas canvas;
		
		public TurtleExecutor(TurtleCanvas canvas) {
			this.canvas = canvas;
		}
		
		public abstract void execute();
	}
	
	class GoExecutor extends TurtleExecutor {
		public GoExecutor(TurtleCanvas canvas) {
			super(canvas);
		}
		
		public void execute() {
			canvas.go(TurtleCanvas.UNIT_LENGTH);
		}
	}
	
	class DirectionExecutor extends TurtleExecutor {
		private int relativeDirection;
		
		public DirectionExecutor(TurtleCanvas canvas, int relativeDirection) {
			super(canvas);
			this.relativeDirection = relativeDirection;
		}
		
		public void execute() {
			canvas.setRelativeDirection(relativeDirection);
		}
	}

	void go(int length) {
		int newX = position.x;
		int newY = position.y;
		
		switch (direction) {
			case DIRECTION_UP:
				newY -= length;
				break;
			case DIRECTION_RIGHT:
				newX += length;
				break;
			case DIRECTION_DOWN:
				newY += length;
				break;
			case DiRECTION_LEFT:
				newX -= length;
				break;
			default:
				break;
		}
		
		Graphics g = getGraphics();
		if (g != null) {
			g.drawLine(position.x, position.y, newX, newY);
			g.fillOval(newX - RADIUS, newY - RADIUS, RADIUS * 2 + 1, RADIUS * 2 + 1);
		}
		
		position.x = newX;
		position.y = newY;
	}

	void setRelativeDirection(int relativeDirection) {
		setDirection(direction + relativeDirection);
	}

	void setDirection(int direction) {
		if (direction < 0) {
			direction = 12 - (-direction) % 12;
		} else {
			direction = direction % 12;
		}
		
		this.direction = direction % 12;
	}

}
