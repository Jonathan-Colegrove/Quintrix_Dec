import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage extends PageObject {

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}

	public String getArtistName() {
		return this.getDriver().findElement(By.cssSelector("div[id='artist'] > P > B")).getText();
//		return new ProductDetailsPage(this.getDriver());
	}

}
