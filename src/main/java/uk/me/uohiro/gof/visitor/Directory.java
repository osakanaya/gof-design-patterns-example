package uk.me.uohiro.gof.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {

	private String name;
	private List<Entry> entries = new ArrayList<>();

	public Directory(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		SizeVisitor visitor = new SizeVisitor();
		visitor.visit(this);

		return visitor.getTotalSize();
	}
	
	public Entry add(Entry entry) {
		entries.add(entry);

		return this;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public Iterator<Entry> iterator() throws FileTreatmentException {
		return entries.iterator();
	}
}
