package com.practice.appiumAssignment.appiumAssignOnAmazon;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginAndEnterCredentials extends Base
{
public LoginPage loginpage;
public HomePage homepage;
public ExcelInputs input;

@Test
public void enterLoginCred() throws Exception
{
	AndroidDriver<AndroidElement> driver=Amazon("AmzonShopping");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
    loginpage=new LoginPage(driver);
	homepage=new HomePage(driver);
	input=new ExcelInputs();
	
	String username=input.getUsername();

	loginpage.clickAlreadyACustomer();
	loginpage.enterEmail(username);
	
	String password=input.getPassword();

	loginpage.enterPassword(password);
	loginpage.clickNextButton();
	
	String TV="65-inch TV";
	
	homepage.search();
	homepage.searchForATV(TV);	
}
}
