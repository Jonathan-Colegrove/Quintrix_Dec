import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;

public class OpenCSV {
	public static void main(String args[])throws IOException {
		//	InputStream input = new FileInputStream("src/test/resources/basses.csv");
		Reader reader = new FileReader("src/test/resources/basses.csv");

		int data = reader.read();{

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
		}
	}
}