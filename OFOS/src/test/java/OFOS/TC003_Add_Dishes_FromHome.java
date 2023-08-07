package OFOS;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import pom_pages.Dishes_Page;
import pom_pages.Home_Page;

public class TC003_Add_Dishes_FromHome extends Base_Test {
	
	@Test
	public void addDishes() throws Throwable
	{
		TC002_Verify_Login login = new TC002_Verify_Login();
		login.verifyLogin();
		Home_Page home=new Home_Page(driver);
		home.clickYorkshireLambPattiesOrderButton();
		try {
			Assert.assertEquals(driver.getTitle(), "Dishes");
			test.log(LogStatus.PASS, "Dishes page appeared successfully");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Dishes page not appeared successfully");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		}
		
		Dishes_Page dishes=new Dishes_Page(driver);
		dishes.clickYorkshireLambPattiesAddtocartButton();
		try {
		Assert.assertEquals(dishes.nameOfTheItem().contains("Lamb"), true);
		test.log(LogStatus.PASS, "Item added successfully");
		test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		}
		catch(Exception e)
		{
			test.log(LogStatus.FAIL, "Item not added successfully");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		}
		
		
	}

}
