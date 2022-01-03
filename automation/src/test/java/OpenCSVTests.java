import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.testng.annotations.Test;
import com.opencsv.CSVReader;

public class OpenCSVTests {

	final String SOURCE = "src/test/resources/config.properties";

	public String ReadMe() throws Exception {
		Reader text = Files.newBufferedReader(Paths.get(
				ClassLoader.getSystemResource(SOURCE).toURI()));
		return text.toString();
	}

	//  A. ensure that you can get the 'browserType' value from the config file

	@Test
	public void getBrowserTypeValueFromConfigFile() {

		// Arrange
		try {
			System.out.println(ReadMe().contains("BrowserType"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Act


		// Assert


	}	






	//  B. Write a test which reads the basses.csv file into a HashMap of Makes & Models. Ignore string count.

	@Test
	public void canReadBassesFileIntoHashmapOfMakesAndModelsIgnoringStringCount() {

		// Arrange


		// Act


		// Assert

	}



	//  C. Hydrate an object with CSV file data
	//  reads the basses.csv file into a Basses Object

	@Test
	public void readsBassesFileIntoBassesObject() {
		// Arrange


		// Act


		// Assert

	}
}
