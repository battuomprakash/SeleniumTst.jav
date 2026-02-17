package testNGPraticing;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class ThirdWeekFR {
	WebDriver driver;
  @Test(enabled = false)
  public void google() {
	  driver.get("https://www.google.com");
  }
  
  @Ignore
  @Test
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  
//  @Test(description = "Twitter", priority = 1)
//  public void twitter() {
//	  driver.get("https://www.x.com");
//  }
//  
//  @Test(timeOut = 3000, priority = 2)
//  public void flipkart() {
//	  driver.get("https://www.flipkart.com");
//  }
//  
//  @Test(priority = 0)
//  public void amazon() {
//	  driver.get("https://www.amazon.com");
//  }
//  
//  @Test(priority = 3)
//  public void swiggy() {
//	  driver.get("https://www.swiggy.com");
//  }
//  @Test(priority = 4)
//  public void selenium() {
//	  driver.get("https://www.selenium.dev");
//  }
//  
//  @Test(priority = 5)
//  public void zomato() {
//	  driver.get("https://www.zomato.com");
//  }
  
  @Test(dependsOnMethods = "method2", invocationCount = 3)
  public void method1() throws InterruptedException
  {
		
		driver.findElement(By.id("user_login")).sendKeys("hello");
		driver.findElement(By.name("pwd")).sendKeys("world");
		driver.findElement(By.id("rememberme")).click();
		driver.navigate().refresh();
  }
  
  @Test
  public void method2() {
	  driver.get("https://www.techlearn.in/admin");
		driver.manage().window().maximize();
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
