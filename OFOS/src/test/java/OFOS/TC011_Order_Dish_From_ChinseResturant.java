package OFOS;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pom_pages.Checkout_Page;
import pom_pages.Dishes_Page;
import pom_pages.Home_Page;

public class TC011_Order_Dish_From_ChinseResturant extends TC002_Verify_Login {
	
	@Test
	public void OrderDish() throws InterruptedException
	{
		Home_Page home=new Home_Page(driver);
		home.getChineseLink().click();
		try {
			Assert.assertEquals(driver.getTitle(), "Home");
			test.log(LogStatus.PASS, "Resturant  displayed successfully");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Restaurant  not displayed successfully");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		}
		
		home.getNanXiangXiaoLongBaoResturantLink().click();
		try {
			Assert.assertEquals(driver.getTitle(), "Dishes");
			test.log(LogStatus.PASS, "Dishes  displayed successfully");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Dishes  not displayed successfully");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		}
		
		Dishes_Page dishes=new Dishes_Page(driver);
		dishes.getVegetableFriedRiceAddtocartButton().click();
		dishes.getCheckoutButton().click();
		 try {
			Assert.assertEquals(driver.getTitle(), "Checkout");
			test.log(LogStatus.PASS, "Order using cod successfully");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Order using cod unsuccessfully");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		}
		
		Checkout_Page checkout=new Checkout_Page(driver);
		 checkout.getCodRadiobutton().click();
		 checkout.getOrdernoeButton().click();
		 Thread.sleep(2000);
		 String thanyouMessage = driver.switchTo().alert().getText();
		 driver.switchTo().alert().accept();
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();
		 try {
			  Assert.assertEquals(thanyouMessage, "Do you want to confirm the order?");
			 test.log(LogStatus.PASS, "Item ordered successfully using cod");
			 test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver))); 
		 } catch (Exception e) {
			test.log(LogStatus.FAIL, "Item ordered unsuccessful using cod");
			 test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		}
	}

}
