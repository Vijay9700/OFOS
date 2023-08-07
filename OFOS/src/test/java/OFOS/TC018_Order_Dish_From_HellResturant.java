package OFOS;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import pom_pages.Home_Page;

public class TC018_Order_Dish_From_HellResturant extends Base_Test {
	
	@Test
	public void orderDish()
	{
		TC002_Verify_Login login=new TC002_Verify_Login();
		try {
			login.verifyLogin();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Home_Page home=new Home_Page(driver);
		home.getHellResturantLink().click();
		
		test.log(LogStatus.FAIL, "No Resturant found");
		test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		
	}

}
