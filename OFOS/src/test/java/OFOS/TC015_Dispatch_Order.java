package OFOS;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import pom_pages.My_Orders_Page;

public class TC015_Dispatch_Order extends Base_Test{
	
	@Test
	public void dispatch() throws InterruptedException
	{
		
		TC007_Order_Using_Cod order=new TC007_Order_Using_Cod();
		order.OrderUsingCod();
		
		My_Orders_Page myorder=new My_Orders_Page(driver);
		if(myorder.getDispathButton().isSelected())
		{
		myorder.getDispathButton().click();
		test.log(LogStatus.PASS, "Dispatch succeed");
		test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		}
		else
		{
			test.log(LogStatus.FAIL, "Dispatch not succeed");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));	
		}
	}

}
