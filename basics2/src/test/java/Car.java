public class Car {
	
	private int odometer;
	public String model;
	public IEngine engine = new LargeEngine();
	
	public Car(String model) {
		engine = new LargeEngine();
	}
	
	public void drive(int distance) {
	}
	
	public void start() {
	}

	public int getOdometer() {
		return odometer;
	}

}
