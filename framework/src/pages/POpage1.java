package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POpage1 {
	
	@FindBy(name="uid")
	public static WebElement login_id;
	
	@FindBy(name="password")
	public static WebElement pwd;
	
	@FindBy(name="btnLogin")
	public static WebElement login;
	
	@FindBy(linkText="Log out")
	public static WebElement logout;
}
