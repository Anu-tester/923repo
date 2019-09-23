package com.qa.ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ecommerce.utilities.Excel_Reader;

public class DataProvider2 {
	public WebDriver driver;

	@BeforeMethod
	public void invokeweb() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//*[@id='gh-ug']/a")).click();
	}
	
	@DataProvider
	public Object[][] datadriveexcel() {
		Excel_Reader reader=new Excel_Reader();
		Object data[][] =reader.getTestData("Data");
		return data;
	}
	@Test(dataProvider="datadriveexcel")
	public void getdata(String FirstName, String LastName){
		
		driver.findElement(By.xpath("//*[@id='userid']")).clear();
		driver.findElement(By.xpath("//*[@id='userid']")).sendKeys(FirstName);
		driver.findElement(By.xpath("//*[@id=\'pass\']")).clear();
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys(LastName);
		driver.close();
		
	}
	
}
