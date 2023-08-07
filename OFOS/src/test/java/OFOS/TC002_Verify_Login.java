package OFOS;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import pom_pages.Home_Page;
import pom_pages.Login_Page;

public class TC002_Verify_Login extends Base_Test {
	
//	@DataProvider(name="logindata")
//	public Object[][] logindata() 
//	{
//		Object[][] data = new Object[1][2];
//		data[0][0]="vijay9400";
//		data[0][1]="Vijay@123";
//		return data;
//	}
	
	@Test()
	public void verifyLogin() throws Throwable
	{
		Home_Page home=new Home_Page(driver);
		home.clickLoginLink();
		
		Login_Page login=new Login_Page(driver);
		login.enterValueOnUsernameTextfield(getValueProperty("un"));
		login.enterValueOnPasswordTextfield(getValueProperty("pwd"));
		login.clickLoginButton();
		try {
			Assert.assertEquals(driver.getTitle(), "Login");
			test.log(LogStatus.PASS, "Logged in successful");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Logged in unsuccessful");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		}
		
		}
	

}
