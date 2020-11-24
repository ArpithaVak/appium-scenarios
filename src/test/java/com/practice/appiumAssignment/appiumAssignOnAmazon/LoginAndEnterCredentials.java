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
 
    Dimension dimension=driver.manage().window().getSize();
	int start_x=(int)(dimension.width*0.6);
	int start_y=(int)(dimension.height*0.9);
	
	int end_x=(int)(dimension.width*0.2);
	int end_y=(int)(dimension.height*0.2);
	
	TouchAction touch=new TouchAction(driver);
	touch.press(PointOption.point(start_x,start_y))
	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
	.moveTo(PointOption.point(end_x,end_y)).release().perform();
    
	validation.cart();    
}

}

