package com.qa.ecommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	// PageFactory

	@FindBy(linkText = "ACCOUNT")
	WebElement account;

	@FindBy(css = "a.continue")
	WebElement signup;

	@FindBy(css = "body > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td > img")
	WebElement image;

	@FindBy(id = "email")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(linkText = "Lost Password?")
	WebElement lostpassword;

	@FindBy(xpath = "//a[@class='continue']/div")
	WebElement submit;

	@FindBy(xpath = "//div[@class='fntstyle']")
	WebElement textlogin;

	@FindBy(linkText="Account Details")
	WebElement accountdetails;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String LoginPageTitle() {
		return driver.getTitle();
	}

	public boolean Imagedisplayed() {
		return image.isDisplayed();
	}

	public void accountbarclick() {
		account.click();
	}

	public void Login(String name, String pwd) {
		username.sendKeys(name);
		password.sendKeys(pwd);

	}

	public void submit() {
		submit.click();
	}

	public String logingettext() {
		return textlogin.getText();
	}
	public void Accountdetailsclick() {
		accountdetails.click();
	}
}

