package OFOS;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pom_pages.Dishes_Page;
import pom_pages.Home_Page;
import pom_pages.Restaurant_page;

public class TC004_Add_Dishes_From_Restaurant extends TC002_Verify_Login{
	
	@Test
	public void addDishes()
	{
		Home_Page home=new Home_Page(driver);
		home.clickResturantLink();
		try {
			Assert.assertEquals(driver.getTitle(), "Restaurants");
			test.log(LogStatus.PASS, "Restaurant page displayed successfully");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Restaurant page not displayed successfully");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		}
		
		Restaurant_page restaurant=new Restaurant_page(driver);
		restaurant.clicknorthStreetTavernViewMenuButton();
		try {
			Assert.assertEquals(driver.getTitle(), "Dishes");
			test.log(LogStatus.PASS, "Dishes displayed successfully");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Dishes not displayed successfully");
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
