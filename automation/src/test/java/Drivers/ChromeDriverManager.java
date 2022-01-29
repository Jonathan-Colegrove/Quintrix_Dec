package Drivers;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ChromeDriverManager extends DriverManager {
	public void createDriver() {
		Path resourceDirectory = Paths.get("src", "test", "resources");
		String absolutePath = resourceDirectory.toFile().getAbsolutePath();
		Path driverFile = Paths.get(absolutePath, "chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", driverFile.toFile().getAbsolutePath());

//		this.driver = new ChromeDriver();
//		this.driver.manage().window().maximize();

//		long pageLoadTimeout = 60;
//		this.driver.manage().timeouts().implicitlyWait(pageLoadTimeout, TimeUnit.SECONDS);
	}
}
