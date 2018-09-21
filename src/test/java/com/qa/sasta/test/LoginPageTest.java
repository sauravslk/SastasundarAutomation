package com.qa.sasta.test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.sasta.base.TestBase;
import com.qa.sasta.pages.HomePage;

public class LoginPageTest extends TestBase
{
	@FindBy(xpath = "//img[@class='img-responsive']")
	WebElement sastaimage;
	
	@FindBy(xpath="//input[@name='email_mobileno']")
	WebElement loginemail;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;

	@FindBy(id="login_button")
	WebElement loginbtn;

	@FindBy(linkText="Offers")
	WebElement offersLink;
	
	public LoginPageTest() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateSastaImage()
	{
		return sastaimage.isDisplayed();
	}
	
	public boolean validateOffersLink()
	{
		return offersLink.isDisplayed();
	}
	
	public HomePage login(String name, String pwd) throws IOException
	{
		loginemail.sendKeys(prop.getProperty("name"));
		password.sendKeys(prop.getProperty("pwd"));
		loginbtn.click();
		return new HomePage();
	}
	
}
