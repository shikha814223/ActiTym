package com_ActiTime_Tests;import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com_ActiTime_Generics.BaseTest;
import com_ActiTime_Generics.ExcelData;
import com_ActiTime_Pages.ActiTimeLogin_Page;

public class InvalidLoginTest extends BaseTest

{
	@Test(priority=2)
	public void InvalidLogin() throws InterruptedException 
	{
		
String title=ExcelData.getData(filepath, "TC01", 1, 2);
ActiTimeLogin_Page lp =new ActiTimeLogin_Page(driver);
//verify login page titlelp.
lp.verifyTitle(title);


int rc =ExcelData.getRowCount(filepath,"TC02");
for(int i=1;i<=rc;i++)
{
	String un=ExcelData.getData(filepath, "TC02", i, 0);
	String pwd=ExcelData.getData(filepath, "TC02", i, 1);
	//entering the username
	Reporter.log("user name"+un, true);
	lp.EnterUserName(un);
	Reporter.log("password"+pwd, true);
	lp.EnterPassword(pwd);
	//cliclon login button
	lp.ClickOnLogin();
	String aerrormsg=lp.VerifyErrormsg();
	String eerrormsg=ExcelData.getData(filepath, "TC02", 1, 2);
	Reporter.log("This is the expected error msg"+eerrormsg, true);
	//verify error msg
	Assert.assertEquals(aerrormsg, eerrormsg);
	Reporter.log("---------------------------------------------", true);
	Thread.sleep(2000);
}
}
	
	
}



