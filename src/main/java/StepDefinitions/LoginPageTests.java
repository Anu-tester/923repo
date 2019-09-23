package StepDefinitions;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

//import com.crm.qa.testcases.LoginPageTest;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginPageTests {
	public static Logger logger = LogManager.getLogger(LoginPageTests.class);

	public static WebDriver driver;

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {
		logger.fatal("initializing driver");
		// Write code here that turns the phrase above into concrete actions
		//System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");

		driver.findElement(By.xpath("//*[@id='gh-ug']/a")).click();

	}

	@When("^Check Customer Login Page title valid$")
	public void check_Customer_Login_Page_title() {
		// Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
		// System.out.println(title);
		logger.info(title);
		Assert.assertEquals(title, "Sign in or Register | eBay");
	}

	@Then("^Check Customer Login with valid Data\"([^\"]*)\" and \"([^\"]*)\"$")
	public void check_Customer_Login_with_valid_Data_and(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id='userid']")).clear();
		driver.findElement(By.xpath("//*[@id='userid']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\'pass\']")).clear();
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys(password);
		// driver.close();
	}

	@Then("^Check Customer Login with invalid Data\"([^\"]*)\" and \"([^\"]*)\"$")
	public void check_Customer_Login_with_invalid_Data(String username1, String password1) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id='userid']")).clear();
		driver.findElement(By.xpath("//*[@id='userid']")).sendKeys(username1);
		driver.findElement(By.xpath("//*[@id=\'pass\']")).clear();
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys(password1);
		driver.quit();
	}

	// Reg Exp:
	// //1. \"([^\"]*)\"
	// //2. \"(.*)\"
	@Given("^user is already on data table Login Page$")
	public void user_is_already_on_data_table_Login_Page() {
		logger.fatal("initializing driver");
		// Write code here that turns the phrase above into concrete actions
		//System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		//driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");

		driver.findElement(By.xpath("//*[@id='gh-ug']/a")).click();
	}

	@Then("^Check Customer Login with valid Data$")
	public void check_Customer_Login_with_valid_Data(DataTable credentials) {

		// List<Map<String, String>> data = credentials.asMaps(String.class,
		// String.class);
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			driver.findElement(By.xpath("//*[@id='userid']")).clear();
			driver.findElement(By.xpath("//*[@id='userid']")).sendKeys(data.get("name"));
			driver.findElement(By.xpath("//*[@id=\'pass\']")).clear();
			driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys(data.get("passw"));
		}
	}

	@Then("^Check Customer Login with invalid Data$")
	public void check_Customer_Login_with_invalid_Data(DataTable credentials) {

		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			driver.findElement(By.xpath("//*[@id='userid']")).clear();
			driver.findElement(By.xpath("//*[@id='userid']")).sendKeys(data.get("name1"));
			driver.findElement(By.xpath("//*[@id=\'pass\']")).clear();
			driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys(data.get("passw1"));
		}
		driver.manage().deleteAllCookies();
		driver.quit();
	}

}
