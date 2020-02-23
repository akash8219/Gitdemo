package Hrms.Application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Login {
	public static WebDriver driver;
	
	Properties pro;
	private static Logger log= LogManager.getLogger(Login.class.getName());
 @Test
public WebDriver login() throws IOException
{
	
	 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chrome1\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 pro= new Properties();
	 FileInputStream fis = new FileInputStream("C:\\Users\\Akash\\workspace\\Application\\src\\main\\java\\ObjectRepository\\Url");
	 pro.load(fis);
	 driver.get(pro.getProperty("Malaysia208"));
	 log.info("Url launched successfully");
	 String a="hello";
	 return driver;
	 
	
}
}
