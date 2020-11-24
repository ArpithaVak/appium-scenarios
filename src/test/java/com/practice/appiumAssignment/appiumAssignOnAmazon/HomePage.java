package com.practice.appiumAssignment.appiumAssignOnAmazon;


import org.openqa.selenium.Keys;
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
		
	@AndroidFindBy(id="com.amazon.mShop.android.shopping:id/rs_search_src_text")
	//@AndroidFindBy(xpath="//android.widget.EditText[@text='Search']")
	public AndroidElement SearchTextBox;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='65-inch tv']")
	public AndroidElement EntersearcValue;
		
	public void search(String TV)
	{
		
		SearchTextBox.clear();
		SearchTextBox.click();
		SearchTextBox.sendKeys(TV);
	}

public void searchForATV()
	{
	    EntersearcValue.clear();
		EntersearcValue.click();
	}
}
