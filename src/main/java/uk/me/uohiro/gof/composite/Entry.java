package uk.me.uohiro.gof.composite;

public abstract class Entry {
	protected Entry parent;
	
	public abstract String getName();
	public abstract int getSize();

	public Entry add(Entry entry) throws FileTreatmentException {
		throw new FileTreatmentException();
	}
	
	public void printList() {
		printList("");
	}
	
	protected abstract void printList(String prefix);
	
	public String getFullName() {
		StringBuffer buffer = new StringBuffer();
		
		Entry entry = this;
		do {
			buffer.insert(0, "/" + entry.getName());
			entry = entry.parent;
		} while (entry != null);
		
		return buffer.toString();
	}
	
	public String toString() {
		return getName() + " (" + getSize() + ")";
	}
}
