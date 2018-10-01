package com.qa.sasta.test;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.sasta.base.TestBase;
import com.qa.sasta.pages.HomePage;
import com.qa.sasta.pages.HouseholdSuppliesPage;
import com.qa.sasta.pages.LoginPage;

public class HouseholdSuppliesPageTest extends TestBase

{
	HomePage homepage;
	LoginPage loginpage;
	HouseholdSuppliesPage householdsupplies;
	
	public HouseholdSuppliesPageTest() throws IOException
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		homepage = new HomePage();
		loginpage = new LoginPage();
		householdsupplies = new HouseholdSuppliesPage();
	}
	
	@Test
	public void validateHouseholdTitleTest()
	{
		String title = householdsupplies.validateHouseholdTitle();
		Assert.assertEquals(title, "Order Household Items, Grocery, Online Kirana Store - SastaSundar.com");
	}
	
	@Test
	public void validateHouseholdheaderTest()
	{
		boolean flag = householdsupplies.validateHouseholdheader();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void validateViewAllBreakfastBtnclickTest()
	{
		householdsupplies.validateViewAllBreakfastBtnclick();
	}
		
	@Test
	public void validatebeautytextTest()
	{
		boolean flag = householdsupplies.validatebeautytext();
		Assert.assertTrue(flag);

	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
}

