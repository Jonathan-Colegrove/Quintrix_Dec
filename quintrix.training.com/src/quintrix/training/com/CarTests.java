package quintrix.training.com;

import org.junit.Assert;
import org.junit.Test;

class CarTests {
	
	@Test
	public void canBuildCar() {
		//arrange
		Car Corvette = new Car("Corvette");
		
		//act
		Corvette.start();
		
		//assert		
		Assert.assertNotNull(Corvette);
	}
}
