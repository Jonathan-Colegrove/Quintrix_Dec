package drivers;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
	
	private WebDriver driver;

	public abstract void createDriver();

	public WebDriver getDriver() {
		return this.driver;
	}

	protected void setDriver() {
	}

	public void quitDriver() {
	}
}