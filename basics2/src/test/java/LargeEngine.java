public class LargeEngine implements IEngine {

	// does this work?
	public int cylinderCount = 8;
	
	public void Start() {
		System.out.println("Engine Started");
	}

	public int getCylinderCount() {
		return cylinderCount;
	}
}
