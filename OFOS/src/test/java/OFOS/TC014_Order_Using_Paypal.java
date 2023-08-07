package OFOS;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pom_pages.Checkout_Page;
import pom_pages.Dishes_Page;

public class TC014_Order_Using_Paypal extends TC003_Add_Dishes_FromHome {
	
	@Test
	 public void OrderUsingPaypal() throws InterruptedException
	 {
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
		 
		 if(checkout.getPaypalRadioButton().isSelected())
		 {
			 checkout.getPaypalRadioButton().click(); 
			 test.log(LogStatus.PASS, "Pay pal option selected successfully");
			 test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		 }
		 else
		 {
			 test.log(LogStatus.FAIL, "Pay pal option not selected successfully");
			 test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		 }
		
//		 try {
//			 checkout.getPaypalRadioButton().click();
//			 Assert.assertEquals(checkout.getPaypalRadioButton().isSelected(), true);
//			 test.log(LogStatus.PASS, "Pay pal option selected successfully");
//			 test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
//		} catch (Exception e) {
//			test.log(LogStatus.FAIL, "Pay pal option not selected successfully");
//			 test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
//		}
	 }}
