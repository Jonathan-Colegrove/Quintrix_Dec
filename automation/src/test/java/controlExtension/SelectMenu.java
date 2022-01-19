package controlExtension;

import java.sql.Array;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SelectMenu {
	private final String URL = "https://demoqa.com/select-menu";
	
	@FindBy(how = How.ID, using = "oldSelectMenu")
	private WebElement dropDown;
	
	public void setValue(String value) {
		dropDown.sendKeys(value);
	}
	
	public String getValue() {
		return dropDown.getText();
		
	}
	
	public String[] getOptions() {
//		Array options[];
//		for (int i = 0; i < dropDown.getSize(); i++) {
//
//		}
//		
		return null;
	}

}
