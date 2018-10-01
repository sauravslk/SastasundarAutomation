package com.qa.sasta.test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.sasta.base.TestBase;

public class shopByHealthPageTest extends TestBase
{
	@FindBy(xpath="//img[@title='Bath & Body']")
	WebElement BathBodyImage;
	
	@FindBy(xpath="//img[@title='Breakfast, Food & Beverages']")
	WebElement BreakFastFood;
	
	@FindBy(linkText="//@class='btn btn-default btn-lg radi0 brd0 js_viewall_1083']")
	WebElement ViewHomeCare;
	
	public shopByHealthPageTest() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean BathBodyImageCheck()
	{
		return BathBodyImage.isDisplayed();
	}
	
	public boolean BreakFastFoodCheck()
	{
		return BreakFastFood.isDisplayed();
	}
	
	public void validateViewHomeCare()
	{
		ViewHomeCare.click();
	}
}
