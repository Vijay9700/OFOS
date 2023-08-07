package OFOS;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pom_pages.Dishes_Page;

public class TC006_Delete_Dish_FromCart extends TC003_Add_Dishes_FromHome {
	
	@Test
	public void deleteDish()
	{
		Dishes_Page dishes=new Dishes_Page(driver);
		dishes.getDeleteButton().click();
		try {
			Assert.assertEquals(dishes.getCheckoutButton().isEnabled(),false);
			test.log(LogStatus.PASS, "Item deleted successfully");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Item deleted successfully");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		}
	}

}
