package com.qa.sasta.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.sasta.base.TestBase;
import com.qa.sasta.pages.HomePage;
import com.qa.sasta.pages.LoginPage;
import com.qa.sasta.pages.MyOrdersPage;
import com.qa.sasta.util.TestUtil;

public class MyOrdersPageTest extends TestBase
{
	HomePage homepage;
	LoginPage loginpage;
	MyOrdersPage myorderspage;


	public MyOrdersPageTest() throws IOException 
	{
		super();
	}
	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		homepage = new HomePage();
		loginpage = new LoginPage();
		myorderspage = new MyOrdersPage();
	}
	
	@Test
	public void currentOrdersDisplayCheckTest()
	{
		boolean flag = myorderspage.currentOrdersDisplayCheck();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void labTestBookingsDisplayCheckTest()
	{
		boolean flag = myorderspage.labTestBookingsDisplayCheck();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void doctorAppointmentDisplayCheckTest()
	{
		boolean flag = myorderspage.doctorAppointmentDisplayCheck();
		Assert.assertTrue(flag);
	}
	
	@DataProvider
	public Object[][] getTestdata() throws InvalidFormatException, IOException
	{
		Object[][] data = TestUtil.getTestData("MemberDetails");
		return data;
	}
	
	@Test(dataProvider="getTestdata")
	public void addNewMedicalHistTest(String memname, String name, String bGroup, String Mstatus, String Smokingstatus, 
			String aStatus, String TobaccoStatus, int Height, int Weight)
	{
		myorderspage.addNewMedicalHist(memname, name, bGroup, Mstatus, Smokingstatus, aStatus, TobaccoStatus, Height, Weight);
	}
	
	
}
