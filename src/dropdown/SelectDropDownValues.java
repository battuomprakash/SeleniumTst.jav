package dropdown;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class SelectDropDownValues  {
	
	WebDriver driver;
	
  @Test
 public void selectvalues() throws InterruptedException {
	  driver.get("https://www.redmine.org/");
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"user_mail\"]")).sendKeys("Sumanth@gmail.com");
	  Thread.sleep(3000);
	  Select obj = new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
	  Thread.sleep(3000);
	  obj.selectByVisibleText("Albanian (Shqip)");
	  obj.selectByContainsVisibleText("Bulgarian");
	  obj.selectByValue("et");
	  obj.selectByIndex(11);
	 
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
