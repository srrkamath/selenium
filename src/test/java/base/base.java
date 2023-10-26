package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties elem = new Properties();
	public static FileReader fr;
	public static FileReader fileelem;
	
	@BeforeMethod
	public void setup() throws IOException
	{
		
		if(driver==null)
		{
			FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\\\test\\\\resources\\\\configfiles\\\\config.properties");
			FileReader fileelem = new FileReader(System.getProperty("user.dir")+"\\src\\\\test\\\\resources\\\\configfiles\\\\elements.properties");
			prop.load(fr);
			elem.load(fileelem);
		}
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(prop.getProperty("testurl"));
			driver.manage().window().maximize();
		}
	}
	
	@AfterMethod
	public void closure()
	{
		driver.close();
	}

}
