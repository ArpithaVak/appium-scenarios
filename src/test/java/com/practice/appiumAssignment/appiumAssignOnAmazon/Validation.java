package com.practice.appiumAssignment.appiumAssignOnAmazon;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Validation extends Base
{
	public Validation(AppiumDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='LG 164 cm (65 inches) 4K Ultra HD Smart IPS LED TV 65UM7290PTD (Ceramic Black) (2020 Model)']")
	public AndroidElement selectItem;
	
	@AndroidFindBy(className="android.view.View")
	public AndroidElement productInformation;
	
	@AndroidFindBy(xpath="//android.view.View[@text='LG 164 cm (65 inches) 4K Ultra HD Smart IPS LED TV 65UM7290PTD (Ceramic Black) (2020 Model)']")
	public AndroidElement Productname;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='rupees 82,990']")
	public AndroidElement Price;
	
    @AndroidFindBy(id="add-to-cart-button")
	public AndroidElement addToCart;
    
	
	public void Item()
	{
		selectItem.click();	
	}	
	
	public void productInfo()
	{
		System.out.println("Done");
		
    }
	
	public void Name()
	{
		String product=Productname.getText();
		System.out.println(product);
	}
	
	public void price()
	{
		String price=Price.getText();
		System.out.println(price);	
		
		Dimension dimension=driver.manage().window().getSize();
		int start_x=(int)(dimension.width*0.8);
		int start_y=(int)(dimension.height*0.9);
		
		int end_x=(int)(dimension.width*0.1);
		int end_y=(int)(dimension.height*0.1);
		
		TouchAction touch=new TouchAction(driver);
		touch.press(PointOption.point(start_x,start_y))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(end_x,end_y)).release().perform();
		
	}
	
	/*@AndroidFindBy(id="add-to-cart-button")
	public AndroidElement addToCart;
     public void cart()
     {
    	 addToCart.click();
     }


AndroidElement ProductName=driver.findElementByXPath("//android.view.View[@text='LG 164 cm (65 inches) 4K Ultra HD Smart IPS LED TV 65UM7290PTD (Ceramic Black) (2020 Model)']");
AndroidElement Price=driver.findElementByXPath("//android.widget.EditText[@text='rupees 82,990']");	
System.out.println(ProductName);
System.out.println(Price);*/
}