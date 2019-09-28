package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginTestclass extends TestBase {
	LoginPage lg;
	HomePage homepage;
	public LoginTestclass()
	{
		super();
	}
	@BeforeMethod
	public void inittest()
	{
		initialization();
		 lg=new LoginPage();
	}
	
	@Test(priority=1)
	public void titleTest()
	{
		
		String title=lg.validateTitle();
		Assert.assertEquals(title, "Amazon Sign In");
	}
	@Test(priority=2)
	public void logoTest()
	{
		boolean vl=lg.validateLogo();
		Assert.assertTrue(vl);
	}
	
	@Test(priority=3)
	public void loginTest()
	{
		homepage=lg.validateLogin();
	}
   @AfterMethod
   public void close() {
	   driver.quit();
   }
   
}
