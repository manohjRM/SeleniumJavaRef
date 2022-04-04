package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import mainPackage.LaunchBrowser;
import objectpackage.LoginPageObject;


@Listeners(listenerPackage.Listener.class)
public class TestClass extends LaunchBrowser{
	
	
@Test(dataProvider = "LoginData")
	public static void login345(String Username,String Password)
	{
	
	LoginPageObject obj=new LoginPageObject(driver);
	obj.login(Username,Password);
	
	/*
		PageFactory.initElements(driver, LoginPageObject.class);
		LoginPageObject.username.sendKeys("admin");
		LoginPageObject.password.sendKeys("admin123"); */
	}

	@DataProvider(name="LoginData")
	public Object[][] sampledata(){
		Object[][] data = getExcelData("DataSheet.xlsx", "Credentials");
		return data;
}
}