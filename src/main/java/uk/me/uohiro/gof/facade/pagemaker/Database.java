package uk.me.uohiro.gof.facade.pagemaker;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

class Database {

	private Database() {}
	
	public static Properties getProperties(String dbname) {
		String filename = dbname + ".txt";
		InputStream is = null;
		Properties props = new Properties();
		
		try {
			is = Database.class.getClassLoader().getResourceAsStream(filename);
			props.load(is);
		} catch (IOException e) {
			System.out.println("Warning: " + filename + " is not found.");
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (Exception e) {}
			}
		}
		
		return props;
	}
}
