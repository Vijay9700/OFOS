package pom_pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Restaurant_page extends BasePage {

	public Restaurant_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[ text()='View Menu']")
	private List<WebElement> allMenuLink;

	public List<WebElement> getAllMenuLink() {
		return allMenuLink;
	}
//	public void selectMenu()
//	{
//		for (WebElement webElement : allMenuLink) {
//			webElement.click();
//		}
//	}
	
	@FindBy(xpath = "(//a[text()='View Menu'])[1]")
	private WebElement northStreetTavernViewMenuButton;

	public WebElement getNorthStreetTavernViewMenuButton() {
		return northStreetTavernViewMenuButton;
	}
	public void clicknorthStreetTavernViewMenuButton()
	{
		northStreetTavernViewMenuButton.click();
	}

}
