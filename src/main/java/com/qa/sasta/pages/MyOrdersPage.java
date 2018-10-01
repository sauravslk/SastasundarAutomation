package com.qa.sasta.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.sasta.base.TestBase;

public class MyOrdersPage extends TestBase
{
	@FindBy(xpath="//div[@class='col-lg-12 ng-scope']//div[1]//div[1]//h4")
	WebElement currentOrders;
	
	@FindBy(xpath ="//div[@class='col-lg-12 accountsec']//h4[2]")
	WebElement labTestBookings;
	
	@FindBy(xpath ="//div[@class='col-lg-12 accountsec']//h4[3]")
	WebElement doctorAppointment;
	
	@FindBy(xpath="//div[@class='col-lg-12 accountsec']//h4[5]")
	WebElement paymentRewards;

	@FindBy(linkText="Manage Medical History")
	WebElement medicalHist;

	@FindBy(xpath="//a[@class='btn icon-btn btn-success add_new_btn']")
	WebElement addNewMedicalHist;

	@FindBy(xpath="//div[@class='col-lg-3 col-md-3 text-left pad0']//select[1]")
	WebElement PhysicalExamName;
	
	@FindBy(xpath="//div[@class='col-lg-8 col-md-8 pad0']//select[@name='BloodGroup']")
	WebElement BloodGroup;
	
	@FindBy(xpath="//div[@class='col-lg-8 col-md-8 pad0']//select[@name='MaritalStatus']")
	WebElement MaritalStatus;
	
	@FindBy(xpath="//div[@class='col-lg-8 col-md-8 pad0']//select[@name='SmokingStatus']")
	WebElement SmokingStatus;
	
	@FindBy(xpath="//div[@class='col-lg-8 col-md-8 pad0']//select[@name='AlchoholStatus']")
	WebElement AlchoholStatus;
	
	@FindBy(xpath="//div[@class='col-lg-8 col-md-8 pad0']//select[@name='TobaccoStatus']")
	WebElement TobaccoStat;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-md radi0 ng-scope']")
	WebElement MedHistSubmitBtn;

	@FindBy(linkText="Household Supplies")
	WebElement HouseholdSupplies;
	
	@FindBy(linkText="Manage Medical History")
	WebElement managemedicalhist;
	
	@FindBy(name = "relation")
	WebElement familymem;
	
	public MyOrdersPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean currentOrdersDisplayCheck()
	{
		return currentOrders.isDisplayed();
	}
	
	public boolean labTestBookingsDisplayCheck()
	{
		return labTestBookings.isDisplayed();
	}

	public boolean doctorAppointmentDisplayCheck()
	{
		return doctorAppointment.isDisplayed();
	}
	
		
	public void addNewMedicalHist(String familymemname, String name, String bGroup, String Mstatus, String Smokingstatus, 
			String aStatus, String TobaccoStatus, int Height, int Weight)
	{
		managemedicalhist.click();
		addNewMedicalHist.click();
		Select select = new Select(familymem);
		select.selectByVisibleText(familymemname);
		Select select1 = new Select(PhysicalExamName);
		select1.selectByVisibleText("name");
		Select select2 = new Select(BloodGroup);
		select2.selectByVisibleText("bGroup");
		Select select3 = new Select(MaritalStatus);
		select3.selectByVisibleText("Mstatus");
		Select select4 = new Select(SmokingStatus);
		select4.selectByVisibleText("Smokingstatus");
		Select select5 = new Select(AlchoholStatus);
		select5.selectByVisibleText("aStatus");
		Select select6 = new Select(TobaccoStat);
		select6.selectByVisibleText("TobaccoStatus");
		driver.findElement(By.id("HeightVal")).sendKeys("Height");
		driver.findElement(By.id("WeightVal")).sendKeys("Weight");
		MedHistSubmitBtn.click();
		
	}
	
	
}

