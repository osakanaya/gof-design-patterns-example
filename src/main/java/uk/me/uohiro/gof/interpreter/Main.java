package uk.me.uohiro.gof.interpreter;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import uk.me.uohiro.gof.interpreter.language.Context;
import uk.me.uohiro.gof.interpreter.language.Node;
import uk.me.uohiro.gof.interpreter.language.ProgramNode;

public class Main {

	public static void main(String[] args) {
		try (InputStream is = Main.class.getClassLoader().getResourceAsStream("program.txt");
				BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {

			String text;
			
			while ((text = reader.readLine()) != null) {
				System.out.println("text = \"" + text + "\"");
				
				Node node = new ProgramNode();
				node.parse(new Context(text));
				
				System.out.println("node = " + node);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
