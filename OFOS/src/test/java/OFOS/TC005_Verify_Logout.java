package OFOS;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pom_pages.Home_Page;

public class TC005_Verify_Logout extends TC002_Verify_Login {
	
	@Test
	public void logout()
	{
		Home_Page home=new Home_Page(driver);
		home.clickLogoutButton();
		try {
			Assert.assertEquals(driver.getTitle(), "Login");
			test.log(LogStatus.PASS, "Logged out successful");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Logged out unsuccessful");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		}
	}

}
