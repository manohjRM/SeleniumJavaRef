package guardianObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuardianObjectModel {
	WebDriver driver;
	
	public GuardianObjectModel(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='ddlTerminal']")
	public WebElement terminal;
	@FindBy(xpath="//*[@id='ddlTerminal']//following::option[1]")
	public WebElement terminalSelect;
	@FindBy(id="txtUserId")
	public WebElement username;
	@FindBy(id="txtPwd")
	public WebElement password;
	@FindBy(id="btnLogin")
	public WebElement loginButton;
	@FindBy(id="txtCMobileNo")
	public WebElement mobileNumberField;
	@FindBy(id="btnCusOK")
	public WebElement clickOk;
	@FindBy(id="btnTerminalResetOk")
	public WebElement terminalResetConfirm;
	@FindBy(id="btnTerminalResetCancel")
	public WebElement terminalResetDiscard;
	@FindBy(id="txtCustomerName")
	public WebElement enterCustomerName;
	@FindBy(className="blobselect-selections")
	public WebElement customerGroup;
	public void login(String UN,String Pwd) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		terminal.click();
		terminalSelect.click();
		username.sendKeys(UN);
		password.sendKeys(Pwd);
		loginButton.click();
	}
	@SuppressWarnings("deprecation")
	public void enterMobileNumber() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		mobileNumberField.sendKeys("9874651222");
		clickOk.click();
	}
	@SuppressWarnings("deprecation")
	public void resetTerminal() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		terminalResetConfirm.click();
		Thread.sleep(5000);
		Alert ob = driver.switchTo().alert();
		ob.accept();
	}
	public void customerInfo() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		enterCustomerName.sendKeys("Guna");
		customerGroup.click();
	}
}
