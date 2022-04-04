package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SikuliSample {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","H:\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.filemail.com/share/upload-file");
	}
}
