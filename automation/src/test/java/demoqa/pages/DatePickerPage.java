package demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import framework.PageObjectBase;

public class DatePickerPage extends PageObjectBase {

	private final String URL = "https://demoqa.com/date-picker";
	
	public DatePickerPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how=How.ID, using="datePickerMonthYearInput")
	private WebElement DatePicker;
	
	@FindBy(how=How.ID, using="dateAndTimePickerInput")
	private WebElement DateAndTimePicker;
	
	public void navigate() {
		driver.navigate().to(URL);
	}
	
	public void setValue(String value) {
		DatePicker.sendKeys(value);
	}
	
	public String getText() {
		String text = DatePicker.getAttribute("value");
		return text;
	}
	
	public void setTimeValue(String value) {
		DateAndTimePicker.sendKeys(value);
	}
	
	public String getTimeText() {
		String text = DateAndTimePicker.getAttribute("value");
		return text;
	}
}
