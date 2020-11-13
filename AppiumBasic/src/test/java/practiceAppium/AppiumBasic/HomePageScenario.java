package practiceAppium.AppiumBasic;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePageScenario extends base
{
	
	public HomePageScenario(AppiumDriver<AndroidElement> driver)
	{
		base.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
		
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Search']")
	public AndroidElement SearchTextBox;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Sanyo 164 cm (65 inches) Kaizen Series 4K Ultra HD Certified Android LED TV XT-65UHD4S (Black) (2020 Model)']")
	public AndroidElement EntersearcValue;
		
	public void search()
	{
		SearchTextBox.click();
	}

	public void searchForATV(String item)
	{
		EntersearcValue.sendKeys(item);
		
		Actions action=new Actions(driver); 
	    action.sendKeys("65-inch TV").sendKeys(Keys.ENTER).build().perform();
	}

}
