package demoqa.tests;

import org.testng.annotations.Test;
import demoqa.pages.ModalPage;
import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.AfterMethod;

public class ModalTests extends TestBase{
  @Test
  public void canClickSmallModal() {
	  ModalPage page = new ModalPage(super.getDriver());
	  page.navigate();

	  page.clickSmallModel();

	  assertTrue(page.isSmallModalVisible());
  }
  @Test
  public void canClickLargeModal() {
	  ModalPage page = new ModalPage(super.getDriver());
	  page.navigate();

	  page.clickLargeModel();

	  assertTrue(page.isLargeModalVisisble());
  }
  @BeforeMethod
  public void beforeMethod() {
	  super.setup();
  }

  @AfterMethod
  public void afterMethod() {
	  super.cleanup();
  }
}
