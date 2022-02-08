package TestNG;

import org.testng.annotations.Test;
import framework.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CanClickObjectTest  extends TestBase{
	testNG test;
	
	@Test
	public void canClickObject() {

	}
	
	@BeforeTest
	public void beforeTest() {
		this.setup();
		test = new testNG(this.getDriver());
	}
	
	@AfterTest
	public void afterTest() {
		this.cleanup();
	}

}
