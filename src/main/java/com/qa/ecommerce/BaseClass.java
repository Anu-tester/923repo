package com.qa.ecommerce;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ecommerce.utilities.TestUtil;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public BaseClass() {
		try {
			prop = new Properties();

			FileInputStream ip = new FileInputStream(
					"C:\\Users\\Anu\\Ecommerce\\com.qa.ecommerce\\src\\main\\java\\com\\ecommerce\\utilities\\config.properties");

			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "c://geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));

	}

}
