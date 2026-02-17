package testNGPraticing;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SecoudWeekxmlTwoClassGettingData {
	WebDriver driver;
	
	@Test(groups = "Shopping")
	  public void Amazon() {
		  driver.get("https://www.amazon.de/");
	  }
	  
	  @Test(groups = "IT")
	  public void CapGemeini() {
		  driver.get("https://www.capgemini.com/");
	  }
	  
	  @Test(groups = "IT")
	  public void Tcs() {
		  driver.get("https://www.tcs.com/careers");
	  }
	  
	  @Test(groups = "Shooping")
	  public void Flipkart() {
		  driver.get("https://www.flipkart.com/");
	  }
	  
	  @Test(groups = "Socialmedia")
	  public void Facebook() {
		  driver.get("https://www.facebook.com/");
	  }
	  
	  @Test(groups = "Socialmedia")
	  public void Twitter() {
		  driver.get("https://www.x.com/");
	  }
	
	
//	@Test
//	  public void Flipkart() {
//		  driver.get("https://www.flipkart.com/");
//	  }
	
  @BeforeTest(groups = "Socialmedia")
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
