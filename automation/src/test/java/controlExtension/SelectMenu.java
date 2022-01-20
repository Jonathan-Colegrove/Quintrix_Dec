package controlExtension;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import framework.PageObjectBase;

public class SelectMenu extends PageObjectBase {
	
	protected SelectMenu(WebDriver driver) {
		super(driver);
	}

	private final String URL = "https://demoqa.com/select-menu";

	@FindBy(how = How.ID, using = "oldSelectMenu")
	private WebElement dropDown;

	public void setValue(String value) {
		dropDown.sendKeys(value);
	}

	public void navigate() {
		driver.navigate().to(URL);
	}

	public String getValue() {
		return dropDown.getText();
	}
	
	public List<String> getOptions() {
		List<String> options = new ArrayList<String>();
		for (int i = 0; i < dropDown.getSize().width; i++) {
			options.add(dropDown.getText());
		}
		return options;
	}
}
