package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver.exe");  
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	//driver.findElement(By.xpath("//input[@jsaction='paste:puy29d;']")).sendKeys("Facebook");
		
		
		WebElement FacebookEmail = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		
		FacebookEmail.sendKeys("Facebook");
		
WebElement FacebookPassword = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		
FacebookPassword.sendKeys("Facebook");

WebElement FacebookSubmit = driver.findElement(By.xpath("//button[@name='login']"));

FacebookSubmit.click();

String ActualValidationMessage = driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();

String ExpectedValidationMessage = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";


if(ActualValidationMessage.equalsIgnoreCase(ExpectedValidationMessage))

{
	System.out.println("As expected validation message "+ActualValidationMessage+" is displayed successfully");
	
}

else
{
	System.out.println("As expected validation message is not displayed successfully");
}
		
		
	}

}
