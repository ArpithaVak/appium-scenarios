package testCase;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import practiceAppium.AppiumBasic.HomePageScenario;

public class Actions extends HomePageScenario
{
	homepage=new HomePageScenario(driver);
	
	public Actions(AppiumDriver<AndroidElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	Actions action=new Actions(driver); 
    action.sendKeys("65-inch TV").sendKeys(Keys.ENTER).build().perform();
}
