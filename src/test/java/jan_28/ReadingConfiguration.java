package jan_28;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadingConfiguration {
	
	
	@Test
	public void readConfig() throws IOException {
		File file = new File(System.getProperty("user.dir")+"//config//config.properties");
		Properties property = new Properties();
		FileInputStream fis = new FileInputStream(file);
		property.load(fis);
		
		System.out.println(property.getProperty("stagingURL"));
		System.out.println(property.getProperty("headless"));
		
		// if value is not present in property file then it will return "null"
		System.out.println(property.getProperty("city"));
	}

}
