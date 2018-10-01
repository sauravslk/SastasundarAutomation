package com.qa.sasta.test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.sasta.base.TestBase;
import com.qa.sasta.pages.HomePage;
import com.qa.sasta.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase
{
	LoginPage loginpage;
	HomePage homepage;

	public LoginPageTest() throws IOException
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
	}
	
	@Test
	public void validateSastaImageTest()
	{
		boolean flag = loginpage.validateSastaImage();
		Assert.assertTrue(flag);
	}
	
	@Test 
	public void offersLinkcheckTest()
	{
		boolean flag = loginpage.offersLinkcheck();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void validateLoginButtonTest() throws IOException
	{
		homepage = loginpage.validateLoginButton(prop.getProperty("login"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
