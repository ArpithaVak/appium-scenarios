package com.practice.appiumAssignment.appiumAssignOnAmazon;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base 
{
	//public static AppiumDriver<AndroidElement> driver;

	public static AndroidDriver<AndroidElement> Amazon(String appName) throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\practice\\appiumAssignment\\appiumAssignOnAmazon\\global.properties");
		//System.getProperty("user.dir")+
		Properties prop=new Properties();
		prop.load(fis);
		
		
		File appDir=new File("src");
		File app=new File(appDir,(String) prop.get(appName));
		
		 DesiredCapabilities cap=new DesiredCapabilities();
		 
		 String device=(String) prop.get("DeviceName");
		 cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
		 
		 cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		 
		 String version=(String) prop.get("version");
		 cap.setCapability(MobileCapabilityType.VERSION, version);
		 
		 String udid=(String) prop.get("udid");
         cap.setCapability(MobileCapabilityType.UDID, udid);
    
         cap.setCapability("app-package", "com.amazon.mShop.android.shopping"); 
		 cap.setCapability("app-activity", "com.amazon.mShop.sso.SigninPromptActivity");
		 
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
	
		 
		// cap.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + constants.APK_FILE_PATH);
	
	
	
		 
}
}
