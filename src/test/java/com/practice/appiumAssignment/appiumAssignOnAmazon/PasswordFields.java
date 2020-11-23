package com.practice.appiumAssignment.appiumAssignOnAmazon;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PasswordFields extends Base
{
	public PasswordFields(AppiumDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(className="android.widget.EditText")
	public AndroidElement EnterPassword;

	@AndroidFindBy(className="android.widget.Button")
	public AndroidElement ClickSignIn;

	public void enterPassword(String password)
	{
		EnterPassword.sendKeys(password);	
	}

	public void clickSignInButton() 
	{
		ClickSignIn.click();		
	}

}

