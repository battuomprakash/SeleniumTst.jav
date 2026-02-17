package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_1_TC_ExecutionOrder_By_Alphabatical {
	static WebDriver driver;
  @Test
  public void Google() {
	  driver.get("https://www.google.com");
  }
  @Test
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  @Test
  public void zomato() {
	  driver.get("https://www.zomato.com");
  }
  @Test
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

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
