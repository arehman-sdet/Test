package testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver ;
	public static Properties prop ;
	
	public static void initialization() {
		
		System.getProperty("", "");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
	public TestBase() {
		prop = new Properties();
		
		
		
	
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("\\C:\\Users\\Rehman\\eclipse-workspace\\FrameworkFeb2020\\src\\main\\java\\configuration\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
		
		
			
			
			
		

		


	
	
	
	
	

