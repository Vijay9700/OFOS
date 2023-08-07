package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page extends BasePage {

	public Home_Page(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[text()='Home ' ]")
	private WebElement homeLink;

	public WebElement getHomeLink() {
		return homeLink;
	}

	public void setHomeLink(WebElement homeLink) {
		this.homeLink = homeLink;
	}

	public void clickHomeLink() {
		homeLink.click();
	}

	@FindBy(xpath = "//a[text()='Restaurants ' ]")
	private WebElement resturantLink;

	public WebElement getResturantLink() {
		return resturantLink;
	}

	public void setResturantLink(WebElement resturantLink) {
		this.resturantLink = resturantLink;
	}

	public void clickResturantLink() {
		resturantLink.click();
	}

	@FindBy(linkText = "Login")
	private WebElement loginLink;

	public WebElement getLoginLink() {
		return loginLink;
	}

	public void setLoginLink(WebElement loginLink) {
		this.loginLink = loginLink;
	}

	public void clickLoginLink() {
		loginLink.click();
	}

	@FindBy(linkText = "Register")
	private WebElement registerLink;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public void setRegisterLink(WebElement registerLink) {
		this.registerLink = registerLink;
	}

	public void clickRegisterLink() {
		registerLink.click();
	}

	@FindBy(xpath = "(//a[@class='btn theme-btn-dash pull-right'])[1]")
	private WebElement yorkshireLambPattiesOrderButton;

	public WebElement getYorkshireLambPattiesOrderButton() {
		return yorkshireLambPattiesOrderButton;
	}

	public void setYorkshireLambPattiesOrderButton(WebElement yorkshireLambPattiesOrderButton) {
		this.yorkshireLambPattiesOrderButton = yorkshireLambPattiesOrderButton;
	}

	public void clickYorkshireLambPattiesOrderButton() {
		yorkshireLambPattiesOrderButton.click();
	}

	@FindBy(xpath = "(//a[text()='Order Now' ])[ 2]")
	private WebElement lobsterThermidorOrderButton;

	public WebElement getLobsterThermidorOrderButton() {
		return lobsterThermidorOrderButton;
	}

	public void setLobsterThermidorOrderButton(WebElement lobsterThermidorOrderButton) {
		this.lobsterThermidorOrderButton = lobsterThermidorOrderButton;
	}

	public void clickLobsterThermidorOrderButton() {
		lobsterThermidorOrderButton.click();
	}

	@FindBy(xpath = "(//a[text()='Order Now' ])[ 3]")
	private WebElement chickenMadeirarOrderButton;

	public WebElement getChickenMadeirarOrderButton() {
		return chickenMadeirarOrderButton;
	}

	public void setChickenMadeirarOrderButton(WebElement chickenMadeirarOrderButton) {
		this.chickenMadeirarOrderButton = chickenMadeirarOrderButton;
	}

	public void clickChickenMadeirarOrderButton() {
		chickenMadeirarOrderButton.click();
	}

	@FindBy(xpath = "(//a[text()='Order Now' ])[ 4]")
	private WebElement stuffedJacketPotatoesOrderButton;

	public WebElement getStuffedJacketPotatoesOrderButton() {
		return stuffedJacketPotatoesOrderButton;
	}

	public void setStuffedJacketPotatoesOrderButton(WebElement stuffedJacketPotatoesOrderButton) {
		this.stuffedJacketPotatoesOrderButton = stuffedJacketPotatoesOrderButton;
	}

	public void clickStuffedJacketPotatoesOrderButton() {
		stuffedJacketPotatoesOrderButton.click();
	}

	@FindBy(xpath = "(//a[text()='Order Now' ])[ 5]")
	private WebElement PinkSpaghettiGamberoniOrderButton;

	public WebElement getPinkSpaghettiGamberoniOrderButton() {
		return PinkSpaghettiGamberoniOrderButton;
	}

	public void setPinkSpaghettiGamberoniOrderButton(WebElement pinkSpaghettiGamberoniOrderButton) {
		PinkSpaghettiGamberoniOrderButton = pinkSpaghettiGamberoniOrderButton;
	}

	public void clickPinkSpaghettiGamberoniOrderButton() {
		PinkSpaghettiGamberoniOrderButton.click();
	}

	@FindBy(xpath = "(//a[text()='Order Now' ])[ 6]")
	private WebElement cheesyMashedPotatoOrderButton;

	public WebElement getCheesyMashedPotatoOrderButton() {
		return cheesyMashedPotatoOrderButton;
	}

	public void setCheesyMashedPotatoOrderButton(WebElement cheesyMashedPotatoOrderButton) {
		this.cheesyMashedPotatoOrderButton = cheesyMashedPotatoOrderButton;
	}

	public void clickCheesyMashedPotatoOrderButton() {
		cheesyMashedPotatoOrderButton.click();
	}

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutButton;

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public void clickLogoutButton() {
		logoutButton.click();
	}

	@FindBy(xpath = "//a[text()=' Italian']")
	private WebElement italianLink;

	public WebElement getItalianLink() {
		return italianLink;
	}

	@FindBy(xpath = "//a[text()='Eataly']")
	private WebElement eatalyResturantLink;

	public WebElement getEatalyResturantLink() {
		return eatalyResturantLink;
	}
	
	@FindBy(xpath = "//a[text()=' Chinese']")
	private WebElement chineseLink;

	public WebElement getChineseLink() {
		return chineseLink;
	}
	
	@FindBy(xpath = "//a[text()='Nan Xiang Xiao Long Bao']")
	private WebElement nanXiangXiaoLongBaoResturantLink;

	public WebElement getNanXiangXiaoLongBaoResturantLink() {
		return nanXiangXiaoLongBaoResturantLink;
	}
	
	@FindBy(xpath = "//a[text()=' American']")
	private WebElement americanLink;

	public WebElement getAmericanLink() {
		return americanLink;
	}
	
	@FindBy(xpath = "//a[text()='Highlands Bar & Grill']")
	private WebElement highlandsBarGrillResturantLink;

	public WebElement getHighlandsBarGrillResturantLink() {
		return highlandsBarGrillResturantLink;
	}
	
	@FindBy(xpath = "//a[text()=' Continental']")
	private WebElement continentalLink;

	public WebElement getContinentalLink() {
		return continentalLink;
	}
	
	@FindBy(xpath = "//a[text()=' Heavenly Food']")
	private WebElement heavenlyFoodResturantLink;

	public WebElement getHeavenlyFoodResturantLink() {
		return heavenlyFoodResturantLink;
	}
	
	@FindBy(xpath = "(//div[@class='widget-heading'])[2]")
	private WebElement menuDropdown;

	public WebElement getMenuDropdown() {
		return menuDropdown;
	}
	
	@FindBy(xpath = "//a[text()=' South Indian']")
	private WebElement southIndianResturantLink;

	public WebElement getSouthIndianResturantLink() {
		return southIndianResturantLink;
	}
	
	@FindBy(xpath = "//a[text()=' North Indian']")
	private WebElement northIndianResturantLink;

	public WebElement getNorthIndianResturantLink() {
		return northIndianResturantLink;
	}
	
	@FindBy(xpath = "//a[text()=' hell']")
	private WebElement hellResturantLink;

	public WebElement getHellResturantLink() {
		return hellResturantLink;
	}
	
	
	
}
