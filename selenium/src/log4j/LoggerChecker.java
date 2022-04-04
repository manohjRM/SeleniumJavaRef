package log4j;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoggerChecker {
	static Logger log = Logger.getLogger(LoggerChecker.class);
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Properties prop = new Properties();
	PropertyConfigurator.configure("H:\\eclipse-workspace\\selenium\\src\\log4j\\log4j.properties");
	System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	String URL=prop.getProperty("url");
	System.out.println(URL);
	driver.get("https://www.google.com");
	log.info("Open Google");
	driver.close();
	log.info("closing driver");
	log.error("Acho acho");
	log.fatal("Hello");

	}
}
