package objectpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	WebDriver driver;
	@FindBy(id="email")
	public static WebElement username;
	@FindBy(id="pass")
	public static WebElement password;
	
	
	public LoginPageObject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public static void login(String UN,String Pwd)
	{
		username.sendKeys(UN);
		password.sendKeys(Pwd);
	}
	
}
