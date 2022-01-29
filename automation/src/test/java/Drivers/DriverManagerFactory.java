package Drivers;

//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class DriverManagerFactory {

	public static DriverManager getManager(String browserType) {

		if (browserType.equals("chrome")) {
			return new ChromeDriverManager();		
		} else if (browserType.equals("msedge")) {
			return new EdgeDriverManager();
		} else {
			throw new RuntimeException(browserType + " is not supported.");
		}	
	}
}
