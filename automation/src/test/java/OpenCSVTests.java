import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.testng.annotations.Test;
import com.opencsv.CSVReader;

public class OpenCSVTests {

	final String BASSES = "src/test/resources/basses.csv";
	final String CONFIG = "src/test/resources/config.properties";

	public String ReadMe(String file) throws Exception {
		Reader text = Files.newBufferedReader(Paths.get(
				ClassLoader.getSystemResource(file).toURI()));
		return text.toString();
	}

	//  A. ensure that you can get the 'browserType' value from the config file

	@Test
	public void getBrowserTypeValueFromConfigFile() {

		// Arrange
		

		// Act
		try {
			System.out.println(ReadMe(CONFIG).contains("BrowserType"));
		} catch (Exception e) {
			e.printStackTrace();
		}

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
		int expectedCount = 6;
		
		

		// Act


		// Assert

	}
}
