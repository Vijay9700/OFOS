package OFOS;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pom_pages.My_Orders_Page;

public class TC008_Cancel_Order extends TC007_Order_Using_Cod{
	
	@Test
	public void cancelOrder() throws InterruptedException
	{
		My_Orders_Page order=new My_Orders_Page(driver);
		order.getCancelOrderButton().click();
		Thread.sleep(3000);
		String cancelMessage = driver.switchTo().alert().getText();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		try {
			Assert.assertEquals(cancelMessage, "Are you sure you want to cancel your order?");
			test.log(LogStatus.PASS, "cancel pop up message displayed ");
			test.log(LogStatus.INFO,test.addScreenCapture(getPhoto(driver)));
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "cancel pop up message not displayed ");
			test.log(LogStatus.INFO,test.addScreenCapture(getPhoto(driver)));
		}
		
	}

}
