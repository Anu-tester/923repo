package StepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggingTestCases {
	WebDriver driver;
	Actions action;

	// *[@id="nav-link-accountList"]/span[2]
	@Given("^: User is in HomePage$")
	public void user_is_in_HomePage() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
	}

	@When("^: Mouseover to Account and Lists details$")
	public void mouseover_to_Account_and_Lists_details() {
		 action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[1]"))).build().perform();

	}

	@Then("^: Click on Account$")
	public void click_on_Account() {
		driver.findElement(By.xpath("//*[@id='nav-al-wishlist']/a[1]/span")).click();
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Testing");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).clear();
		action.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("testing upper case").build().perform();
	}


	
	
	@Then("^: Close the HomePage$")
	public void close_the_HomePage() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.close();
	}
	
	
}
