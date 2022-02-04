import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebDriverTest {
	ChromeDriver driver;

	@Test
	public void canLaunchChromeDriver() {
		//arrange

		//act
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jonathan\\Desktop\\Quintrix\\chromedriver.exe");
		this.driver = new ChromeDriver();

		//assert
		Assert.assertNotNull(driver, "Chrome Driver is null");
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
		if(this.driver != null) {
			this.driver.quit();
		}
	}

}
