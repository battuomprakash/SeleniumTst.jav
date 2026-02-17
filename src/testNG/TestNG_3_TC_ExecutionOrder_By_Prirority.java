package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNG_3_TC_ExecutionOrder_By_Prirority {
	static WebDriver driver;
	 @Test(priority = 0)
	  public void google() {
		  driver.get("https://www.google.com");
	  }
	  @Test (priority = 1)
	  public void facebook() {
		  driver.get("https://www.facebook.com");
	  }
	  @Test              // ekkada Priority use cheyaladu appudu alphabet order lona run avutundhi and prirority ista anitiki evali lekhapotha ledhu
                         // koni ichi remaining evakapotha clumsiness ayipothundhi
	  public void zomato() {
		  driver.get("https://www.zomato.com");
	  }
	  @Test (priority = 2)
	  public void swiggy() {
		  driver.get("https://www.swiggy.com");
	  }
	  @Test (priority = 3)
	  public void selenium() {
		  driver.get("https://www.selenium.dev");
	  }
	  @Test              // ekkada Priority use cheyaladu alphabet order lona run avutundhi and prirority ista anitiki evali lekhapotha ledhu
	                     // koni ichi remaining evakapotha clumsiness ayipothundhi
	  public void x() {
		  driver.get("https://www.x.com");
	  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
  @AfterTest
	public void afterTest() {
		 driver.quit();
	}


}
