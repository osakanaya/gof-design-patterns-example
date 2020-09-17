package uk.me.uohiro.gof.observer.ex02;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import uk.me.uohiro.gof.observer.NumberGenerator;
import uk.me.uohiro.gof.observer.Observer;

public class FrameObserver extends Frame implements Observer, ActionListener {
	private static final long serialVersionUID = -7429275018408917567L;

	private GraphText graphText = new GraphText(60);
	private GraphCanvas graphCanvas = new GraphCanvas();
	private Button closeButton = new Button("Close");

	@SuppressWarnings("deprecation")
	public FrameObserver() {
		
		super("FrameObserver");
		
		setLayout(new BorderLayout());
		setBackground(Color.lightGray);
		graphText.setEditable(false);
		graphCanvas.setSize(500, 500);
		
		add(graphText, BorderLayout.NORTH);
		add(graphCanvas, BorderLayout.CENTER);
		add(closeButton, BorderLayout.SOUTH);
		
		closeButton.addActionListener(this);
		
		pack();
		show();
	}
	
	@Override
	public void update(NumberGenerator generator) {
		graphText.update(generator);
		graphCanvas.update(generator);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("" + e);
		System.exit(0);
	}
}
