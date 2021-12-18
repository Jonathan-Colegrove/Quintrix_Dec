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
			Whisp.start();
			Whisp.drive(100);
			int whispCylinderCount = Whisp.getCylinderCount();
			
			//assert		
			Assert.assertEquals(whispCylinderCount, 4);
		}
		
		@Test
		public void aLargeCarHas8Cylinders() {
			//arrange
			Car BeastMaster = new Car("BeastMaster");
			
			//act
			BeastMaster.start();
			BeastMaster.drive(100);
			
			int BeastMasterCylinderCount = BeastMaster.getCylinderCount();
			
			//assert		
			Assert.assertEquals(BeastMasterCylinderCount, 8);
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
}
