package controlExtension;

import org.testng.annotations.Test;
import January5.TestBase;

public class LinksTest extends TestBase {

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
