package com.qa.ecommerce;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass  {
	LoginPage loginpg;

	public LoginPageTest() {
		super();
	}

	@BeforeTest
	public void setup() {

		initialization();
		loginpg = new LoginPage();

	}

	@Test
	public void loginpagetitletest() {
		String title = loginpg.LoginPageTitle();
		Assert.assertEquals(title, "Ez Shop Online");
	}

	@Test
	public void logotest() {
		boolean flag = loginpg.Imagedisplayed();
		Assert.assertTrue(flag);
	}

	@Test
	public void login() {
		loginpg.accountbarclick();
		loginpg.Login(prop.getProperty("usname"), prop.getProperty("pwd"));
		loginpg.submit();
	}

	@Test
	public void testlogin() {
		System.out.println(driver.findElement(By.cssSelector("div.fntstyle")).isDisplayed());
		System.out.println("pass");

	}

//	@Test
//	public void teardown() {
//		driver.quit();
//	}
}
