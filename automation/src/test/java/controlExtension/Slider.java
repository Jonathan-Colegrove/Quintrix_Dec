package controlExtension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import framework.PageObjectBase;

public class Slider extends PageObjectBase {
	
private final String URL = "https://demoqa.com/slider";
	
	protected Slider(WebDriver driver) {
		super(driver);
	}
	
	public void navigate() {
		driver.navigate().to(URL);
	}
	
//	find element!
//	@FindBy(how=How.ID, using="")
//	private WebElement SliderBar;
	
	public void setValue(String value) {
		
	}
	
	public String getValue() {
		return null;
	}
}
