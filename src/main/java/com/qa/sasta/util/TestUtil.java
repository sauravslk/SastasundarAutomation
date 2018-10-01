package com.qa.sasta.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.qa.sasta.base.TestBase;

public class TestUtil extends TestBase
{
	public static Workbook book;
	public static Sheet sheet;
	public static String TESTDATA_SHEET_PATH = "C:\\Users\\Saurav\\eclipse-workspace\\SastasundarAutomationFramework\\src\\main\\java\\com\\qa\\sasta\\testdata\\SastaSundarData.xlsx";

	public TestUtil() throws IOException
	{
		super();
	}
	
	public static Object[][] getTestData(String sheetname) throws InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream(TESTDATA_SHEET_PATH);
		book = WorkbookFactory.create(fis);
		sheet = book.getSheet(sheetname);
		
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i =0;i<sheet.getLastRowNum();i++)
		{
			for (int j=i+1;j<sheet.getRow(0).getLastCellNum();j++)
			{
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
			}
		}
		
		return data;
	}
	
	
}
