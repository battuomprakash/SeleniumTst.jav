package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class  TestNG_7_InvocationCount  {
	WebDriver driver;
	 @Test(invocationCount = 5)
	  public void techlearnlogin() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin"); 
		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Charan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("Test@12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='rememberme']")).click();
	  }
	  
	  
	  @Test
	  public void hellowtealogin() throws InterruptedException {
		  	driver.get("https://www.hellowtea.com/admin"); 
			driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("saikrishna");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("Test@12345");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='rememberme']")).click();
	  }
	

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
