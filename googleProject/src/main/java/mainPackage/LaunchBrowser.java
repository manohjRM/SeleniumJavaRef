package mainPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import dataprovider.DataProvider;


public class LaunchBrowser {
	public static WebDriver driver;
	
	/*public static Properties ConfigProperties() throws IOException {
		File config = new File(System.getProperty("user.dir"+"/src/main/resources/"+"config.properties"));
		FileInputStream inputFile = new FileInputStream(config);
		Properties configFile = new Properties();
		configFile.load(inputFile);
		return configFile;
	}*/
	@BeforeTest
	public static void openDriver() throws IOException {
		System.setProperty("webdriver.gecko.driver", "H:\\selenium\\geckodriver.exe");
		
		File config = new File(System.getProperty("user.dir")+"/src/main/resources/config.properties");
		
		FileInputStream inputFile = new FileInputStream(config);
		Properties configFile = new Properties();
		configFile.load(inputFile);
		
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(configFile.getProperty("url"));
	}
	
	
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}
	
	public Object[][] getExcelData(String excelName, String sheetName){
		String excelLocation = System.getProperty("user.dir")+"/src/test/resources/"+excelName;
		//log.info("excel location "+excelLocation);
		DataProvider excelHelper = new DataProvider();
		Object[][] data = excelHelper.getExcelData(excelLocation, sheetName);
		return data;
		}
}