package OFOS;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import pom_pages.Checkout_Page;
import pom_pages.Dishes_Page;

public class TC007_Order_Using_Cod extends Base_Test {
	
	 @Test
	 public void OrderUsingCod() throws InterruptedException
	 {
		 TC003_Add_Dishes_FromHome addDish=new TC003_Add_Dishes_FromHome();
		 try {
			addDish.addDishes();
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 Dishes_Page dishes=new Dishes_Page(driver);
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
