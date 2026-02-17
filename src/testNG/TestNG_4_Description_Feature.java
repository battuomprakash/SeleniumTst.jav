package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class  TestNG_4_Description_Feature  {
	WebDriver driver;

	@Test(description = "Google")
	public void google()
	{
		driver.get("https://www.google.com");
	}

	@Test(description = "Facebook")
	public void facebook()
	{
		driver.get("https://www.facebook.com");
	}

	@Test(description = "Selenium")
	public void selenium()
	{
		driver.get("https://www.selenium.dev");
	}
	
	@Test(description = "Swiggy")
	public void swiggy()
	{
		driver.get("https://www.swiggy.com");
	}
	
	@Test(description = "Zomato")
	public void zomato()
	{
		driver.get("https://www.zomato.com");
	}
	
	@Test(description = "X")
	public void x()
	{
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
