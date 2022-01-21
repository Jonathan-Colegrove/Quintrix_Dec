package seleniumdev.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import seleniumdev.pages.HomePage;

public class SeleniumTests {
	
	private final String homeUrl = "https://www.selenium.dev/";
	private final String documentationUrl = "https://www.selenium.dev/documentation/webdriver/";
	private WebDriver driver;
	
	@BeforeMethod
	public void setup() {

		String driverpath = "C:\\Users\\Jonathan\\Desktop\\Quintrix\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);

		this.driver = new ChromeDriver();

		this.driver.navigate().to(homeUrl);	
		
		long pageLoadTimeout = 60;
		this.driver.manage().timeouts().implicitlyWait(pageLoadTimeout , TimeUnit.SECONDS);		
	}
	
	@AfterMethod
	public void cleanUp() {
		this.driver.quit();
	}
	
	@Test
	public void canLaunchDriver() {
		Assert.assertNotNull(driver, "Driver did NOT launch successfully.");
	}
	
	@Test
	public void canNavigateToSite() {
		String expectedUrl = homeUrl;
		
		new HomePage(driver).navigate();
		
		String actualUrl = this.driver.getCurrentUrl();
		
		Assert.assertEquals(expectedUrl, actualUrl, "Driver did NOT navigate to the url.");
	}

	@Test
	public void canClickButton() {
		WebElement element = driver.findElement(By.cssSelector("a[href='/documentation/webdriver/']"));
		element.click();
	}
	
	@Test
	public void canClickOnElement() {
		String expectedUrl = documentationUrl;
		
		String actualUrl = new HomePage(driver)
				.navigate()
				.viewHomepageDocumentation()
				.getCurrentUrl();
		
		Assert.assertEquals(expectedUrl, actualUrl, "The documentation page was NOT displayed correctly");
	}
}
