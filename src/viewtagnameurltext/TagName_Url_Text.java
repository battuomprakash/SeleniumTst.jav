package viewtagnameurltext;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class TagName_Url_Text {
	WebDriver driver;
	
  @Ignore	
  @Test
  public void TagName() throws InterruptedException {
	  driver.get("https://www.google.com/");
	  String expTag = "Google";
	  Thread.sleep(3000);
	  System.out.println("Expected TagName is "+expTag);
	  String actTag = driver.getTitle();
	  Thread.sleep(3000);
	  System.out.println("Actual TagName is "+actTag);	  
  }
  
  @Ignore
  @Test
  public void CurrentUrl() throws InterruptedException {
	  driver.get("https://www.techlearn.in/admin");
	  String expUrl = "https://www.techlearn.in/wp-login.php?redirect_to=https%3A%2F%2Fwww.techlearn.in%2Fwp-admin%2F&reauth=1";
	  System.out.println("Expected Url "+expUrl);
	  String actUrl = driver.getCurrentUrl();
	  System.out.println("Actual Url"+actUrl);
	  
	  Assert.assertEquals(actUrl, expUrl);
  }
  @Test
  public void gettingText() throws InterruptedException {
	  driver.get("https://www.google.com");
//	  String expText = "About";
//	  System.out.println("Expected Text is "+expText);
//	  String actText = driver.findElement(By.xpath("/html/body/div[2]/div[2]/a[1]")).getText();
//	  System.out.println("Actual Text is "+actText);
//	  Assert.assertEquals(actText, expText);
	  
	  String expText = "S0tore";
	  String actText = driver.findElement(By.xpath("/html/body/div[2]/div[2]/a[2]")).getText();
	  
	  Assert.assertEquals(actText, expText);
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
