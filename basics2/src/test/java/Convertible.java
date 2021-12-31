
public class Convertible extends Car {

	boolean roofRaised = false;
	
	public Convertible(String model) {
		super(model);
		engine = new SmallEngine();
	}
	
	public int getCylinderCount() {
		return 4;
	}
	
	public String roofStatus(boolean roofRaised) {
		String roofStatus;
		if (roofRaised = true) {
			roofStatus = "Roof is up";
		} else {
			roofStatus = "Roof is down";
			}
		return roofStatus;
	}
	
}
