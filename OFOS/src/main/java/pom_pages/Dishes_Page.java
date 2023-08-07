package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dishes_Page extends BasePage {

	public Dishes_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//input[ @value='Add To Cart']")
	private WebElement addToCart;

	public WebElement getAddToCart() {
		return addToCart;
	}
	
	@FindBy(xpath = "(//input[@value='Add To Cart'])[1]")
	private WebElement yorkshireLambPattiesAddtocartButton;

	public WebElement getYorkshireLambPattiesAddtocartButton() {
		return yorkshireLambPattiesAddtocartButton;
	}
	public void clickYorkshireLambPattiesAddtocartButton()
	{
		yorkshireLambPattiesAddtocartButton.click();
	}
	
	@FindBy(xpath = "//div[@class='title-row']")
	private WebElement yourCartItemname;

	public WebElement getYourCartItemname() {
		return yourCartItemname;
	}
	public String nameOfTheItem()
	{
		return yourCartItemname.getText();
	}
	
	@FindBy(xpath = "//i[@class='fa fa-trash pull-right']")
	private WebElement deleteButton;

	public WebElement getDeleteButton() {
		return deleteButton;
	}
	
	@FindBy(xpath = "//a[@class='btn btn-success btn-lg active']")
	private WebElement checkoutButton;

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}
	
	@FindBy(xpath = "(//input[@class='btn theme-btn'])[1]")
	private WebElement PinkSpaghettiGamberoniRestaurantAddtocart;

	public WebElement getPinkSpaghettiGamberoniRestaurantAddtocart() {
		return PinkSpaghettiGamberoniRestaurantAddtocart;
	}
	
	@FindBy(xpath = "(//input[@class='btn theme-btn'])[1]")
	private WebElement vegetableFriedRiceAddtocartButton;

	public WebElement getVegetableFriedRiceAddtocartButton() {
		return vegetableFriedRiceAddtocartButton;
	}
	
	@FindBy(xpath = "(//input[@class='btn theme-btn'])[1]")
	private WebElement chickenMadeiraAddtocartButton;

	public WebElement getChickenMadeiraAddtocartButton() {
		return chickenMadeiraAddtocartButton;
	}
	
	

}
