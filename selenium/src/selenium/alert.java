package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	public static void main(String[] args) {
		String URL = "http://demo.guru99.com/test/delete_customer.php";
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement text = driver.findElement(By.xpath("//input[@name='cusid']"));
		text.sendKeys("12346");
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		Alert ob = driver.switchTo().alert();
		ob.accept();
		Alert ob1 = driver.switchTo().alert();
		ob1.accept();
	}
}
