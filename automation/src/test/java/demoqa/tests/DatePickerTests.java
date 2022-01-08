package demoqa.tests;

import org.testng.annotations.Test;

import demoqa.pages.DatePickerPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DatePickerTests extends TestBase {
	
	@Test
	public void canSetDate() {

		// Arrange
		String date = "01/01/2022";

		// Act
		new DatePickerPage(getDriver()).navigate();
		new DatePickerPage(getDriver()).setValue(date);
		
		String actualDate = new DatePickerPage(getDriver()).getText();
		Boolean trueFalse = actualDate.contains(date);
		
		// Assert
		Assert.assertTrue(trueFalse);
	}
	
	@Test
	public void canGetDate() {

		// Arrange
		new DatePickerPage(getDriver()).navigate();
		
		// Act
		String actualDate = new DatePickerPage(getDriver()).getText();
		
		// Assert
		Assert.assertNotNull(actualDate);
	}
	
	@Test
	public void canSetDateAndTime() {

		// Arrange
		String dateAndTime = "January 4, 2022 4:29 PM";

		// Act
		new DatePickerPage(getDriver()).navigate();
		new DatePickerPage(getDriver()).setTimeValue(dateAndTime);
		
		String actualDate = new DatePickerPage(getDriver()).getTimeText();
		Boolean trueFalse = actualDate.contains(dateAndTime);
		
		// Assert
		Assert.assertTrue(trueFalse);
	}
	
	@Test
	public void canGetDateAndTime() {

		// Arrange
		new DatePickerPage(getDriver()).navigate();
		
		// Act
		String actualDate = new DatePickerPage(getDriver()).getTimeText();
		
		// Assert
		Assert.assertNotNull(actualDate);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		super.setup();
	}

	@AfterMethod
	public void afterMethod() {
		super.cleanup();
	}
}
