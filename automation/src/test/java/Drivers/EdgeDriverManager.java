package Drivers;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager {
	public void createDriver() {
		Path resourceDirectory = Paths.get("src", "test", "resources");
		String absolutePath = resourceDirectory.toFile().getAbsolutePath();
		Path driverFile = Paths.get(absolutePath, "edgedriver.exe");

		System.setProperty("webdriver.edge.driver", driverFile.toFile().getAbsolutePath());

//		this.driver = new EdgeDriver();
//		this.driver.manage().window().maximize();

		long pageLoadTimeout = 60;
//		this.driver.manage().timeouts().implicitlyWait(pageLoadTimeout, TimeUnit.SECONDS);
	}
}
