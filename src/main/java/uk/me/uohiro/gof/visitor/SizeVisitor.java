package uk.me.uohiro.gof.visitor;

import java.util.Iterator;

public class SizeVisitor extends Visitor {
	private int totalSize;
	
	public SizeVisitor() {
		this.totalSize = 0;
	}
	
	public int getTotalSize() {
		return totalSize;
	}

	@Override
	public void visit(File file) {
		totalSize = totalSize + file.getSize();
	}

	@Override
	public void visit(Directory directory) {
		Iterator<Entry> iterator = directory.iterator();
		while (iterator.hasNext()) {
			Entry entry = iterator.next();
			entry.accept(this);
		}
	}

}
