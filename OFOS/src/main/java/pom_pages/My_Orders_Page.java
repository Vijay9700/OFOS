package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class My_Orders_Page extends BasePage{

	public My_Orders_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//i[@class='fa fa-trash-o']")
	private WebElement cancelOrderButton;

	public WebElement getCancelOrderButton() {
		return cancelOrderButton;
	}
	
	@FindBy(xpath = "//button[@class='btn btn-info']")
	private WebElement dispathButton;

	public WebElement getDispathButton() {
		return dispathButton;
	}
	

}
