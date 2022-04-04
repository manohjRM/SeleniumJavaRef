package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import pages.POpage1;

public class TestCase1 {
	static WebDriver driver;
	@BeforeSuite
	public static void openDriver() {
		System.setProperty("webdriver.gecko.driver", "H:\\selenium\\geckodriver.exe");
		String url = "http://www.demo.guru99.com/V4/";
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test(priority = 0)
	public static void SS1() {
		
		PageFactory.initElements(driver, POpage1.class);
		
		POpage1.login_id.sendKeys("mngr384225");
		POpage1.pwd.sendKeys("vYsujAn");
		POpage1.login.submit();
		
		/*String homeTitle = driver.getTitle();
		System.out.println(homeTitle);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		boolean titleEquals = homeTitle.contentEquals("Guru99 Bank HomePage");
		if (titleEquals) {
			System.out.println("Navigated to the home page");
		}
		else {
			System.out.println("Not Navigated to the home page");
		}
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(POpage1.logout));
		POpage1.logout.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert ob1 = driver.switchTo().alert();
		System.out.println("Logout Alert message displayed");
		ob1.accept();*/
		
	}
	
	/*@Test(priority = 1)
	public static void SS2() {
				
		PageFactory.initElements(driver, POpage1.class);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(POpage1.login_id));
		POpage1.login_id.sendKeys("mngr");
		POpage1.pwd.sendKeys("vYsujAn");
		POpage1.login.submit();
		
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert ob1 = driver.switchTo().alert();
		System.out.println("Error Alert message displayed");
		ob1.accept();

	}*/
	@AfterSuite
	public void closeDriver() {
		driver.quit();
	}
	
	
}
