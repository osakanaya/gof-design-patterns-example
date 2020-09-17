package uk.me.uohiro.gof.interpreter.language;

import java.util.StringTokenizer;

public class Context {

	private ExecutorFactory factory;
	private StringTokenizer tokenizer;
	private String currentToken;
	
	public Context(String text) {
		tokenizer = new StringTokenizer(text);
		nextToken();
	}

	public void setExecutorFactory(ExecutorFactory factory) {
		this.factory = factory;
	}
	
	public Executor createExecutor(String name) {
		return factory.createExecutor(name);
	}

	public String nextToken() {
		if (tokenizer.hasMoreElements()) {
			currentToken = tokenizer.nextToken();
		} else {
			currentToken = null;
		}
		
		return currentToken;
	}
	
	public String currentToken() {
		return currentToken;
	}
	
	public void skipToken(String token) throws ParseException {
		if (!token.equals(currentToken)) {
			throw new ParseException("Warning: " + token + " is expected, but " + currentToken + " is found.");
		}
		
		nextToken();
	}
	
	public int currentNumber() throws ParseException {
		int number = 0;
		
		try {
			number = Integer.parseInt(currentToken);
		} catch (NumberFormatException e) {
			throw new ParseException("Warning: " + e);
		}
		
		return number;
	}
}
