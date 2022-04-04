package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileHandling {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		File name = new File("H:\\eclipse-workspace\\selenium\\src\\selenium\\file.properties");
		
		FileInputStream input;
		
		try {
			input = new FileInputStream(name);
			Properties n1 = new Properties();
			n1.load(input);
			
			driver.get(n1.getProperty("url"));
			
			/*WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
			
			search.sendKeys("facebook");
			
			search.submit();
			
			List<WebElement> fb = new LinkedList();
			
			fb = driver.findElements(By.tagName("a"));
			
			System.out.println(fb.size());
			
			for(WebElement link : fb) {
				System.out.println(link.getText());
			}*/
			
			
			//fb.click();
			
			WebElement email = driver.findElement(By.id("email"));
			
			email.clear();
			
			email.sendKeys(n1.getProperty("email"));
			
			WebElement pwd = driver.findElement(By.id("pass"));
			
			pwd.clear();
			
			pwd.sendKeys(n1.getProperty("pwd"));
			
			WebElement submit = driver.findElement(By.name("login"));
			
			submit.click();
			
			try {
				WebElement msg = driver.findElement(By.xpath("//*[@type='text']//following::div[@class='_9ay7']"));
				String msgtxt = msg.getText();
				System.out.println(msgtxt);
			}
			catch(Exception e) {
				System.out.println("Login Successfully executed");
				driver.quit();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.close();
		}
		
		//driver.quit();
	}
}
