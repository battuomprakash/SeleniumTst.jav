package screenshots;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SelectedWebElementScreenshot {
	WebDriver driver;
  @Test
  public void Selected() throws IOException {
	  driver.get("https://www.techlearn.in/admin");
//	 WebElement userid = driver.findElement(By.xpath("//*[@id=\"user_login\"]"));
//	 userid.sendKeys("hello");
//	 WebElement pwd = driver.findElement(By.xpath("//*[@id=\"user_pass\"]")); 
//	 pwd.sendKeys("mokmo");
	 
	  WebElement lyp = driver.findElement(By.xpath("//*[@id=\"login\"]/h1/a"));
	  
	  File f = lyp.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f, new File("C:\\Users\\OM PRAKASH\\Documents\\Lib\\screenshots\\logo.png"));
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
