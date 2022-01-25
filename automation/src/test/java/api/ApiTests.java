package api;

import org.testng.annotations.Test;
import demoqa.tests.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
//import io.restassured.RestAssured.*;
//import io.restassured.matcher.RestAssuredMatchers.*;
//import org.hamcrest.Matchers.*;
//import io.restassured.module.jsv.JsonSchemaValidator.*;

public class ApiTests  extends TestBase {
	@Test
	public void canGetSingleUser() {
		//Arrange

		//Act

		//Assert
//		Assert.assertEquals(account.getId(), 2);
//		Assert.assertEquals(account.getEmail(), "janet.weaver@reqres.in");
//		Assert.assertEquals(account.getFirst_name(), "Janet");
//		Assert.assertEquals(account.getLast_name(), "Weaver");
//		Assert.assertEquals(account.getAvatar(), "https://reqres.in/img/faces/2-image.jpg");

	}

	@Test
	public void canLogin() {
		//Arrange

		//Act

		//Assert

	}

	@Test
	public void canGet204Response() {
//		The HTTP 204 No Content success status response code indicates that a request has succeeded,
//		but the client doesn't need to navigate away from its current page.
		
		//Arrange
		
		//Act

		//Assert

//		when().
//			delete("/api/users/2");
//		then().
//			statusCode(204);
	}

	@Test
	public void canUpdateWithPatch() {
		//Arrange

		//Act

		//Assert

	}

	@Test
	public void canUpdateWithPut() {
		//Arrange

		//Act

		//Assert

	}

	@Test
	public void canDeserializeSingleUser() {
		//Arrange

		//Act

		//Assert

	}

	@Test
	public void canSerializeManyUsers() {
		//Arrange

		//Act

		//Assert

	}

	@BeforeTest
	public void beforeTest() {
		setup();
	}

	@AfterTest
	public void afterTest() {
		cleanup();
	}
}
