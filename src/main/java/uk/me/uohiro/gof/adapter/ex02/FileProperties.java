package uk.me.uohiro.gof.adapter.ex02;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Optional;
import java.util.Properties;

public class FileProperties implements FileIO {
	private Properties props;
	
	public FileProperties() {
		this.props = new Properties();
	}
	
	public void readFromFile(String filename) throws IOException {
		this.props.load(Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8));
	}

	public void writeToFile(String filename) throws IOException {
		this.props.store(Files.newBufferedWriter(
				Paths.get(filename), 
				StandardCharsets.UTF_8,
				StandardOpenOption.CREATE), "Written by FileProperties");
	}

	public void setValue(String key, String value) {
		this.props.setProperty(key, value);
	}

	public Optional<String> getValue(String key) {
		return Optional.ofNullable(this.props.getProperty(key));
	}
	
}
