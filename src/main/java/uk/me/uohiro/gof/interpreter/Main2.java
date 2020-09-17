package uk.me.uohiro.gof.interpreter;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import uk.me.uohiro.gof.interpreter.language.ExecuteException;
import uk.me.uohiro.gof.interpreter.language.InterpreterFacade;
import uk.me.uohiro.gof.interpreter.language.turtole.TurtleCanvas;

public class Main2 extends Frame implements ActionListener {

	private static final long serialVersionUID = -8996022769715923078L;
	
	private TurtleCanvas canvas = new TurtleCanvas(400, 400);
	private InterpreterFacade facade = new InterpreterFacade(canvas);
	private TextField programTextField = new TextField("program repeat 3 go right go left end end");
	
	public Main2(String title) {
		super(title);
		
		setLayout(new BorderLayout());
		programTextField.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		add(programTextField, BorderLayout.NORTH);
		add(canvas, BorderLayout.CENTER);
		
		pack();
		setVisible(true);
		
		parseAndExecute();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == programTextField) {
			parseAndExecute();
		}
	}

	private void parseAndExecute() {
		String programText = programTextField.getText();
		System.out.println("programText = " + programText);
		
		facade.parse(programText);
		repaint();
	}

	@Override
	public void paint(Graphics g) {
		canvas.initialize();
		
		try {
			facade.execute();
		} catch (ExecuteException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Main2("Interpreter Pattern Example");
	}

	
	
}
