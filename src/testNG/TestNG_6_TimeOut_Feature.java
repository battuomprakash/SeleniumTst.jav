package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class  TestNG_6_TimeOut_Feature  {
	WebDriver driver;

	@Test(description = "Google", timeOut = 4000)
	public void google()
	{
		driver.get("https://www.google.com");
	}

	@Test(description = "Facebook", timeOut = 4000)
	public void facebook()
	{
		driver.get("https://www.facebook.com");
	}

	@Test(description = "Selenium", timeOut = 4000)
	public void selenium()
	{
		driver.get("https://www.selenium.dev");
	}
	
	@Test(description = "Swiggy", timeOut = 4000)
	public void swiggy()
	{
		driver.get("https://www.swiggy.com");
	}
	
	@Test(description = "Zomato", timeOut = 4000)
	public void zomato()
	{
		driver.get("https://www.zomato.com");
	}
	
	@Test(description = "X", timeOut = 3000)  ///doubt
	public void x()
	{
		driver.get("https://www.x.com");
	}


	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	
}
