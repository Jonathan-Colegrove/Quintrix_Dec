package controlExtension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import framework.PageObjectBase;

public class RadioButton extends PageObjectBase {
	
	private final String URL = "https://demoqa.com/radio-button";
	
	protected RadioButton(WebDriver driver) {
		super(driver);
	}
	
	public void navigate() {
		driver.navigate().to(URL);
	}

	@FindBy(how=How.ID, using="yesRadio")
	private WebElement Yes;
	
	@FindBy(how=How.ID, using="impressiveRadio")
	private WebElement Impressive;
	
	@FindBy(how=How.ID, using="noRadio")
	private WebElement No;
	
	public void select (String label) {
		Yes.sendKeys(label);
	}
	
	public String getSelected() {
		return null;
	}
}
