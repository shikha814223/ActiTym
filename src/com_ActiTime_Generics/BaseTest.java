package com_ActiTime_Generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.TestResult;

public abstract class BaseTest implements  Autoconstant
	{
	static
	{
			
			
			System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
			}
	public WebDriver driver;
	@BeforeMethod
	public void PreCondition()
	{
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	}
	@AfterMethod
	public void postCondition(ITestResult res)
	{
	int status =res.getStatus();
	if(status==2)
	{
	String name=res.getMethod().getMethodName();

	GenricUtils.getScreenShot(driver , name);
	}
	driver.close();
	}


}
