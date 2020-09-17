package uk.me.uohiro.gof.interpreter.language;

public class InterpreterFacade {

	private ExecutorFactory factory;
	private Context context;
	private Node programNode;
	
	public InterpreterFacade(ExecutorFactory factory) {
		this.factory = factory;
	}
	
	public boolean parse(String text) {

		this.context = new Context(text);
		this.context.setExecutorFactory(factory);
		this.programNode = new ProgramNode();
		
		try {
			programNode.parse(context);
			System.out.println("" + programNode);
		} catch (ParseException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public void execute() throws ExecuteException {
		try {
			programNode.execute();
		} catch (ExecuteException e) {
			e.printStackTrace();
		}
	}
}
