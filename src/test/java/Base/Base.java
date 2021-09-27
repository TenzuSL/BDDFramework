package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	
	public WebDriver driver = null;
	public Properties prop;
	public String Website;
	
	
	public void Instantiatebrowser() 
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}
	
	public void loadproperties() throws IOException
	{
		
		prop = new Properties();
		FileInputStream loadfile = new FileInputStream("C:\\Users\\Hi\\Eclipse 2021\\Firstgertestsetup\\src\\test\\java\\Base\\Global.properties");
		prop.load(loadfile);
		Website = prop.getProperty("URL");
	}
	
	
	
	public void browserteardown()
	{
		driver.close();
		driver.quit();
	}

}
