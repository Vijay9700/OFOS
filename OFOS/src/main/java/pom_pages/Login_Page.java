package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends BasePage {

	public Login_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(name = "username")
	private WebElement usernameTextfield;

	public WebElement getUsernameTextfield() {
		return usernameTextfield;
	}

	public void setUsernameTextfield(WebElement usernameTextfield) {
		this.usernameTextfield = usernameTextfield;
	}
	public void enterValueOnUsernameTextfield(String username)
	{
		usernameTextfield.sendKeys(username);
	}

	@FindBy(name = "password")
	private WebElement passwordTextfield;

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public void setPasswordTextfield(WebElement passwordTextfield) {
		this.passwordTextfield = passwordTextfield;
	}
	public void enterValueOnPasswordTextfield(String password)
	{
		passwordTextfield.sendKeys(password);
	}
	
	@FindBy(id = "buttn")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	public void clickLoginButton()
	{
		loginButton.click();
	}
}
