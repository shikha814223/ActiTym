package com_ActiTime_Generics;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelData
{
	
	public static  String getData(String file_name,String Sheet_name,int rn,int cc)
	{
	try
	{
	FileInputStream file =new FileInputStream(new File(file_name));
	String data =  WorkbookFactory.create(file).getSheet(Sheet_name).getRow(rn).getCell(cc).toString();
	
	
	return data;
	}
	catch(Exception e)
	{
	return " hello";
	}
	}
	private static Object getRow(int rn) {
		// TODO Auto-generated method stub
		return null;
	}
	public static int getRowCount(String file_name,String Sheet_name)
	{
	try
	{
	FileInputStream file =new FileInputStream(new File(file_name));
	int rc=WorkbookFactory.create(file).getSheet(Sheet_name).getLastRowNum();
	return rc;
	}
	catch (Exception e)
	{
	return 0;
	}}

	public static int getCellCount(String file_name,String Sheet_name, int rn)
	{
	try
	{
	FileInputStream file=new FileInputStream(new File(file_name));
	int cc= WorkbookFactory.create(file).getSheet(Sheet_name).getRow(rn).getLastCellNum();
	return  cc;
	}

	catch(Exception e)
	{
	return 0;
	}
	
	}
}





