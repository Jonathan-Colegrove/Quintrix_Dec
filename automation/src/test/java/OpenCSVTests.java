//import static org.testng.Assert.assertNotNull;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;

import org.testng.Assert;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OpenCSVTests { 

//  tests I'm adding now
//  A. ensure that you can get the 'browserType' value from the config file
  
  @Test
  public void getBrowserTypeValueFromConfigFile() {
	  
	//	Arrange
//	  * make file reader object
	  
	  Reader reader = null;
	try {
		reader = new FileReader("src/test/resources/config.properties");
	} catch (FileNotFoundException e1) {
		e1.printStackTrace();
	}

		int data = 0;
		try {
			data = reader.read();
		} catch (IOException e1) {
			e1.printStackTrace();
		}{

			while(data != -1){
				try {
					data = reader.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			try {
				reader.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	 
	//	Act
//	  * find by ID, etc
//		String found = reading.read(#LC2 > span.innerHtml);
//		<td id="LC2" class="blob-code blob-code-inner js-file-line"><span class="pl-k">BrowserType</span>=chrome</td>
	
		//	Assert
//		Assert.assertEquals(found, "BrowserType");
  }
  
//  B. Write a test which reads the basses.csv file into a HashMap of Makes & Models. Ignore string count.
  
  @Test
  public void canReadBassesFileIntoHashmapOfMakesAndModelsIgnoringStringCount() {
		//	Arrange
//	  		* make file reader object
	  		
	  		Reader reader = null;
			try {
				reader = new FileReader("src/test/resources/basses.csv");
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}

			int data = 0;
			try {
				data = reader.read();
			} catch (IOException e1) {
				e1.printStackTrace();
			}{

				while(data != -1){
					try {
						data = reader.read();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

				try {
					reader.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		//	Act
//			  * read into Hashmap of Makes & Models, ignore string count
		//	Assert
//			  Assert.assertEquals(0, 0)
  }
  
//  C. Hydrate an object with CSV file data
//  reads the basses.csv file into a Basses Object
  
  @Test
  public void readsBassesFileIntoBassesObject() {
		//	Arrange
	  
	  Reader reader = null;
	try {
		reader = new FileReader("src/test/resources/config.properties");
	} catch (FileNotFoundException e3) {
		e3.printStackTrace();
	}

		int data = 0;
		try {
			data = reader.read();
		} catch (IOException e3) {
			e3.printStackTrace();
		}{

			while(data != -1){
				try {
					data = reader.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			try {
				reader.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	  
	  
	  
		//	Act
//		  read basses.csv into Basses object
//	  * make file writer object
	  
	  OutputStream outputStream = null;
		try {
			outputStream = new BufferedOutputStream(new FileOutputStream("src/test/resources/OutputTest.csv"));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			outputStream.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				outputStream.flush();
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		//	Assert
//	  assert not null?  assert Basses object written?
		Assert.assertNotNull(outputStream);
  }
}
