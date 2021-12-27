import org.junit.Assert;
import org.junit.Test;

public class CarTests {

	@Test
	public void canBuildCar() {
		//arrange
		Car Corvette = new Car("Corvette");

		//act
		Corvette.start();

		//assert		
		Assert.assertNotNull(Corvette);
	}

	@Test
	public void carOdometerIncreasesWhenDriven() {
		//arrange
		Car Corvette = new Car("Corvette");

		//act
		Corvette.start();
		Corvette.drive(100);

		//assert		
		Assert.assertEquals(Corvette.getOdometer(), 100);
	}

	@Test
	public void aSmallCarHas4Cylinders() {
		//arrange
		Convertible Whisp = new Convertible("Whisp");

		//act
		int smallEngineCylinderCount = 4;
		Whisp.start();
		Whisp.drive(100);
		int whispCylinderCount = Whisp.getCylinderCount();

		//assert		
		Assert.assertEquals(whispCylinderCount, smallEngineCylinderCount);
	}

	@Test
	public void aLargeCarHas8Cylinders() {
		//arrange
		Car BeastMaster = new Car("BeastMaster");

		//act
		int distanceDriven = 100;
		int largeEngineCylinderCount = 8;
		BeastMaster.start();
		BeastMaster.drive(distanceDriven);

		int BeastMasterCylinderCount = BeastMaster.getCylinderCount();

		//assert		
		Assert.assertEquals(BeastMasterCylinderCount, largeEngineCylinderCount);
	}

	@Test
	public void canBuildConvertible() {
		//arrange
		Convertible Saturn = new Convertible("Saturn");

		//act
		Saturn.start();

		//assert		
		Assert.assertNotNull(Saturn);
	}
	
	@Test
	public void canRaiseRoof() {
		//arrange
		Convertible Saturn = new Convertible("Saturn");

		//act
		Saturn.start();
		boolean roofRaised = true;
		String up = Saturn.roofStatus(roofRaised);
		
		//assert		
		Assert.assertEquals("Roof is up", up);
	}
}
