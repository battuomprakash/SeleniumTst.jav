package testNGPraticing;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ThirdWeekextraforXML {
	WebDriver driver;
  @Test
  public void google() throws InterruptedException {
	  driver.get("https://www.google.com");
	  Thread.sleep(3000);
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
