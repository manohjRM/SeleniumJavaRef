package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {
	public static void main(String[] args) {
		String URL = "http://demo.guru99.com/test/upload/";
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement upload = driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
		upload.sendKeys("H:\\Learnovate\\mk.png");
		WebElement check = driver.findElement(By.xpath("//input[@name='terms']"));
		check.click();
		WebElement submit = driver.findElement(By.xpath("//button[@name='send']"));
		submit.click();
		//h3[@id='res']/center/text()[1]
		String message = driver.findElement(By.xpath("//*[@type='text']//following::center[2]")).getText();
		System.out.println(message);
	}
}
