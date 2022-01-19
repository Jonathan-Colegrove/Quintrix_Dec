package controlExtension;

import org.testng.annotations.Test;
import January5.TestBase;
import static org.testng.Assert.assertEquals;

public class SliderTest extends TestBase {

	@Test
	public void canSlideTo80() {
		// Arrange
		Slider slider = new Slider(super.getDriver());
		slider.navigate();
		
		// Act
		slider.setValue("80");
		
		// Assert
		assertEquals(slider.getValue(), "80");
	}
	
	@Test
	public void canSlideTo17() {
		// Arrange
		Slider slider = new Slider(super.getDriver());
		slider.navigate();
		
		// Act
		slider.setValue("17");
		
		// Assert
		assertEquals(slider.getValue(), "17");
	}
	
	@Test
	public void canSlideTo0() {
		// Arrange
		Slider slider = new Slider(super.getDriver());
		slider.navigate();
		
		// Act
		slider.setValue("0");
		
		// Assert
		assertEquals(slider.getValue(), "0");
	}
	
	@Test
	public void canSlideTo100() {
		// Arrange
		Slider slider = new Slider(super.getDriver());
		slider.navigate();
		
		// Act
		slider.setValue("100");
		
		// Assert
		assertEquals(slider.getValue(), "100");
	}
}
