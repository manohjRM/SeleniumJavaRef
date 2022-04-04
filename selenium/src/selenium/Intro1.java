package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println("Tested Successfully");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ibiscusibiscus");
		WebElement searchSubmit = driver.findElement(By.id("nav-search-submit-button"));
		searchSubmit.click();
		int ErrorMessageCount = driver.findElements(By.xpath("//*[@class='s-no-outline']//child::span")).size();
		
		
		for(int i=1;i<=ErrorMessageCount;i++) {
			String xpath = "//*[@class='s-no-outline']//descendant::span["+i+"]";
			String ErrorMessage = driver.findElement(By.xpath(xpath)).getText();
			System.out.println(ErrorMessage);
		}
		//Dimension ErrorMessageCount = driver.findElement(By.xpath("//*[@class='s-no-outline']//child::span")).getSize();
		
		
	}

}
