package dataProvider;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class singlearraydataprovider {
	WebDriver driver;
	
	@DataProvider(name = "googletaskbarinput")
	public Object[][] contentSearching() {
		return new Object[][] {
				{"kaveri"},
				{"S400"},
				{"Sukhohi"},
				{"Mig29"},
				{"Tejas"}
		};		
	}
	
  @Test(dataProvider = "googletaskbarinput")
  public void search(String values) {
	  try {
		  driver.get("https://www.google.com");
		  driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(values);
		  driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);
		  System.out.println("Test case is pass");
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
		 System.out.println("Test case is fail"); 
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
