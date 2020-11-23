package com.practice.appiumAssignment.appiumAssignOnAmazon;

import java.util.List;

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
		
	//@AndroidFindBy(xpath="//android.widget.EditText[@text='Search']")
	@AndroidFindBy(id="com.amazon.mShop.android.shopping:id/rs_search_src_text")
	public AndroidElement SearchTextBox;

	//@AndroidFindBy(xpath="//android.widget.LinearLayout[@index='0']")
	@AndroidFindBy(xpath="//android.widget.TextView[@text='65-inch tv']")
	public AndroidElement EntersearcValue;
		
	public void search(String TV)
	{
		SearchTextBox.clear();
		SearchTextBox.click();
		SearchTextBox.sendKeys(TV);

	/*TouchActions action=new TouchActions(driver); 
	  action.sendKeys("65-inch TV").sendKeys(Keys.ENTER).build().perform();
		//SearchTextBox.sendKeys("65-inch TV");
		
		System.out.println("Success");*/
	}

public void searchForATV()
	{
	    EntersearcValue.clear();
		EntersearcValue.click();
	}
}
