package com.qa.pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {
	public HomePage()
	{
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'Hello, Vinu')]")
	WebElement nameOfUser;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	@FindBy(linkText="Your Profile")
	WebElement clickOnViewProfile;
	
	
	
	

}
