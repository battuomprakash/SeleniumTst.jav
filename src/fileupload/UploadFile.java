package fileupload;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class UploadFile  {
	WebDriver driver;
  @Test
  public void attachfile() throws InterruptedException {
	  driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
	  driver.findElement(By.xpath("//*[@id=\"myFile\"]")).sendKeys("C:\\Users\\OM PRAKASH\\Documents\\om sing_1.jpg");
	  Thread.sleep(3000);
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
