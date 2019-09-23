package com.qa.ecommerce;

import org.testng.annotations.Test;

public class ProductsPageTest extends BaseClass {

	ProductsPage productpg;

	public ProductsPageTest() {
		super();
	}

	@Test
	public void setup() {
		// initialization();
		productpg = new ProductsPage();
		productpg.productclick();
		System.out.println("pass");
//		productpg.viewcarthpenvy();
//		System.out.println("passed");
	}

//	@Test
//	public void clickonviewcart1() {
////	Actions action=new Actions(driver);
////	WebElement WE=driver.findElement(By.xpath("//div[@id='leftblock']"));
////	//driver.switchTo().frame(WE);
////	action.moveToElement(WE).build().perform();
//	driver.findElement(By.xpath("(//a[@class='aa'])[3]")).click();
//	
//	}
	// productpg.addcarthpenvy();

	// driver.close();

//	@Test
//	public void teardown() {
//		driver.quit();
//	}
}
