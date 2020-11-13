package practiceAppium.AppiumBasic;


import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class FirstProgram extends base
{
	
	public static void main(String[] args) throws Exception	
	{
		AndroidDriver<AndroidElement> driver=AmzonEx("AmzonShopping");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.Button[@text='Already a customer? Sign in']").click();
		
		driver.findElementByClassName("android.widget.EditText").sendKeys("arpithavk.19@gmail.com");
		driver.findElementByClassName("android.widget.Button").click();
		
		driver.findElementByXPath("//android.widget.EditText[@text='Amazon password']").sendKeys("test123");
		driver.findElementByClassName("android.widget.Button").click();
		
		/*AndroidElement value = driver.findElementByXPath("//android.widget.EditText[@text='Search']");
	    value.sendKeys("65-inch TV");*/
		driver.findElementByXPath("//android.widget.EditText[@text='Search']").click();
		
		Actions action=new Actions(driver); 
	    action.sendKeys("65-inch TV").sendKeys(Keys.ENTER).build().perform();
	    
	    //driver.findElementByXPath("//android.widget.TextView[@text='Select a location to see product availability ⌵']").click();
	   // driver.findElementByXPath("//android.widget.TextView[@text='Use my current location']").click();
	    
	    //driver.findElementByXPath("//android.widget.Button[@text='Allow']").click();
	    driver.findElementByXPath("//android.widget.TextView[@text='Sanyo 164 cm (65 inches) Kaizen Series 4K Ultra HD Certified Android LED TV XT-65UHD4S (Black) (2020 Model)']").click();	    
}
}

	

