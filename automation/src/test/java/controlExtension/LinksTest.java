package controlExtension;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import January5.TestBase;

public class LinksTest extends TestBase {

	@BeforeTest
	public void beforeTest() {
		setup();
	}

	@AfterTest
	public void afterTest() {
		cleanup();
	}

	@Test
	public void canClickHome() {
		// Arrange
		Links link = new Links(super.getDriver());

		// Act
		link.click("simpleLink");

		// Assert
		//	Assert.assertTrue(link.click("simpleLink"));
	}
}
