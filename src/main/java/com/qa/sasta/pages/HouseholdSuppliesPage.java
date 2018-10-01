package com.qa.sasta.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.sasta.base.TestBase;

public class HouseholdSuppliesPage extends TestBase
{


@FindBy(xpath="//h1[contains(text(),'Household Supplies')]")
WebElement HouseholdSuppliesHeader;

@FindBy(xpath="//*[contains(@href,'breakfast') and contains(text(),'View All')]")
WebElement ViewAllBreakfastBtn;

@FindBy(xpath="//*[contains(@href,'beauty')]/h3") 
WebElement beautytext;

public HouseholdSuppliesPage() throws IOException
{
	PageFactory.initElements(driver, this);
} 

public String validateHouseholdTitle()
{
	return driver.getTitle();
}

public boolean validateHouseholdheader()
{
	return HouseholdSuppliesHeader.isDisplayed();
}
	
public void  validateViewAllBreakfastBtnclick()
{
	ViewAllBreakfastBtn.click();
	
}

public boolean validatebeautytext()
{
	return beautytext.isDisplayed();
}

}
