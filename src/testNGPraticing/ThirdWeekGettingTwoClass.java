package testNGPraticing;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class ThirdWeekGettingTwoClass {
	WebDriver driver;
	  @Test(groups = "IT")
	  public void google() {
		  driver.get("https://www.google.com");
	  }
	  
	  @Test(groups = "SocialMedia")
	  public void facebook() {
		  driver.get("https://www.facebook.com");
	  }
	  
	  @Test(groups = "SocialMedia")
	  public void twitter() {
		  driver.get("https://www.x.com");
	  }
	  
	  @Test(groups = "Shooping")
	  public void flipkart() {
		  driver.get("https://www.flipkart.com");
	  }
	  
	  @Test(groups = "Shooping")
	  public void amazon() {
		  driver.get("https://www.amazon.com");
	  }
	  
	  @Test(groups = "Food")
	  public void swiggy() {
		  driver.get("https://www.swiggy.com");
	  }
	  @Test(groups = "IT")
	  public void selenium() {
		  driver.get("https://www.selenium.dev");
	  }
	  
	  @Test(groups = "Food")
	  public void zomato() {
		  driver.get("https://www.zomato.com");
	  }
  @BeforeTest(groups = "SocialMedia")
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
