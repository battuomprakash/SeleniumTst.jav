package tab_switches;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SwitchToNewTabsandWindows  {
	WebDriver driver;
	
	// New Tabs
  @Test
  public void newtabs() throws InterruptedException {
	  driver.get("https://www.techlearn.in");
	  driver.findElement(By.xpath("//*[@id=\"mega-menu-item-12\"]/a")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"post-57\"]/div/div/div/div/div/div/section/div[3]/a")).click();
	  Thread.sleep(2000);
	  ArrayList<String> tab = new ArrayList<String> (driver.getWindowHandles());
	  driver.switchTo().window(tab.get(1));
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();
	  Thread.sleep(3000);
	  driver.switchTo().window(tab.get(0));
	  driver.findElement(By.xpath("//*[@id=\"mega-menu-item-16\"]/a")).click(); 
  }
  
  
  // New Window
      
      @Test
      public void NewWindow() throws InterruptedException {
	  driver.get("https://www.techlearn.in");
	  Thread.sleep(3000);
	  driver.switchTo().newWindow(WindowType.TAB);
//	  driver.switchTo().newWindow(WindowType.WINDOW);
//	  driver.navigate().to("https://www.google.com");
	  
  }
  
      // new tabs using sets
//      @Test
//          public void newtab() throws InterruptedException {
//    	  driver.get("https://www.techlearn.in/");
//    	  driver.findElement(By.xpath("//*[@id=\"mega-menu-item-12\"]/a")).click();
//    	  Thread.sleep(2000);
//    	  driver.findElement(By.xpath("//*[@id=\"post-57\"]/div/div/div/div/div/div/section/div[3]/a")).click();
//    	  Thread.sleep(2000);
//    	  Set<String> obj = driver.getWindowHandles();
//    	  Object s[] = obj.toArray();
//    	  driver.switchTo().window(s[1].toString());
//    	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();
//    	  Thread.sleep(2000);
//    	  driver.switchTo().window(s[0].toString());
//    	  driver.findElement(By.xpath("//*[@id=\"mega-menu-item-16\"]/a")).click();
//      }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
