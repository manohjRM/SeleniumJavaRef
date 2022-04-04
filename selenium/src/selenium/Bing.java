package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bing {
	
	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.gecko.driver", "H:\\selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://www.bing.com");
		
		Dimension size = driver.manage().window().getSize();
		
		System.out.println(size);
		
		driver.manage().window().setSize(new Dimension(300,400));
		
		driver.manage().window().setPosition(new Point(100,300));
		
		Point point = driver.manage().window().getPosition();
		
		System.out.println(point);
		
		Thread.sleep(4000);
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		String Currenturl = driver.getCurrentUrl();
		
		System.out.println(title);
		System.out.println(Currenturl);
		
		driver.close();
	}
	
}
