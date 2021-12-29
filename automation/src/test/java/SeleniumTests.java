import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTests {
	
	private ChromeDriver driver;
	private final String url = "https://www.selenium.dev/";

	@BeforeMethod
	public void setup() {

		String driverpath = "C:\\Users\\Jonathan\\Desktop\\Quintrix\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);

		this.driver = new ChromeDriver();

		this.driver.navigate().to(url);
	}
	
	@AfterMethod
	public void cleanUp() {
		this.driver.quit();
	}

	@Test
	public void canLaunchWebDriver() {
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(url, currentURL);
	}

	@Test
	public void canClickButton() {
		WebElement element = driver.findElement(By.cssSelector("a[href='/documentation/webdriver/']"));
		element.click();
	}
}
