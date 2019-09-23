package com.qa.ecommerce;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidersample1 {
	public Ebaypage eb;
	public WebDriver driver;
	public static final Logger logger = Logger.getLogger(Dataprovidersample1.class);
	@BeforeMethod
	public void invokeweb() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//*[@id='gh-ug']/a")).click();

	}

	@Test(dataProvider = "getdata")
	public void setdata(String names, String country) {
		
		logger.debug("This is debug log4j message");
		//
		//
		// eb.fnclick(names);
		// eb.lnclick(country);
		
		driver.findElement(By.xpath("//*[@id='userid']")).clear();
		driver.findElement(By.xpath("//*[@id='userid']")).sendKeys(names);
		driver.findElement(By.xpath("//*[@id='pass']")).clear();
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(country);
		driver.close();
		// System.out.println(names);
		// System.out.println(country);

	}

	@DataProvider
	public Object[][] getdata() {
		Object data[][] = new Object[3][2];
		data[0][0] = "firstsetusername";
		data[0][1] = "firstpassword";
		data[1][0] = "second username";
		data[1][1] = "secondpassword";
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		return data;
	}

}
