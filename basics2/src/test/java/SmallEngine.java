public class SmallEngine implements IEngine {

	// does this work?
	public int cylinderCount = 4;
	
	public void Start() {
		System.out.println("Engine Started");
	}

	public int getCylinderCount() {
		return cylinderCount;
	}
}
