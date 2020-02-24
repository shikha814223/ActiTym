package com_ActiTime_Generics;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class GenricUtils 
{
	
		public static void getScreenShot(WebDriver driver,String name)
		{
		SimpleDateFormat s1 =new SimpleDateFormat("yyyy-mm-dd");
		String dd=s1.format(new Date());
		TakesScreenshot ts = (TakesScreenshot)driver ;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("./Screenshot/"+dd +name+ ".png");
		try
		{
		Files.copy(src,dest);
		}
		catch(IOException e)
		{
		}
		}
		

		public static void selectByIndex(WebElement element ,int index)
		{
		Select sel=new Select(element);
		sel.selectByIndex(index);
		}
		public static void selectByValue(WebElement element ,String value)
		{
		Select sel=new Select(element);
		sel.selectByValue(value);
		}

		public static void selectByVisibleText(WebElement element ,String text)
		{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
		}
		 public static void javaScriptClickOnOkButton(WebDriver driver)
		{
		driver.switchTo().alert().accept();
		}
		public static void javaScriptClickOnCancelButton(WebDriver driver)
		{
		driver.switchTo().alert().dismiss();
		}
		public static void javScriptEnterText(WebDriver driver,String text)
		{
		Alert a =driver.switchTo().alert();
		a.sendKeys(text);
		a.accept();
		}

}
