package testNGPraticing;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class OneWeekFR {
	WebDriver driver;
	
	
	@Test(description = "Google", timeOut = 3000)
	public void google() {
		driver.get("https://www.google.com");
	}

	@Test(description = "Facebook", timeOut = 3000)
	public void facebook() {
		driver.get("https://www.facebook.com");
	}

	@Test(description = "Selenium", timeOut = 3000)
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}

	@Test(description = "Swiggy", timeOut = 3000)
	public void swiggy() {
		driver.get("https://www.swiggy.com");
	}

	@Test(description = "Zomato")
	public void zomato() {
		driver.get("https://www.zomato.com");
	}

	@Test(description = "Flipkart")
	public void flipkart() {
		driver.get("https://www.flipkart.com");
	}

	@Test(description = "Amazon")
	public void amazon() {
		driver.get("https://www.amazon.com");
	}

	
//	@Test(description = "Techlearndepending",dependsOnMethods  = "techlearnmethod_2", invocationCount = 5)
//	public void techlearnmethod_1() throws InterruptedException {
//		driver.get("https://www.techlearn.in/admin");
//		driver.findElement(By.id("user_login")).sendKeys("Sumanth");
//		driver.findElement(By.name("pwd")).sendKeys("Kamdalur@123");
//		Thread.sleep(3000);
//		driver.findElement(By.id("rememberme")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.className("wp-login-lost-password")).click();	
//	}
// //      ignore pettina testcase run avuthundhi why? clarify?
//	
//	
//	@Test(description = "Techlearn")
//	public void techlearnmethod_2() {
//		driver.get("https://www.techlearn.in/admin");
//	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
