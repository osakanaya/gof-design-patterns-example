package uk.me.uohiro.gof.adapter.ex02;

import java.io.IOException;
import java.util.Optional;

public interface FileIO {
	public void readFromFile(String filename) throws IOException;
	public void writeToFile(String filename) throws IOException;
	public void setValue(String key, String value);
	public Optional<String> getValue(String key);
}
