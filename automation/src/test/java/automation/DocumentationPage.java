package automation;

import org.openqa.selenium.WebDriver;

public class DocumentationPage extends PageObjectBase {
	private WebDriver driver;
	
		public DocumentationPage(WebDriver driver) {
			super(driver);
		}
		
		public String getCurrentUrl() {
			return this.driver.getCurrentUrl();
		}
}
