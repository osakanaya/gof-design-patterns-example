package uk.me.uohiro.gof.adapter.ex02;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		FileIO f = new FileProperties();
		try {
			f.readFromFile("C:\\temp\\file.txt");
				
			System.out.println(f.getValue("year").orElseGet(() -> "No property defined."));
			System.out.println(f.getValue("month").orElseGet(() -> "No property defined."));
			
			f.setValue("year", "2000");
			f.setValue("month", "11");
			f.setValue("day", "20");
			
			f.writeToFile("c:\\temp\\newFile.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
