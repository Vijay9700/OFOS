package pom_pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register_Page extends BasePage {

	public Register_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(name="username")
	private WebElement usernameTextfield;

	public WebElement getUsernameTextfield() {
		return usernameTextfield;
	}

	public void setUsernameTextfield(WebElement usernameTextfield) {
		this.usernameTextfield = usernameTextfield;
	}
	public void enterValueOnUsernametextfield(String username)
	{
		usernameTextfield.sendKeys(username);
	}
	
	@FindBy(name = "firstname")
	private WebElement firstnameTextfield;

	public WebElement getFirstnameTextfield() {
		return firstnameTextfield;
	}

	public void setFirstnameTextfield(WebElement firstnameTextfield) {
		this.firstnameTextfield = firstnameTextfield;
	}
	public void enterFirstname(String firstname)
	{
		firstnameTextfield.sendKeys(firstname);
	}
	
	@FindBy(name = "lastname")
	private WebElement lastnameTextfield;

	public WebElement getLastnameTextfield() {
		return lastnameTextfield;
	}

	public void setLastnameTextfield(WebElement lastnameTextfield) {
		this.lastnameTextfield = lastnameTextfield;
	}
	public void enterLastname(String lastname)
	{
		lastnameTextfield.sendKeys(lastname);
	}
	
	@FindBy(name = "email")
	private WebElement emailTextfield;

	public WebElement getEmailTextfield() {
		return emailTextfield;
	}

	public void setEmailTextfield(WebElement emailTextfield) {
		this.emailTextfield = emailTextfield;
	}
	public void enterEmail(String email)
	{
		emailTextfield.sendKeys(email);
	}
	
	@FindBy(name = "phone")
	private WebElement phonenumberTextfield;

	public WebElement getPhonenumberTextfield() {
		return phonenumberTextfield;
	}

	public void setPhonenumberTextfield(WebElement phonenumberTextfield) {
		this.phonenumberTextfield = phonenumberTextfield;
	}
	public void enterPhoneNumber(String phonenumber)
	{
		phonenumberTextfield.sendKeys(phonenumber);
	}
	
	@FindBy(name = "password")
	private WebElement passwordTextfield;

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public void setPasswordTextfield(WebElement passwordTextfield) {
		this.passwordTextfield = passwordTextfield;
	}
	public void enterPassword(String password)
	{
		passwordTextfield.sendKeys(password);
	}
	
	@FindBy(name = "cpassword")
	private WebElement confirmPasswordTextfield;

	public WebElement getConfirmPasswordTextfield() {
		return confirmPasswordTextfield;
	}

	public void setConfirmPasswordTextfield(WebElement confirmPasswordTextfield) {
		this.confirmPasswordTextfield = confirmPasswordTextfield;
	}
	public void enterConfirmPassword(String confirmPassword)
	{
		confirmPasswordTextfield.sendKeys(confirmPassword);
	}
	
	@FindBy(id = "exampleTextarea")
	private WebElement deliveryAddress;

	public WebElement getDeliveryAddress() {
		return deliveryAddress;
	}
	public void enterAddress(String address)
	{
		deliveryAddress.sendKeys(address);
	}
	
	@FindBy(name = "submit")
	private WebElement registerButton;

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public void setRegisterButton(WebElement registerButton) {
		this.registerButton = registerButton;
	}

	public void setDeliveryAddress(WebElement deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public void clickRegisterButton()
	{
		registerButton.click();
	}
	
	
}
