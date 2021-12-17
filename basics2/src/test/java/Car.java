public class Car extends Vehicle {
	
	private int odometer;
	public String model;
	public IEngine engine = new LargeEngine();
	
	public Car(String model) {
		engine = new LargeEngine();
	}
	
	// ok?
	public void drive(int distance) {
		this.odometer += distance;
	}
	
	public void start() {
	}

	public int getOdometer() {
		return odometer;
	}

}
