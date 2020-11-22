package com.practice.appiumAssignment.appiumAssignOnAmazon;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends Base
{
	
	public HomePage(AppiumDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
		
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Search']")
	public AndroidElement SearchTextBox;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Sanyo 164 cm (65 inches) Kaizen Series 4K Ultra HD Certified Android LED TV XT-65UHD4S (Black) (2020 Model)']")
	public AndroidElement EntersearcValue;
		
	public void search()
	{
		SearchTextBox.click();
	}

	public void searchForATV(String search)
	{
		EntersearcValue.sendKeys(search);
		/*TouchActions action=new TouchActions(driver); 
	    action.sendKeys("65-inch TV").sendKeys(Keys.ENTER).build().perform();*/
	}

}
