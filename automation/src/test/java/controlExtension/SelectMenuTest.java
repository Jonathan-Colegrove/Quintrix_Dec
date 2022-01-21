package controlExtension;

import org.testng.annotations.Test;

import January5.TestBase;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SelectMenuTest  extends TestBase {

	@BeforeTest
	public void beforeTest() {
		setup();
	}

	@AfterTest
	public void afterTest() {
		cleanup();
	}

	@Test
	public void getValueTest() {
		// Arrange
		SelectMenu selector = new SelectMenu(super.getDriver());
		selector.navigate();

		// Act
		selector.getOptions();

		// Assert
//		Assert.assertEquals(selector.getOptions().toString(),"Red", "Blue", "Green", "Yellow", "Purple", "Black", "White", "Violet", "Indigo", "Magenta", "Aqua");
	}

	@Test
	public void setValueTest() {
		// Arrange
		SelectMenu selector = new SelectMenu(super.getDriver());
		selector.navigate();

		// Act
		selector.setValue("Green");

		// Assert
		Assert.assertEquals(selector.getValue(), "Green");
	}
}
