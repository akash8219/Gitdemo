package PageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Hrms.Application.Login;

public class LoginApplication extends Login {
	
	private By username= By.xpath("//input[@name='username']");
	private By password = By.name("password");
	private By click= By.xpath("//input[@value='Login']");
	
	public WebElement username()
	{
		return driver.findElement(username);
	}
	
	public WebElement pass()
	{
		return driver.findElement(password);
	}

	public WebElement submit()
	{
		return driver.findElement(click);
	}
}
