package controlExtension;

import org.openqa.selenium.By;
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
	
	WebElement SliderBar = driver.findElement(By.xpath("//*[@id=\\\"sliderContainer\\\"]/div[1]/span/input"));

	public void setValue(String value) {
		
	}
	
	public String getValue() {
		return null;
	}
}
