package com.qa.sasta.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.sasta.base.TestBase;

public class HomePage extends TestBase
{
	@FindBy(xpath="//div[@class='col-lg-12 ng-scope']//div[1]//div[1]//h4")
	WebElement currentOrders;
	
	@FindBy(xpath ="//div[@class='col-lg-12 accountsec']//h4[2]")
	WebElement labTestBookings;
	
	@FindBy(xpath ="//div[@class='col-lg-12 accountsec']//h4[3]")
	WebElement doctorAppointment;
	
	@FindBy(xpath="//div[@class='col-lg-12 accountsec']//h4[5]")
	WebElement paymentRewards;

	public HomePage() throws IOException
	{
		super();
	}

}
