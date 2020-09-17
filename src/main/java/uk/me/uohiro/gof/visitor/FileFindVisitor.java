package uk.me.uohiro.gof.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FileFindVisitor extends Visitor {
	private String fileExtension;
	private List<File> foundFiles = new ArrayList<>();
	
	public FileFindVisitor(String fileExtension) {
		this.fileExtension = fileExtension;
	}
	
	@Override
	public void visit(File file) {
		if (file.getName().endsWith(fileExtension)) {
			this.foundFiles.add(file);
		}
	}

	@Override
	public void visit(Directory directory) {
		Iterator<Entry> iterator = directory.iterator();
		while (iterator.hasNext()) {
			Entry entry = iterator.next();
			entry.accept(this);
		}
	}
	
	public List<File> getFoundFiles() {
		return Collections.unmodifiableList(foundFiles);
	}
}
