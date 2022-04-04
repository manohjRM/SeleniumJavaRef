package guru99bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SS1 {
	@Test
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "H:\\selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		String url = "http://www.demo.guru99.com/V4/";
		driver.manage().window().maximize();
		driver.get(url);
		
		try {
			WebElement login_id = driver.findElement(By.xpath("//input[@name='uid']"));
			login_id.clear();
			login_id.sendKeys("mngr384225");

			WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
			pwd.clear();
			pwd.sendKeys("vYsujAn");
			
			WebElement login = driver.findElement(By.name("btnLogin"));
			login.click();
			
			System.out.println("Login Successful");
			System.out.println("Test passed");
			
			String homeTitle = driver.getTitle();
			System.out.println(homeTitle);
			
			if (homeTitle.contentEquals("Guru99 Bank Manager HomePage")) {
				System.out.println("Navigated to the home page");
			}
			else {
				System.out.println("Not Navigated to the home page");
			}
			
		}
		catch(Exception e) {
			
			System.out.println("Test failed");
		}
		finally {
			driver.close();
		}
	}
}
