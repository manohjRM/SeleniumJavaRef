package phpObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginObjects {
	WebDriver driver;
	public CustomerLoginObjects(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="email")
	public WebElement email;
	@FindBy(name="password")
	public WebElement password;
	public void login(String uname, String pwd) {
		email.sendKeys(uname);
		password.sendKeys(pwd);
	}
	
}
