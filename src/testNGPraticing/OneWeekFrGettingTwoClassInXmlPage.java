package testNGPraticing;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class OneWeekFrGettingTwoClassInXmlPage {
	WebDriver driver;
	@Test
	void google() {
		driver.get("https://www.google.com");
		
	}
	@Test
	void olx() {
		driver.get("https://www.olx.com");
		
	}
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
