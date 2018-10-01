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
import com.qa.sasta.pages.MyOrdersPage;

public class HomePageTest extends TestBase
{
	HomePage homepage;
	LoginPage loginpage;
	MyOrdersPage myorderspage;
	HouseholdSuppliesPage householdsupplies;
	
	public HomePageTest() throws IOException
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
	public void validateHealthArticlesImgTest()
	{
		boolean flag = homepage.validateHealthArticlesImg();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void validatedisplayUserTest()
	{
		boolean flag = homepage.validatedisplayUser();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void validateviewAllGlucosebtnTest()
	{
		homepage.validateviewAllGlucosebtn();
	}
	
	@Test
	public void validatemyorderslinkTest() throws IOException
	{
		myorderspage = homepage.validatemyorderslink();
	}
	
	@Test
	public void validateHouseHoldSuppliesLinkTest() throws IOException
	{
		householdsupplies = homepage.validateHouseHoldSuppliesLink(); 
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
