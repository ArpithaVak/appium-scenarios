package com.practice.appiumAssignment.appiumAssignOnAmazon;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CartPage extends Base
{
		public CartPage(AppiumDriver<AndroidElement> driver)
		{
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		
		@AndroidFindBy(xpath="//android.widget.Button[@text='Add to Cart']")
		public AndroidElement cart;
		
		public void addingToCart()
		{
			cart.click();
		}
}
