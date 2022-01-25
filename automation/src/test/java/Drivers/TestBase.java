package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class TestBase {

	private ChromeDriver driver;

	protected WebDriver getDriver() {
		return this.driver;
	}

	protected void setup() {
//		launchChromeDriver();
	}

	protected void cleanup() {
		this.driver.quit();
	}
}