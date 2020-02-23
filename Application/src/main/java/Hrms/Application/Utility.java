package Hrms.Application;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility extends Login {
	
    
	//Send Value to the Field
		public static void sendkeys(WebElement xpath,WebDriver driver,int timeout,String value) throws InterruptedException
		{
			WebElement element = null;
			element = new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable((xpath)));
			element.sendKeys(value);
		
		}

		public static void click(WebElement xpath,WebDriver driver, int timeout)
		{
			WebElement element;
			element= new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(xpath));
			element.click();
		}
		

	}
