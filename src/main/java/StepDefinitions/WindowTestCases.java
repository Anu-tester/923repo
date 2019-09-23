package StepDefinitions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WindowTestCases {
	public final static Logger logger = Logger.getLogger(WindowTestCases.class);
	WebDriver driver;

	@When("^: User is in Home Page$")
	public void user_is_in_Home_Page() {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
	}

	@Then("^: Click on child window$")
	public void click_on_child_window() {
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> its = ids.iterator();
		String parentID = its.next();
		String childId = its.next();
		driver.switchTo().window(childId);
		//System.out.println(driver.getTitle());
		logger.debug(driver.getTitle());
		driver.switchTo().window(parentID);
		//System.out.println(driver.getTitle());
		logger.debug(driver.getTitle());
		driver.quit();
	}

	@Then("^: Click on Mytrip Home Page$")
	public void click_on_Mytrip_Home_Page() {
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.quit();
	}

	
	public void click_on_date() {
		
//		By element=By.xpath("//*[@id='webklipper-publisher-widget-container-notification-close-div']");
//		int num=gotoframe(driver, element);
//		driver.switchTo().frame(num);
//		driver.findElement(element).click();
//		 Alert alert = driver.switchTo().alert();	
//		 alert.dismiss();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		//By element=By.xpath("//*[@id='webklipper-publisher-widget-container-notification-close-div']");
		//driver.findElement(element).click();
		//driver.findElement(By.xpath("//*[@id='departure']")).click();
		driver.findElement(By.cssSelector("#Group")).click();
		driver.findElement(By.cssSelector("#deny")).click();
		driver.close();
		//driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[2]/div[6]/div/p[2])")).click();
		//driver.findElement(By.xpath("//*[@id='return']")).click();
	}

	public static int gotoframe(WebDriver driver, By by)

	{

		driver.switchTo().defaultContent();

		int i;

		int num = -1;

		int a = driver.findElements(By.tagName("iframe")).size();
		System.out.println(a);
		driver.switchTo().defaultContent();
		for (i = 0; i < a; i++)

		{

			driver.switchTo().defaultContent();

			driver.switchTo().frame(i);

			int b = driver.findElements(by).size();

			if (b > 0)

			{

				num = i;

				break;

			}
			else {
				System.out.println("continue looping");
			}
			
			
		}
		driver.switchTo().defaultContent();
		return num;
		
		
	}
}
