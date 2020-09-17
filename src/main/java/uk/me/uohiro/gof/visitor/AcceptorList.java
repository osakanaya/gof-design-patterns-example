package uk.me.uohiro.gof.visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class AcceptorList extends ArrayList<Acceptor> implements Acceptor {
	private static final long serialVersionUID = 1L;

	@Override
	public void accept(Visitor visitor) {
		Iterator<Acceptor> iterator = this.iterator();
		while (iterator.hasNext()) {
			Acceptor acceptor = iterator.next();
			acceptor.accept(visitor);
		}
	}

}
