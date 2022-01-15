package demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedIframesCtrlExtn {

	private WebElement parentelement;
	private WebElement childElement;
	private WebDriver driver;

	public NestedIframesCtrlExtn(WebDriver driver, WebElement parentelement, WebElement childElement) {
		this.driver = driver;
		this.parentelement = parentelement;
		this.childElement = childElement;
	}

	public String getText() {

		this.driver.switchTo().frame(parentelement).switchTo().frame(childElement);
		return this.driver.findElement(By.xpath("/html/body/p")).getText();

	}

}
