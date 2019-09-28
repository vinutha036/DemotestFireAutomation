package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.util.TestUtils;

public class TestBase {
	
	public static Properties prop;
	public static WebDriver driver;
	public TestBase(){
		prop = new Properties();
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("E:\\Batch15\\DemotestFireAutomation\\src\\main\\java\\com\\qa"
					+ "\\properties\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fin);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void initialization()
	{
		if(prop.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(prop.getProperty("browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\Selenium\\firefoxdriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TestUtils.implicitwaittime, TimeUnit.SECONDS);
		
	}

}
