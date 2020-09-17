package uk.me.uohiro.gof.builder.ex02;

public abstract class Builder {
	private boolean initialized = false;
	
	public void makeTitle(String title) {
		if (!initialized) {
			buildTitle(title);
			initialized = true;
		}
	}
	
	public void makeString(String string) throws Exception {
		if (!initialized) {
			throw new Exception("Builder not initialzed.");
		}
		
		buildString(string);
	}
	
	public void makeItems(String[] items) throws Exception {
		if (!initialized) {
			throw new Exception("Builder not initialzed.");
		}
		
		buildItems(items);
	}
	
	public void close() throws Exception {
		if (!initialized) {
			throw new Exception("Builder not initialzed.");
		}
		
		buildDone();
	}
	
	public abstract void buildTitle(String title);
	public abstract void buildString(String string);
	public abstract void buildItems(String[] items);
	public abstract void buildDone();
	
	
}
