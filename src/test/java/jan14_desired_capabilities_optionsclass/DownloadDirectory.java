package jan14_desired_capabilities_optionsclass;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadDirectory {

	public static void main(String[] args) {
		
		File file= new File("C:\\Users\\ashu2\\OneDrive\\Desktop\\MyDownloads");
		String[] listfile = file.list();
		
		System.out.println(listfile.length);
		
		ChromeOptions opt = new ChromeOptions();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("download.default_directory", "C:\\Users\\ashu2\\OneDrive\\Desktop\\MyDownloads");
		
		opt.setExperimentalOption("prefs", map);
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://the-internet.herokuapp.com/download");
		
		driver.findElement(By.xpath("//a[normalize-space()='Copy.pdf']")).click();
		
		File file1= new File("C:\\Users\\ashu2\\OneDrive\\Desktop\\MyDownloads");
		String[] listfile1 = file1.list();
		System.out.println(listfile1.length);
		
		/*
		 * Verify file download using file class
		 * 
		 * 
		 */
		
		

	}

}
