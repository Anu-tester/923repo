package com.qa.ecommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebaypage extends BaseClass {

	
//		@FindBy(xpath = "//*[@id='gh-ug-flex']/a")
//		WebElement reg;
	@FindBy(css="#gh-ug-flex > a")
	WebElement reg;
		
		@FindBy(css="#firstname")
		WebElement fn;
		
		@FindBy(css="#lastname")
		WebElement ln;

	public Ebaypage() {
		PageFactory.initElements(driver, this);
	}

	public void clickonreg() {
		reg.click();
	}
	
	public void fnclick(String str) {
		fn.sendKeys(str);
	}
	
	public void lnclick(String str1) {
		fn.sendKeys(str1);
	}
}
