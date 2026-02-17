package testNG;

import org.testng.annotations.Test;
import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_2_TC_Skip_Ignore_Disabled {
	static WebDriver driver;
	 @Test(enabled = false)
	  public void Google() {
		  driver.get("https://www.google.com");
	  }
	  @Test(enabled = false)
	  public void facebook() {
		  driver.get("https://www.facebook.com");
	  }
	  @Ignore                     // mostly used ignore only
	  @Test
	  public void zomato() {
		  driver.get("https://www.zomato.com");
	  }
	  @Test(enabled = true)       // edhni ichna ivaka poyina method run avutundhi      
	  public void swiggy() {
		  driver.get("https://www.swiggy.com");
	  }
	  @Test
	  public void selenium() {
		  driver.get("https://www.selenium.dev");
	  }
	  @Test
	  public void x() {
		  driver.get("https://www.x.com");
	  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
  }

}
