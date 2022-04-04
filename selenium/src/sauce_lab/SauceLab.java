package sauce_lab;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLab {
	public static final String URL = "https://oauth-manofjoy0506-69de7:ed2d94c5-25e0-48c9-928b-5ae48b51ad56@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

	 public static void main(String[] args) throws Exception {
	 
	 MutableCapabilities caps = new MutableCapabilities();
	 caps.setCapability("platformName", "Android");
	 caps.setCapability("browserName", "Chrome");
	 caps.setCapability("appium:deviceName", "Samsung Galaxy Tab S7 Plus GoogleAPI Emulator");
	 caps.setCapability("appium:platformVersion", "12.0");
	 MutableCapabilities sauceOptions = new MutableCapabilities();
	 sauceOptions.setCapability("appiumVersion", "1.22.1");
	 caps.setCapability("sauce:options", sauceOptions);
	 
	 /*
	 MutableCapabilities caps = new MutableCapabilities();
	 caps.setCapability("platformName", "iOS");
	 caps.setCapability("browserName", "Safari");
	 caps.setCapability("appium:deviceName", "iPad Simulator");
	 caps.setCapability("appium:platformVersion", "15.0");
	 MutableCapabilities sauceOptions = new MutableCapabilities();
	 sauceOptions.setCapability("appiumVersion", "1.22.0");
	 caps.setCapability("sauce:options", sauceOptions);*/
	 WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	 driver.get("https://www.mycontactform.com/samples.php/");
	 driver.findElement(By.id("subject")).sendKeys("Testing");
	 driver.findElement(By.id("subject")).clear();
	 driver.findElement(By.id("email")).sendKeys("manofjoy0506@gmail.com");
	 driver.findElement(By.id("subject")).sendKeys("Testing");
	 driver.findElement(By.id("q2")).sendKeys("Selenium \n testing \n for \nform");

	 driver.close();
	 

	 }
}
