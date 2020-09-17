package uk.me.uohiro.gof.interpreter.language;

public interface ExecutorFactory {

	public abstract Executor createExecutor(String name);
}
