package com.practice.appiumAssignment.appiumAssignOnAmazon;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Validation extends Base
{
	public Validation(AppiumDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@index='1']")
	public AndroidElement selectItem;
	
	
	public void Item()
	{
		selectItem.click();
	}
}
