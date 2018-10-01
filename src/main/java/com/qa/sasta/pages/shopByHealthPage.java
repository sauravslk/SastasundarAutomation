package com.qa.sasta.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.sasta.base.TestBase;

public class shopByHealthPage extends TestBase
{

	@FindBy(xpath="//h1[contains(text(),'Shop by Health')]")
	WebElement ShopByHealthImg;
	
	@FindBy(xpath="//h3[contains(text(),'Quit Smoking')]")
	WebElement QuitSmokingImg;
	
	@FindBy(xpath="//a[contains(@href,'herbal') and contains(text(),'View All')")
	WebElement ViewAllHerbal;
	
	public shopByHealthPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}

	
	public boolean validateShopByHealthImg()
	{
		return ShopByHealthImg.isDisplayed();
	}
	
	public boolean validateQuitSmokingImg()
	{
		return QuitSmokingImg.isDisplayed();
	}
	
	public void validateViewAllHerbalBtn()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;  
        js.executeScript("arguments[0].click();", ViewAllHerbal);

	}
	
	
}
