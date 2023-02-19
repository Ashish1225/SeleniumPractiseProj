package jan_28;

import java.io.IOException;

import org.testng.annotations.Test;

import helper.ConfigurationReader;

public class ReadingConfiguration2 {
	
	
	@Test
	public void readConfig() throws IOException {
		
		//calling ConfigurationReaders
		String stageUrl = ConfigurationReader.getProperty("stagingURL");
		
		System.out.println(stageUrl);
		
		// if value is not present in property file then it will return "null"
		
	}

}
