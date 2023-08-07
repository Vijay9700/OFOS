package OFOS;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pom_pages.Home_Page;

public class TC013_Order_Dish_From_ContinentalResturant extends TC002_Verify_Login {
	
	@Test
	public void OrderDish()
	{
		Home_Page home=new Home_Page(driver);
		home.getContinentalLink().click();
		try {
			Assert.assertEquals(driver.getTitle(), "Home");
			test.log(LogStatus.PASS, "Resturant  displayed successfully");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Restaurant  not displayed successfully");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		}
		
		home.getHeavenlyFoodResturantLink().click();
		try {
			Assert.assertEquals(driver.getTitle(), "Home");
			test.log(LogStatus.PASS, "Dishes page displayed successfully");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Dishes page not displayed successfully");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		}
		
	}

}
