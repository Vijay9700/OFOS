package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout_Page extends BasePage {

	public Checkout_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//label[@class='custom-control custom-radio  m-b-20']")
	private WebElement codRadiobutton;

	public WebElement getCodRadiobutton() {
		return codRadiobutton;
	}
	
	@FindBy(xpath = "//input[@value='Order Now']")
	private WebElement ordernoeButton;

	public WebElement getOrdernoeButton() {
		return ordernoeButton;
	}
	
	@FindBy(xpath = "//label[@class='custom-control custom-radio  m-b-10']")
	private WebElement paypalRadioButton;

	public WebElement getPaypalRadioButton() {
		return paypalRadioButton;
	}
	
	

}
