package demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.ControlExtensionBase;

public class ModalControlExtension extends ControlExtensionBase {

	public ModalControlExtension(WebDriver driver) {
		super.driver = 	driver;
	}

	public Boolean hasText(WebElement element, String contents) {
		return element.getText().contains(contents);
	}
}
