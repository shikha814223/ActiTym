package com_ActiTime_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_ActiTime_Generics.BasePage;
import com_ActiTime_Generics.BaseTest;

public class ActiTimeLogin_Page extends BasePage
{
	//Declration
	@FindBy(id="username")
	private WebElement UnTB;
	@FindBy(name="pwd")
	private WebElement PwTB;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgBT;
	@FindBy(xpath="//span[text()='Username or Password is invalid. Please try again.']")
	private WebElement error;
	@FindBy(xpath="//nobr[contains(text(),'actiTIME')]")
	private WebElement version;
	//initialization
	public  ActiTimeLogin_Page(WebDriver driver)
	{
		super(driver);
		
		PageFactory.initElements(driver,this);
		
		
	}
		
	//utilization
	
	public void EnterUserName(String un)
	{
		
		UnTB.sendKeys(un);
		
	}
	public void EnterPassword(String pwd)
	{
		PwTB.sendKeys(pwd);
	}
public void ClickOnLogin()
{
	lgBT.click();
}

public String VerifyErrormsg( )
{
	 verifyElement(error);
	String aerror=error.getText();
	return aerror;
}
public String verifyVersion()
{
	 verifyElement(version);
	 String aversion=version.getText();
	 return aversion;

}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
