import org.junit.Assert;
import org.junit.Test;

public class BicycleTest {

	// is there a better assert method to test this?
	@Test
	public void testGetOdometer() {
		// arrange
		Bicycle bike = new Bicycle();

		// act
		bike.drive(12);

		// assert
		Assert.assertEquals(bike.getOdometer(), 12);
	}

}
