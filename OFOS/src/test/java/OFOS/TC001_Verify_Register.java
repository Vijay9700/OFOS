package OFOS;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import pom_pages.Home_Page;
import pom_pages.Register_Page;
import pom_scripts.WelcomePage;

public class TC001_Verify_Register extends Base_Test
{

	@DataProvider(name="Registerdata")
	public Object[][] registerdata() 
	{
		Object[][] data = new Object[1][8];
		data[0][0]="vijay9400";
		data[0][1]="vijay";
		data[0][2]="ganesan";
		data[0][3]="vijay@gmail.com";
		data[0][4]="9787071322";
		data[0][5]="Vijay@123";
		data[0][6]="Vijay@123";
		data[0][7]="indiqube Banglore";
		
		return data;
	}
	@Test(dataProvider="Registerdata")
	public void verifyRegister(String un,String fnm,String lstnm,String email,String pwd,String cnfrmpwd,String phnno,String adrs)
	{
		Home_Page home=new Home_Page(driver);
		home.clickRegisterLink();
		try {
		Assert.assertEquals(driver.getTitle(), "Registration");
		test.log(LogStatus.PASS, "Register page is displayed");
		test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		}
		catch(Exception e){
			test.log(LogStatus.FAIL, "Register page is not displayed");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		}
		
		Register_Page register=new Register_Page(driver);
		register.enterValueOnUsernametextfield(un);
		register.enterFirstname(fnm);
		register.enterLastname(lstnm);
		register.enterEmail(email);
		register.enterPassword(pwd);
		register.enterPhoneNumber(phnno);
		register.enterConfirmPassword(cnfrmpwd);
		register.enterAddress(adrs);
		register.clickRegisterButton();
		
		try {
			Assert.assertEquals(driver.getTitle(), "Login");
			test.log(LogStatus.PASS, "Registration successful");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Registration unsuccessful");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		}
	}
}
