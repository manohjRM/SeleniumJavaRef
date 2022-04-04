package testCustomerPages;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import phpObjects.CustomerLoginObjects;
import phpTravelsProject.CustomerMainClass;

@Listeners(listenerPackage.Listener.class)

public class TestLoginPage extends CustomerMainClass{
	
	@Test
	public void LoginPage() throws IOException {
		logger=extent.startTest("search- sample test");
		
		CustomerLoginObjects loginSession = new CustomerLoginObjects(driver);
		//Properties configFile = ConfigProperties();
		loginSession.login(ConfigProperties().getProperty("username"), ConfigProperties().getProperty("password"));
		String title = driver.getTitle();
		System.out.println(title);
	}
	
}
