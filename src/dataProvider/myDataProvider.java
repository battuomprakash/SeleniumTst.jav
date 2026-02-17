package dataProvider;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class myDataProvider {
	WebDriver driver;
	
@DataProvider(name = "loginDetails")	
public String[][] loginCreditinal() {
	return new String[][] {
		{"admin","admin123"},
		 {"user1", "pass1"},
	        {"user2", "pass2"},
		 {"user3", "pass3"},
		 {"user4", "pass4"}
		
	};	
}
	
	
  @Test(dataProvider = "loginDetails")
  public void login(String usr, String pwd) {  
	  try
	  {
	  driver.get("https://www.techlearn.in/admin");
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys(usr);
      driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys(pwd);
      driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
	  System.out.println("Test case is pass");
	  }
	  catch(Exception e)
	  {
		  System.out.println("Test case is fail");
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
