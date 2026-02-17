package testNGPraticing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SecondWeekFR {
	WebDriver driver;

	// testng loo aphlabetic order loo evaka poyina avi in bulit ga aphlabetic order loo na tesukuntundhi 
	
 /* @Test(description = "amazon", priority = 0)
  public void Amazon() {
	  driver.get("https://www.amazon.de/");
  }
  
  @Ignore
  @Test(description = "BYJ'S", priority = 2)
  public void Byj_s() {
	  driver.get("https://byjus.com/");
  }
  
  
  @Test(priority = 1)
  public void CapGemeini() {
	  driver.get("https://www.capgemini.com/");
  }
  
  @Test(priority = 4, timeOut = 3000)
  public void Flipkart() {
	  driver.get("https://www.flipkart.com/");
  }
  
  @Test(priority = 3)
  public void Google() {
	  driver.get("https://www.google.com/");
  }*/
  
//  @Test(dependsOnMethods = "Method2")
//  public void Method1() throws InterruptedException {
//	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Sumanth");
//	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Kamdalur");
//	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
//	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).click();
//	  
//  }
  
//  @Test(invocationCount = 5)
	@Test
  public void Method2() throws InterruptedException {
	  driver.get("https://www.techlearn.in/admin");
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Sumanth");
	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Kamdalur");
	  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).click();
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
//	  driver.close();
	  driver.quit();
  }

}
