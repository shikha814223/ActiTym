package com_ActiTime_Tests;

import org.testng.annotations.Test;

import com_ActiTime_Generics.BaseTest;
import com_ActiTime_Generics.ExcelData;
import com_ActiTime_Pages.ActiTimeEnterTrackPage;
import com_ActiTime_Pages.ActiTimeLogin_Page;

public class ValidLoginLogoutTest extends BaseTest
{
@Test(priority=1)
public void ValidLoginLogout()
{

	String un=ExcelData.getData(filepath, "TC01", 1, 0);
	String pwd=ExcelData.getData(filepath, "TC01", 1, 1);
	String lgTitle=ExcelData.getData(filepath, "TC01", 1, 2);
	String hpTitle=ExcelData.getData(filepath, "TC01", 1, 3);
	
	ActiTimeLogin_Page lp=new ActiTimeLogin_Page(driver);
	ActiTimeEnterTrackPage hp=new ActiTimeEnterTrackPage(driver);
	lp.verifyTitle(lgTitle);
	lp.EnterUserName(un);
	lp.EnterPassword(pwd);
	lp.ClickOnLogin();
	lp.verifyTitle(hpTitle);
	
	
}

}
