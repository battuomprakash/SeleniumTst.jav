package datadrivenframework;

import org.testng.annotations.Test;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DataDrivenProgram  {
	WebDriver driver;
  @Test
  public void techlearnLogin() throws InterruptedException, IOException, JXLException {
	  driver.get("https:www.techlearn.in/admin");
	  Thread.sleep(3000);
	  
	  FileInputStream fi = new FileInputStream("C:\\Users\\OM PRAKASH\\Documents\\Lib\\frameworkSheet\\TestLogin.xls");
	  Workbook w = Workbook.getWorkbook(fi);
	  Sheet s = w.getSheet("Sheet1");
	  
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys(s.getCell(0,1).getContents());
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys(s.getCell(1,1).getContents());
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
