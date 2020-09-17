package uk.me.uohiro.gof.flyweight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BigChar {

	@SuppressWarnings("unused")
	private char charName;
	private String fontData;
	
	public BigChar(char charName) {
		this.charName = charName;

		try (InputStream is = this.getClass().getClassLoader().getResourceAsStream("big" + charName + ".txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
			
			String line;
			StringBuffer buffer = new StringBuffer();
			while ((line = reader.readLine()) != null) {
				buffer.append(line);
				buffer.append("\n");
			}
			
			this.fontData = buffer.toString();
		} catch (IOException e) {
			this.fontData = charName + "?";
		}		
	}

	public void print() {
		System.out.println(fontData);
	}
	
}
