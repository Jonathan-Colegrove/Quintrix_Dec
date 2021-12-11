package quintrix.training.com;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.sun.tools.javac.util.Assert;

class CarTests {
	
	@Test
	public void canBuildCar() {
		//arrange
		Car Corvette = new Car("Corvette");
		
		//act
		Corvette.start();
		
		//assert
		AssertJUnit.assertEquals(Corvette.start(), "Engine Started");
	}
	
	@Test
	public void isCarStarted() {
		//arrange
		Car Corvette = new Car("Corvette");
		
		//act
		Corvette.start();
		
		//assert
		Assert.assertEquals(Corvette.start(), "Engine Started");
	}

}
