package crossBroswerTesting;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Cross_Browser_Test {
	WebDriver driver;
	
	@Parameters("Browser")
	@BeforeTest
	  public void launchBrowser(String browser) {
         if(browser.equalsIgnoreCase("ChromeDriver"))
         {
        	 driver = new ChromeDriver();
        	 driver.manage().window().maximize();
         }
         
         else if(browser.equalsIgnoreCase("Firefox"))
         {
        	 driver = new FirefoxDriver();
         }
         
         else if(browser.equalsIgnoreCase("Edge"))
         {
        	 driver = new EdgeDriver();
        	 driver.manage().window().maximize();
         }
	  }
  @Test
  public void loginTechlearn() {
	  driver.get("https://www.techlearn.in/admin");
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Doind_Nothing");
      driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Buildup_Denging");
      driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
  }
}
