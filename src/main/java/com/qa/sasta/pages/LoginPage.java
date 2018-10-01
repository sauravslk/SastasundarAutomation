package com.qa.sasta.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.sasta.base.TestBase;

public class LoginPage extends TestBase
{
	@FindBy(name="email_mobileno")
	WebElement emailId;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath ="//img[@class='img-responsive']")
	WebElement sastaIcon;
	
	@FindBy(id= "login_button")
	WebElement loginbtn;
	
	@FindBy(linkText = "Offers")
	WebElement offersLink;
	
	public LoginPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateSastaImage()
	{
		return sastaIcon.isDisplayed();
	}
	
	public boolean offersLinkcheck()
	{
		return offersLink.isDisplayed();
	}

	public HomePage validateLoginButton(String id, String pwd) throws IOException
	{
		emailId.sendKeys(prop.getProperty(id));
		password.sendKeys(prop.getProperty(pwd));
		loginbtn.click();
		
		return new HomePage();
	}
}
