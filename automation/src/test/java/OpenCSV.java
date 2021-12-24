import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;

public class OpenCSV {
	Reader reader = new FileReader("src/test/resources/basses.csv");

	int data = reader.read();

	while(data != -1){
		char dataChar = (char) data;
		try {
			data = reader.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

	try {
		reader.close();
	} catch (IOException e2) {
		e2.printStackTrace();
	}

	OutputStream outputStream = null;
	try {
		outputStream = new BufferedOutputStream(new FileOutputStream("src/test/resources/basses.csv"));
	} catch (FileNotFoundException e1) {
		e1.printStackTrace();
	}
	try {
		outputStream.write(data);
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}