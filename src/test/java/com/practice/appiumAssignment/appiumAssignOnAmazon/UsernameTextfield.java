package com.practice.appiumAssignment.appiumAssignOnAmazon;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class UsernameTextfield extends Base
{
	public UsernameTextfield(AppiumDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
		
	@AndroidFindBy(xpath="//android.widget.Button[@text='Already a customer? Sign in']")
	public AndroidElement userSignInInfo;

	@AndroidFindBy(xpath="//android.widget.EditText[@index='1']")
	public AndroidElement EnterUsername;
		
	@AndroidFindBy(className="android.widget.Button")
	public AndroidElement ClickNext;

	
	//@AndroidFindBy(xpath="//android.widget.EditText[@text='Amazon password']")
    //@AndroidFindBy(id="ap_password")
	
	/*@AndroidFindBy(className="android.widget.EditText")
	public AndroidElement EnterPassword;

	@AndroidFindBy(className="android.widget.Button")
	public AndroidElement ClickSignIn;*/

	public void clickAlreadyACustomer()
	{
		userSignInInfo.click();
	}

	public void enterEmail(String email)
	{
		//EnterUsername.clear();
		EnterUsername.sendKeys(email);
	
	}
	
	public void clickNextButton() 
	{
		ClickNext.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*public void enterPassword(String password)
	{
		EnterPassword.sendKeys(password);	
	}

	public void clickSignInButton() 
	{
		ClickSignIn.click();		
	}*/
	}
