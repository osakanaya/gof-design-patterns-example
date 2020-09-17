package uk.me.uohiro.gof.chainofresponsibility;

public abstract class Support {
	private String name;
	private Support next;
	
	public Support(String name) {
		this.name = name;
	}
	
	public Support setNext(Support next) {
		this.next = next;
		
		return next;
	}
	
	public final void support(Trouble trouble) {
		for (Support support = this; ; support = support.next) {
			if (support.resolve(trouble)) {
				support.done(trouble);
				return;
			}

			if (support.next == null) {
				support.fail(trouble);
				return;
			}
		}
		
		
//		if (resolve(trouble)) {
//			done(trouble);
//		} else if (next != null) {
//			next.support(trouble);
//		} else {
//			fail(trouble);
//		}
	}
	
	public String toString() {
		return "[" + name + "]";
	}
	
	protected abstract boolean resolve(Trouble trouble);
	
	protected void done(Trouble trouble) {
		System.out.println(trouble + " is resolved by " + this + ".");
	}
	
	protected void fail(Trouble trouble) {
		System.out.println(trouble + " cannot be resolved.");
	}
}
