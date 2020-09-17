package uk.me.uohiro.gof.visitor;

public interface Acceptor {
	public abstract void accept(Visitor visitor);
}
