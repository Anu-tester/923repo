package com.qa.ecommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends BaseClass {

	@FindBy(xpath = "/html/body/table/tbody/tr[1]/td/div/ul/li[4]/a")
	WebElement products;

	@FindBy(css = "#leftcontent > p.byline > a > img")
	WebElement viewhp;

//	@FindBy(xpath="//*[@id='leftcontent']/p[1]")
//	WebElement addcarthpenvy;

	// <div id="leftblock"><div id="leftheader">HP ENVY dv6-7215nr Notebook
	// PC</div><div id="leftcontent"><div
	// style="float:left;padding-right:3px;padding-bottom:3px;"><img
	// src="images/product/midium/hp210004.jpg" border="0" width="80"></div>HP ENVY
	// dv6-7215nr Notebook PC<br>Operating system<br>Windows 8
	// 64<br>Processor<br>Intel� Core� i7-3630QM (3.4 GHz/2.4 GHz )<br>Processor
	// speed<br>3.4 GHz/2.4 GHz<p class="pricetag">£899.99</p><p class="byline"><a
	// href="proddetail.php?proid=10004" class="aa"><img src="images/buynow.jpg"
	// border="0"></a></p></div></div>

	@FindBy(xpath = "//p[@class='byline']/a[4]")
	WebElement addcarthpenvy;

	public ProductsPage() {
		PageFactory.initElements(driver, this);
	}

	public void productclick() {
		products.click();
	}

	public void viewcarthpenvy() {
		viewhp.click();
	}

	public void addcarthpenvy() {
		addcarthpenvy.click();
	}
}

