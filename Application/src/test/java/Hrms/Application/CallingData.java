package Hrms.Application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Data.Calldata;
import Data.Excelfiledata;
import PageObject.LoginApplication;

public class CallingData extends Login {
	 
	@Test
	public void testcase1() throws IOException
	{
		Login l = new Login();
		l.login();
	}
	
	@Test
	public void testcase2() throws IOException, InterruptedException
	{
						

		Excelfiledata a  = new Excelfiledata();
	     ArrayList al = a.filedata("");
		String username=al.get(0).toString();
		String password=al.get(1).toString();
		Utility u = new Utility();
		LoginApplication ac = new LoginApplication();
//		ac.username().sendKeys(username);
//		ac.pass().sendKeys(password);
//		ac.submit().click();
		Utility.sendkeys(ac.username(), driver, 10, username);
		Utility.sendkeys(ac.pass(), driver, 10, password);
		Utility.click(ac.submit(), driver, 10);
		
	}

		
}
