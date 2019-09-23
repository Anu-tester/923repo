package com.qa.ecommerce;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BrandsPageTest extends BaseClass {

	@Test
	public void clickonBrands() {
		BrandsPage brand = new BrandsPage();
		brand.clickonbrand();
		brand.clickonhp();
		brand.viewitemclick();
		brand.addtocartclick();
		brand.clickcheckout();
		brand.logoutclick();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
