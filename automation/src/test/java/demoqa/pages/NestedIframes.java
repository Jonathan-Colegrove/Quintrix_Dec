package demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import framework.PageObjectBase;

public class NestedIframes extends PageObjectBase {
	private static final String URL = "https://demoqa.com/nestedframes";
	@FindBy(how = How.ID, using = "frame1")
	WebElement ParentFrame;
	@FindBy(how = How.XPATH, using = "//iframe[@srcdoc='<p>Child Iframe</p>']")
	WebElement ChildFrame;

	public NestedIframes(WebDriver driver) {
		super(driver);
	}

	public NestedIframes navigate() {

		this.driver.get(URL);
		return this;
	}

	public String getText() {

		return new NestedIframesCtrlExtn(driver, ParentFrame, ChildFrame).getText();

	}
}
