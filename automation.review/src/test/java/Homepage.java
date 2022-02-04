import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	private static final String HOME = "http://ampeg.com";
	private WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	public Homepage navigate() {
		this.driver.navigate().to(HOME);
		return this;
	}
	
	public ProductsPage goToProductsPage() {
		this.driver.findElement(By.cssSelector("a[title='Products']")).click();
		return new ProductsPage(this.driver);
	}
	
}
