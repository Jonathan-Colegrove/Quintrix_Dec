package controlExtension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import framework.PageObjectBase;

public class Links extends PageObjectBase {
	
	protected Links(WebDriver driver) {
		super(driver);
	}

	@FindBy(how=How.ID, using="simpleLink")
	private WebElement Home;
	
	public void click (String label) {
		WebElement hyperlink = driver.findElement(By.id(label));
		hyperlink.click();
	}
}
