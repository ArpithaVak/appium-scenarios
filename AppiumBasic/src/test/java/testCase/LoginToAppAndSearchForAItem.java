package testCase;

import java.io.IOException;

import org.testng.annotations.Test;

import practiceAppium.AppiumBasic.FirstProgram;
import practiceAppium.AppiumBasic.HomePageScenario;
import practiceAppium.AppiumBasic.LoginCredFromExcel;
import practiceAppium.AppiumBasic.LoginData;
import practiceAppium.AppiumBasic.base;

public class LoginToAppAndSearchForAItem extends base
{
public LoginData logindata;
public HomePageScenario homepage;
public LoginCredFromExcel excelInput;

@Test
public void LoginToApp() throws IOException
{
	logindata=new LoginData(driver);
	homepage=new HomePageScenario(driver);
	excelInput=new LoginCredFromExcel();
	
	String username = excelInput.getUsername();
	String password = excelInput.getPassword();
	
	logindata.clickAlreadyACustomer();
	logindata.enterEmail(username);
	logindata.enterPassword(password);
	logindata.clickNextButton();
	logindata.clickSignInButton();
	
	String item=excelInput.getSearchedValue();
	
	homepage.search();
	homepage.searchForATV(item);
	
	
	
	
}
}
