package screenshots;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ErrorPageLineScreenshot {
	WebDriver driver;
	
	public void getScreenshot() throws IOException {
//		SimpleDateFormat dateformate = new SimpleDateFormat("yyyy_mm_dd_hh_mm_ss");
//		Date date = new Date();
//		String time = dateformate.format(date);
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\OM PRAKASH\\Documents\\Lib\\screenshots\\ErrorElement.png"));
	}
	
  @Test
  public void Techlearn() throws InterruptedException, IOException {
	  
	  try {
	  driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Charan");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("Test@12345");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"user_login\\\"]")).sendKeys("hello");
		Thread.sleep(3000);
	  }
	  catch(Exception e)
	  {
		  getScreenshot();
		  System.out.println("Error occurred"+ e);
	  }
	}
	  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}

