package com.practice.appiumAssignment.appiumAssignOnAmazon;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class LoginAndEnterCredentials extends Base
{
public UsernameTextfield User;
public PasswordTextField Pass;
public HomePage homepage;
public ExcelInputs input;
public Validation validation;
private CartPage cartpage;

@Test
public void enterLoginCred() throws Exception
{
	AndroidDriver<AndroidElement> driver=Amazon("AmzonShopping");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
    User=new UsernameTextfield(driver);
	Pass=new PasswordTextField(driver);
	homepage=new HomePage(driver);
	validation=new Validation(driver);
	cartpage=new CartPage(driver);
    input = new ExcelInputs();
    
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
    validation.productInfo();
    validation.Name();
    validation.price();
    
    cartpage.addingToCart();
    
}

}

