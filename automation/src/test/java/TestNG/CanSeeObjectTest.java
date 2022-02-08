package TestNG;

import org.testng.annotations.Test;
import framework.TestBase;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class CanSeeObjectTest  extends TestBase{
	testNG test;
	
	@Test
	public void canSeeObject() {

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

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Starting Can See Object Test");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Starting Can Click Object Test");
	}

}
