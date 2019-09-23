package com.qa.ecommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrandsPage extends BaseClass {

	@FindBy(linkText = "BRANDS")
	WebElement account;

	@FindBy(xpath = "//table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/a/img")
	WebElement hp;

	@FindBy(xpath = "//*[@id=\"leftcontent\"]/p[2]/a/img")
	WebElement viewitem;
	// table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/a/img

	@FindBy(xpath = "//table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr/td/form[1]/table/tbody/tr[6]/td[3]/input")
	WebElement addtocart;

	@FindBy(css="body > table > tbody > tr:nth-child(2) > td > table > tbody > tr > td:nth-child(2) > table:nth-child(1) > tbody > tr:nth-child(3) > td > table > tbody > tr.bordertop > td:nth-child(2) > a > div")
	WebElement checkout;
//	@FindBy(xpath="//table/tbody/tr[2]/td/table/tbody/tr/td[2]/table[1]/tbody/tr[3]/td/table/tbody/tr[5]/td[2]/a/div")
//	WebElement checkout;

	@FindBy(linkText = "LOGOUT")
	WebElement logout;

	public BrandsPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickonbrand() {
		account.click();
	}

	public void clickonhp() {
		hp.click();
	}

	public void viewitemclick() {
		viewitem.click();
	}

	public void addtocartclick() {
		addtocart.click();
	}
	
	public void clickcheckout() {
		checkout.click();
	}

	public void logoutclick() {
		logout.click();
	}
}
