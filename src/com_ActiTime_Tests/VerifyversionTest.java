package com_ActiTime_Tests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com_ActiTime_Generics.BaseTest;
import com_ActiTime_Generics.ExcelData;
import com_ActiTime_Pages.ActiTimeLogin_Page;

public class VerifyversionTest extends BaseTest
{
	@Test(priority=3)
	public void Verifyversion()
	{
		String title=ExcelData.getData(filepath, "TC01", 1, 2);
		String eversion=ExcelData.getData(filepath, "TC03", 1, 0);
		ActiTimeLogin_Page lp=new ActiTimeLogin_Page(driver);
		lp.verifyTitle(title);
		String aversion=lp.verifyVersion();
		SoftAssert s2=new SoftAssert();
		//version of the application
		s2.assertEquals(aversion, eversion);
		Reporter.log("version"+aversion,true);
		s2.assertAll();
		
		
		
		
	}

}
