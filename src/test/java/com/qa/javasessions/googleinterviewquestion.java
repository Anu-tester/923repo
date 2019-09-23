package com.qa.javasessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class googleinterviewquestion {
	@Test
	public void firsttest() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Google Maps");
		
		int i = 0;
		while (i < 4) {
			driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ARROW_DOWN);

			i++;
		}
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
		driver.close();
		
	}

	@Test
	public void secondtest() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Google Maps");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Google Maps app")).click();
		driver.quit();
	}
}
