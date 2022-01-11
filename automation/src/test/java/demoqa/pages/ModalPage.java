package demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.ControlExtensionBase;
import framework.PageObjectBase;

public class ModalPage extends PageObjectBase {
	
	private final String url = "https://demoqa.com/modal-dialogs";
	private ModalControlExtension controller = new ModalControlExtension(this.driver);
	
	@FindBy(how=How.ID, using="showSmallModal")
	private WebElement showSmallModalElement;
	
	@FindBy(how=How.ID, using="showLargeModal")
	private WebElement showLargeModalElement;

	public ModalPage(WebDriver driver) {
		super(driver);
	}
	
	public String getURL() {
		return url;
	}
	
	public ControlExtensionBase getController() {
		return this.controller;
	}
	
	public PageObjectBase navigate() {
		this.driver.navigate().to(url);
		return this;
	}

	public void click(WebElement element) {
		controller.select(element);
	}
	
	public Boolean checkModalContent(String contents, String id) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(id))));
		WebElement element = driver.findElement(By.id(id));
		return controller.hasText(element, contents);
	}

	public void clickSmallModel() {
		click(showSmallModalElement);
	}

	public void clickLargeModel() {
		click(showLargeModalElement);
	}

	public boolean isSmallModalVisible() {
		return checkModalContent("Small Modal","example-modal-sizes-title-sm");
	}

	public boolean isLargeModalVisisble() {
		return checkModalContent("Large Modal","example-modal-sizes-title-lg");
	}
}
