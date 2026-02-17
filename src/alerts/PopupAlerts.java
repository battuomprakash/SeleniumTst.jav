package alerts;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PopupAlerts  {
	WebDriver driver;
	
  @Test
  public void alertokbutton() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
	  driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();
	  
  }
  
  @Test
  public void alertcancelbutton() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
	  driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
	  Thread.sleep(3000);
	  driver.switchTo().alert().dismiss();
  }
  
  @Test
  public void alertsendtextokcancelbutton() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
	  driver.findElement(By.xpath("//*[@id=\"post-748\"]/div/div/div/div/div/div/div/button")).click();
	  
	  Alert a = driver.switchTo().alert();
			 a.sendKeys("Sumanth");
			 a.accept();
//			 a.dismiss();
	  
	// we can use both but above style is mostly used and code and below one we have mention everything scartch
			 
//	  driver.switchTo().alert().sendKeys("Sumanth");
//	  Thread.sleep(3000);
//	  driver.switchTo().alert().accept();
//	  Thread.sleep(3000);
//	  driver.switchTo().alert().dismiss();
  }
  
  @Test
  public void noalertbutton() throws InterruptedException {
	  driver.get("https://www.techlearn.in");
	  driver.switchTo().alert().accept();  // we get exception like NoAlertPresentException
  }
  
  @Test
  public void robo() throws InterruptedException {
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("techlearn.in");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  
  } 
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
