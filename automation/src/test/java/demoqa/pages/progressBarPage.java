package demoqa.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.PageObjectBase;

public class progressBarPage extends PageObjectBase{
	private String Header = "Progress Bar";
	private String urlProgressBar = "https://demoqa.com/progress-bar";
	WebDriverWait wait=new WebDriverWait(driver,20);

	public progressBarPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how=How.ID, using="startStopButton")
	private WebElement StartButton;

	public void startProgressBar() {
		driver.findElement(By.id("startStopButton")).click();
	}

	public boolean resetProgressBar() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resetButton")));
		return element.isDisplayed();
	}

	public void gotoProgressBar() {
		this.driver.navigate().to(urlProgressBar);
		String actualHeader = driver.findElement(By.className("main-header")).getText();
		Assert.assertEquals("We reached Progress Bar Page",Header, actualHeader);
		}
	
	public void gotoElements() {
		driver.findElement(By.xpath("//div[@class=\"card-body\"]//h5[normalize-space(text())=\"Elements\"]")).click();
	}
	
	public void gotoWidgets() {
		driver.findElement(By.xpath("//div[@class=\"card-body\"]//h5[normalize-space(text())=\"Widgets\"]")).click();
	}
}
