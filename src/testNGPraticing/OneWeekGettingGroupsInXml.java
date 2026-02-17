package testNGPraticing;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class OneWeekGettingGroupsInXml {
	WebDriver driver;
	
	@Test(groups = "SearchEngine")
	public void google() {
		driver.get("https://www.google.com");
	}
	
	@Test(groups = "SearchEngine")
	public void edge() {
		driver.get("https://www.edge.com");
	}

	@Test(groups = "SocialMedia")
	public void facebook() {
		driver.get("https://www.facebook.com");
	}

	@Test(groups = "TestingTool")
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
	
	@Test(groups = "TestingTool")
	public void techlearn() {
		driver.get("https://www.techlearn.in");
	}

	@Test(groups = "FoodDelivery")
	public void swiggy() {
		driver.get("https://www.swiggy.com");
	}

	@Test(groups = "FoodDelivery")
	public void zomato() {
		driver.get("https://www.zomato.com");
	}

	@Test(groups = "Shopping")
	public void flipkart() {
		driver.get("https://www.flipkart.com");
	}

	@Test(groups = "Shopping")
	public void amazon() {
		driver.get("https://www.amazon.com");	
	}
	
	@Test(groups = {"Search", "ai"})
	public void grok() {
		driver.get("https://www.grok.com");
	}
	
	@Test(groups = {"Search", "ai"})
	public void ChatGPT() {
		driver.get("https://www.chatgpt.com");
	}
  @BeforeTest(groups = "ai")
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
