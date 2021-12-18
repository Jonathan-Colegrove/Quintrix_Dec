
public class Convertible extends Car {

	boolean roofRaised = false;
	
	public Convertible(String model) {
		super(model);
		engine = new SmallEngine();
	}
	
	public int getCylinderCount() {
		return 4;
	}
	
//	public String roofStatus() {
//		roofRaised == true ? "Roof is up" : "Roof is down";
//	}
}
