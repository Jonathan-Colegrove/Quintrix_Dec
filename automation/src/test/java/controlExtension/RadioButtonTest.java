package controlExtension;

import org.testng.Assert;
import org.testng.annotations.Test;
import January5.TestBase;

public class RadioButtonTest extends TestBase {

	@Test
	public void canSelectYes() {
		RadioButton radioButton = new RadioButton(super.getDriver());
		radioButton.navigate();
		
		// Arrange
		String expectedResult = radioButton.getSelected();

		// Act
		radioButton.select("Yes");

		// Assert
		Assert.assertEquals(expectedResult, "Yes");
	}
	
	public void canSelectImpressive() {
		RadioButton radioButton = new RadioButton(super.getDriver());
		radioButton.navigate();
		
		// Arrange
		String expectedResult = radioButton.getSelected();

		// Act
		radioButton.select("Impressive");

		// Assert
		Assert.assertEquals(expectedResult, "Impressive");
	}
	
	public void cannotClickNo() {
		RadioButton radioButton = new RadioButton(super.getDriver());
		radioButton.navigate();
		
		// Arrange
		String expectedResult = radioButton.getSelected();

		// Act
		radioButton.select("No");

		// Assert
		Assert.assertNotEquals(expectedResult, "No");
	}
}
