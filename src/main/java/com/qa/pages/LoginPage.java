package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="ap_email")
	WebElement email;
	
	@FindBy(id="continue")
	WebElement continuebtn;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement loginbtn;
	
	@FindBy(className="a-link-nav-icon")
	WebElement logo;
	
	
	public String validateTitle()
	{
		return driver.getTitle();
	}
	public boolean validateLogo()
	{
		return logo.isDisplayed();
	   
	}
	
	public HomePage validateLogin()
	{
		email.sendKeys(prop.getProperty("username"));
		continuebtn.click();
		password.sendKeys(prop.getProperty("password"));
		loginbtn.click();
		return new HomePage();
	}

}
