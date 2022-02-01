package selectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class selectors {
	
	WebDriver driver = new ChromeDriver();

	@FindBy(how=How.ID, using="userName")
	private WebElement TextBox;
	
	@FindBy(how=How.CLASS_NAME, using="btn btn-primary")
	private WebElement Button;
	
	// CSS:  footer > span
	@FindBy(how=How.XPATH, using="Footer/Span")
	private WebElement FooterSpan;
	
	@FindBy(how=How.CSS, using="#nav > li")
	private WebElement List;
	
	@FindBy(how=How.CSS, using="#oldSelectMenu > option[value='4']")
	private WebElement Radio;
	
	// JAVASCRIPT to get element with ID "sliderValue":    document.getElementById("sliderValue");
	@FindBy(how=How.ID, using="sliderValue")
	private WebElement Slider;
	
	// JAVASCRIPT to set element with ID "userName" to DennisTaylor:	document.getElementById("userName").value = "DennisTaylor";
	@FindBy(how=How.ID, using="userName")
	private WebElement userName;
}
