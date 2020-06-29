package resourc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicConfiguration {
	
	public WebDriver driver;
	public Properties prop;
	 
	public WebDriver initializeBrowser() throws IOException {
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\personal\\eclipse-workspace\\flipkart\\src\\main\\java\\resourc\\CommonPropertiesfile.Properties");
		prop.load(fis);
		
		String BrowserName=prop.getProperty("browser");
		if (BrowserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C://Users//personal//Downloads//GeckoDriver.exe");
			driver=new FirefoxDriver();
		}
		
		else if(BrowserName.equalsIgnoreCase("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "")
			System.out.println("Chrome");
		}
		
		return driver;
		
	}
	 

}
