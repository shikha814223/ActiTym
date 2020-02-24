package com_ActiTime_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_ActiTime_Generics.BasePage;

public  class ActiTimeEnterTrackPage extends BasePage

{
	@FindBy(id="Logout.link")
	private WebElement Logout;
	

	public ActiTimeEnterTrackPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	//utilization
	public void clickonLogout()
	{
		Logout.click();
	}

}
