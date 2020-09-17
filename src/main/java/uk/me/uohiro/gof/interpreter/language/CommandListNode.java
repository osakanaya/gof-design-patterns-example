package uk.me.uohiro.gof.interpreter.language;

import java.util.ArrayList;
import java.util.List;

public class CommandListNode extends Node {

	private List<Node> commandList = new ArrayList<>();
	
	@Override
	public void parse(Context context) throws ParseException {
		while (true) {
			if (context.currentToken() == null) {
				throw new ParseException("Missing 'end'");
			} else if (context.currentToken().equals("end")) {
				context.skipToken("end");
				break;
			} else {
				Node commandNode = new CommandNode();
				commandNode.parse(context);
				commandList.add(commandNode);
			}
		}
	}
	
	@Override
	public String toString() {
		return "" + commandList;
	}

	@Override
	public void execute() throws ExecuteException {
		for (int i = 0; i < commandList.size(); i++) {
			commandList.get(i).execute();
		}
	}

}
