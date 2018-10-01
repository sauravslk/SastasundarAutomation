package com.qa.sasta.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.sasta.base.TestBase;

public class HomePage extends TestBase
{
	@FindBy(xpath="//h2[contains(text(),'Health Articles')]")
	WebElement HealthArticlesImg;
	
	@FindBy(linkText="SAURAV")
	WebElement displayUser;
	
	@FindBy(xpath="//a[contains(@href,'glucose')] and contains(text(),'View All')")
	WebElement viewAllGlucose;
	
	@FindBy(linkText="MY ORDERS")
	WebElement myorderslink;
	
	@FindBy(linkText=" Household Supplies")
	WebElement householdsupplieslink;
	
	public HomePage() throws IOException
	{
		PageFactory.initElements(driver, this);

	}
	
	public boolean validateHealthArticlesImg()
	{
		return HealthArticlesImg.isDisplayed();
	}
	
	public boolean validatedisplayUser()
	{
		return displayUser.isDisplayed();
	}
	
	public void validateviewAllGlucosebtn()
	{
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click;", viewAllGlucose);
	}
	
	public MyOrdersPage validatemyorderslink() throws IOException
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(displayUser).build().perform();
		myorderslink.click();
		return new MyOrdersPage();
	}
	
	public HouseholdSuppliesPage validateHouseHoldSuppliesLink() throws IOException
	{
		householdsupplieslink.click();
		return new HouseholdSuppliesPage();
	}
	
}
