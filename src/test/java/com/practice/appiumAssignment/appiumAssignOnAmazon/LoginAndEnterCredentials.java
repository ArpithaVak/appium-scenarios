package com.practice.appiumAssignment.appiumAssignOnAmazon;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginAndEnterCredentials extends Base
{
public UsernameFields User;
public PasswordFields Pass;
public HomePage homepage;
public ExcelInputs input;
public Validation validation;

@Test
public void enterLoginCred() throws Exception
{
	AndroidDriver<AndroidElement> driver=Amazon("AmzonShopping");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
    User=new UsernameFields(driver);
	Pass=new PasswordFields(driver);
	homepage=new HomePage(driver);
	validation=new Validation(driver);
	input=new ExcelInputs();
	
	String username=input.getUsername();
	User.clickAlreadyACustomer();
	User.enterEmail(username);
	User.clickNextButton();
	
	String password=input.getPassword();
	Pass.enterPassword(password);
	Pass.clickSignInButton();
	
	String TV="65-inch TV";
	
	homepage.search(TV);
	homepage.searchForATV();	
	
	validation.Item();
}

}

