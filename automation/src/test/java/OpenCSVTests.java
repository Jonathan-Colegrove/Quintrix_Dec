import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OpenCSVTests {
  @Test
  public void canPrintSomething() {
	  String userName = "Jonathan";
	  String password = "awesome1";
	  System.out.println(userName + ", " + password);
  }
  
  @DataProvider(name = "credentialsProvider")
  public Object[] getData() {
  	Object[] data = new Object[2];
  	data[0] = "dennis";
  	data[1] = "awesome1";

  	return data;
  }
}
