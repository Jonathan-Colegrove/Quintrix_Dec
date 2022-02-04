import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AmpegTests {
	WebDriver driver;

	@Test
	public void canGetArtistName() {
		String expectedArtist = "Bootsy Collins";
		
		// 1. go to home page
		// 2. click on products
		// 3. click on classic series
		// 4. click on SVT-810E
		// 5. get artist's name
		String artist = new Homepage(this.driver)
		.navigate()
		.goToProductsPage()		
		.goToProductSeries()
		.goToProductDetails()
		.getArtistName();

		Assert.assertEquals(artist, expectedArtist);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jonathan\\Desktop\\Quintrix\\chromedriver.exe");
		this.driver = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {
		if(this.driver != null) {
			this.driver.quit();
		}
	}

}
