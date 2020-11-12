package practiceAppium.AppiumBasic;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base
{
	public static AndroidDriver<AndroidElement> AmzonEx(String app) throws Exception
	{
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\practiceAppium\\AppiumBasic\\global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		
		AndroidDriver<AndroidElement> driver;
		
		File f=new File("src");
		File file=new File(f,(String) prop.get(app));
		
		
		//Create an object and send the information to the server
		DesiredCapabilities cap=new DesiredCapabilities();
		
		String device=(String) prop.get("AmzonShopping");
		//cap.setCapability("device","android");
		cap.setCapability("udid", "5200bc59f05f6591");
		// cap.setCapability(CapabilityType.BROWSER_NAME, "");
		//Mobile OS version. In My case its running on Android 4.2
		 cap.setCapability(CapabilityType.VERSION, "9");
		 cap.setCapability("app", file.getAbsolutePath());
		//To Setup the device name
		 cap.setCapability("deviceName",device);
		 cap.setCapability("platformName","Android");
		//set the package name of the app
		 cap.setCapability("app-package", "com.example.android.contactmanager-1");
		 //set the Launcher activity name of the app
		 cap.setCapability("app-activity", ".ContactManager");
		//Providing app path
		
		cap.setCapability(MobileCapabilityType.APP,file.getAbsolutePath());
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
		
		
		
	}
		
		
	}

