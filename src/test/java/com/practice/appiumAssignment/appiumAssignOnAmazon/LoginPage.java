package com.practice.appiumAssignment.appiumAssignOnAmazon;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends Base
{
	public LoginPage(AppiumDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
		
	@AndroidFindBy(xpath="//android.widget.Button[@text='Already a customer? Sign in']")
	public AndroidElement userSignInInfo;

	@AndroidFindBy(className="android.widget.EditText")
	public AndroidElement EnterUsername;
		
	@AndroidFindBy(className="android.widget.Button")
	public AndroidElement ClickNext;

	//@AndroidFindBy(xpath="//android.widget.EditText[@text='Amazon password']")

	@AndroidFindBy(id="ap_password")
	public AndroidElement EnterPassword;

	@AndroidFindBy(className="android.widget.Button")
	public AndroidElement ClickSignIn;

	public void clickAlreadyACustomer()
	{
		userSignInInfo.click();
	}

	public void enterEmail(String email)
	{
		EnterUsername.sendKeys(email);
	}
	
	public void clickNextButton() 
	{
		ClickNext.click();
	}
	public void enterPassword(String password)
	{
		EnterPassword.sendKeys(password);	
	}

	public void clickSignInButton() 
	{
		ClickSignIn.click();		
	}
	}
