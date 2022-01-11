package demoqa.tests;

import org.testng.annotations.Test;

import demoqa.pages.NestedIframes;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NestedIframestest extends TestBase {
	@Test
	public void canTestNestedIframes() throws InterruptedException {

		String expectedText = "Child Iframe";

		NestedIframes nf = new NestedIframes(this.getDriver()).navigate();

		String actualText = nf.getText();
		Assert.assertEquals(actualText, expectedText);

	}

	@BeforeMethod
	public void setUp() {
		super.setup();
	}

	@AfterMethod
	public void tearDown() {
		super.cleanup();
	}

}