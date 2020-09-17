package uk.me.uohiro.gof.observer.ex02;

import java.awt.TextField;

import uk.me.uohiro.gof.observer.NumberGenerator;
import uk.me.uohiro.gof.observer.Observer;

public class GraphText extends TextField implements Observer {

	private static final long serialVersionUID = -5149778983552913632L;
	
	public GraphText(int columns) {
		super(columns);
	}

	@Override
	public void update(NumberGenerator generator) {
		int number = generator.getNumber();
		String text = number + ":";
		
		for(int i = 0; i < number; i++) {
			text += '*';
		}
		
		setText(text);
	}

}
