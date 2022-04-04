package selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CookiesTutorial {
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "H:\\selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.bing.com");
		
		Set<Cookie> allCookies = driver.manage().getCookies();
		
		int count = allCookies.size();
		
		System.out.println("Cookies count: "+count);
		
		for(Cookie cook: allCookies) {
			System.out.println("Name: "+cook.getName());
			System.out.println("Value: "+cook.getValue());
			System.out.println("Domain: "+cook.getDomain());
			System.out.println("Path: "+cook.getPath());
		}
	}

}
