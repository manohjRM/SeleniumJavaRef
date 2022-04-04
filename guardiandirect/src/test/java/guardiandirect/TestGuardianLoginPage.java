package guardiandirect;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import guardianMain.GuardianMainClass;
import guardianObject.GuardianObjectModel;

@Listeners(listenerGuardian.ListenerGuardian.class)

public class TestGuardianLoginPage extends GuardianMainClass{
	
	@Test(dataProvider = "LoginData")
	
	
	public static void loginGuardian(String Username,String Password) throws InterruptedException
	{
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	logger=extent.startTest("search- sample test");
	GuardianObjectModel obj=new GuardianObjectModel(driver);
	obj.login(Username,Password);
	try {
		obj.enterMobileNumber();
	}
	catch(Exception e) {
		obj.resetTerminal();
		obj.login(Username,Password);
		obj.enterMobileNumber();
	}
	obj.customerInfo();
	
	}
	@DataProvider(name="LoginData")
	public Object[][] sampledata(){
		Object[][] data = getExcelData("DataSheet.xlsx", "Credentials");
		return data;
	}
}
