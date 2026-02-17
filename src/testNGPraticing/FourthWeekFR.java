package testNGPraticing;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class FourthWeekFR {
	WebDriver driver;
	
  @Ignore
  @Test
  public void techlearn() throws InterruptedException {
	  driver.get("https://www.techlearn.in/admin");
//	  driver.get("https://www.flipkart.com");
//	  Thread.sleep(2000);
//	  driver.navigate().to("https://www.facebook.com");
//	  driver.navigate().back();
//	  Thread.sleep(2000);
//	  driver.navigate().forward();
//	  Thread.sleep(2000);
//	  driver.navigate().refresh();
	  
	  driver.findElement(By.id("user_login")).sendKeys("hello");
	  driver.findElement(By.name("pwd")).sendKeys("world");
	  driver.findElement(By.name("rememberme")).click();
//	  driver.findElement(By.partialLinkText("← Go to Techlearn.in")).click();
//	  driver.navigate().back();
//	  driver.findElement(By.linkText("Lost your password?")).click();
//	  driver.findElement(By.className("input")).sendKeys("forget_password");
	  //-- css selector id
//	   driver.findElement(By.cssSelector("#user_login")).sendKeys("hello");
//	   driver.findElement(By.cssSelector("input#user_pass")).sendKeys("world");
	   // className
//	   driver.findElement(By.cssSelector(".input")).sendKeys("hello");
//	   driver.findElement(By.cssSelector("input.input")).sendKeys("hello");
	  //x_path
//	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("hello"); // relative xpath
//	  driver.findElement(By.xpath("/html/body/div[1]/form/div/div/input")).sendKeys("world"); //absolute xpath
	  
//	  List<WebElement> link = driver.findElements(By.tagName("a"));
//	  System.out.println("no of link is "+link.size());
//	  
//	  List<WebElement> img = driver.findElements(By.tagName("img"));
//	  System.out.println("no of images is "+img.size());
	  
  }
  
//  @Test(description = "SCM", priority =2)
//  public void facebook() {
//	  driver.get("https://www.facebook.com");
//  }
//  
//  @Test(description = "SCM", priority = 0)
//  public void x() {
//	  driver.get("https://www.x.com");
//  }
//  
//  @Test(priority = 1)
//  public void zomato() {
//	  driver.get("https://www.zomato.com");
//  }
//  
//  @Test(priority = 3)
//  public void swiggy() {
//	  driver.get("https://www.swiggy.com");
//  }
//  
//  @Test(priority = 4)
//  public void selenium() {
//	  driver.get("https://www.selenium.dev");
//  }
//  
//  @Test(priority = 5, timeOut = 3500)
//  public void byjus() {
//	  driver.get("https://byjus.com/");
//  }
  
//  @Test(dependsOnMethods = "method2", invocationCount = 5, groups = "M")
//  public void method1() {
//	  driver.findElement(By.id("user_login")).sendKeys("hello");
//	  driver.findElement(By.name("pwd")).sendKeys("world");
//	  driver.findElement(By.name("rememberme")).click();
//	  driver.navigate().refresh();
//	 
//  }
//  
//  @Test(groups = "M")
//  public void method2() {
//	  driver.get("https://www.techlearn.in/admin");
//  }
       // Alerts
  
//  @Test
//public void Alerts() throws InterruptedException {
//	  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
//	  driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
//	  driver.switchTo().alert().accept();
//	  driver.switchTo().alert().dismiss();
	  
	  
//      driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
//      driver.findElement(By.xpath("//*[@id=\"post-748\"]/div/div/div/div/div/div/div/button")).click();
//      Thread.sleep(3000);
//	  Alert a = driver.switchTo().alert();
//	  a.sendKeys("Hello");
//	  a.accept();
//	  a.dismiss();
	  
//}
  
//  @Test
//  public void dropdown() {
//	  driver.get("https://www.redmine.org/");
//	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
//	  driver.findElement(By.xpath("//*[@id=\"user_mail\"]")).sendKeys("Sumanth@gmail.com");
//	  Select obj = new Select((driver.findElement(By.xpath("//*[@id=\"user_language\"]"))));
//	  obj.selectByContainsVisibleText("Estonian ");
//	  obj.selectByIndex(11);
//	  obj.selectByValue("fa");
//	  obj.selectByVisibleText("Russian (Русский)"); 
//  }

  //keyword-functions
//  @Test
//  public void keyboard_function() {
//	  driver.get("https://www.techlearn.in");
//	  Actions a = new Actions(driver);
//	 a.contextClick(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-17\"]/a"))).build().perform();
//	 driver.get("https://www.techlearn.in/code/double-tap/");
//	 a.doubleClick(driver.findElement(By.xpath("//*[@id=\"post-3320\"]/div/div/div/div/div/div/button"))).build().perform();
//	 a.moveToElement(driver.findElement(By.xpath("//*[@id=\"post-3320\"]/div/div/div/div/div/div/button"))).doubleClick().build().perform();
//	 driver.switchTo().alert().accept();
//	  a.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-14\"]/a"))).build().perform();
//	  a.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-45\"]/a"))).click().build().perform();
//	  driver.get("https://www.techlearn.in/code/drag-and-drop/");
//	  WebElement source = driver.findElement(By.xpath("//*[@id=\"drag1\"]"));
//	  WebElement target = driver.findElement(By.xpath("//*[@id=\"div1\"]"));
//	  a.dragAndDrop(source, target).build().perform();
//	  driver.get("https://www.techlearn.in/admin");
//	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys(Keys.TAB);
//	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys(Keys.ENTER);	  
//  }
	  
//	@Test
//	public void tturltext() {
//	    
//		driver.get("https://www.google.com");
//		String exttittle = "Google";
//		String acttitle = driver.getTitle();
//		
//		Assert.assertEquals(acttitle, exttittle);
//		
//		String exturl = "https://www.google.com/";
//		System.out.println("Expected is "+exturl);
//		String acturl = driver.getCurrentUrl();
//		System.out.println("Actual is "+acturl);
//		
//		Assert.assertEquals(acturl, exturl);
//		
//		
//		String exttext= "Store";
//		System.out.println("Expected is "+exttext);
//		String actext = driver.findElement(By.xpath("/html/body/div[2]/div[2]/a[2]")).getText();
//		System.out.println("Actual is "+actext);
//		Assert.assertEquals(actext, exttext);
//		
//	}
  
//  @Test
//  public void isDis_isEna_isSel() {
//	  driver.get("https://www.techlearn.in/admin");
//	  Boolean isdis = driver.findElement(By.xpath("//*[@id=\"loginform\"]/p[1]/label")).isDisplayed();
//	  if(isdis==true)
//	  {
//		  System.out.println("username");
//	  }
//	  else {
//		  System.out.println("is not displayed");
//	  }
	  
//	  Boolean isena = driver.findElement(By.xpath("//*[@id=\"user_login\"]")).isEnabled();
//	  if(isena==true)
//	  {
//		  System.out.println("Enter username");
//	  }
//	  else {
//		  System.out.println("not Entering username");
//	  }
//	  
//	  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
//	  Boolean issel = driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).isSelected();
//	  if(issel==true)
//	  {
//		  System.out.println("Remeberme_Clicked");
//	  }
//	  else {
//		  System.out.println("Remeberme_Clicked_not_Clicked");
//	  }
//  }
  
//      @Test
//      public void Frames() {
//    	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
    	  
//    	  WebElement element = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
//    	  driver.switchTo().frame(element);
//    	  driver.findElement(By.xpath("/html/body/button")).click();
//    	  driver.switchTo().alert().accept();
    	  
//    	  driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"iframeResult\"]")));
//    	  driver.findElement(By.xpath("/html/body/button")).click();
//    	  driver.switchTo().alert().accept();
    	  
//    	  driver.switchTo().frame("iframeResult");
//    	  driver.findElement(By.xpath("/html/body/button")).click();
//    	  driver.switchTo().alert().accept();
    	  
//    	  driver.switchTo().frame("iframeResult");
//    	  driver.findElement(By.xpath("/html/body/button")).click();
//    	  driver.switchTo().alert().accept();
//    	  driver.switchTo().defaultContent();
//    	  driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
//      }
  
//  @Test
//  public void pageScroll() throws InterruptedException
//  {
//	driver.get("https://www.selenium.dev/");
//	driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
//	Thread.sleep(1000);
//	JavascriptExecutor js = (JavascriptExecutor)driver;
//	js.executeScript("scroll(0,3500)");
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a")).click();
//	driver.navigate().back();
//	Thread.sleep(2000);
//	js.executeScript("scroll(0,-3700)");
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div/main/div[2]/div/div/p[2]/a")).click();
	
//	2nd way
//	{
//	WebElement element = (WebElement) driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a"));
//	Coordinates coordinates = ((Locatable)element).getCoordinates();
//	coordinates.onPage();
//	coordinates.inViewPort();
//	}
//	driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a")).click();
//  }
  
//  @Test
//  public void TabSwitch() {
//	  driver.get("https://www.techlearn.in");
//	  driver.findElement(By.xpath("//*[@id=\"mega-menu-item-12\"]/a")).click();
//	  driver.findElement(By.xpath("//*[@id=\"post-57\"]/div/div/div/div/div/div/section/div[3]/a")).click();
//	  ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
//	  driver.switchTo().window(tab.get(0));	  
	  //new Tab
//	  driver.switchTo().newWindow(WindowType.TAB);
//	  driver.navigate().to("https://www.facebook.com");   
	  //new window
//	  driver.switchTo().newWindow(WindowType.WINDOW);
//	  driver.navigate().to("https://www.google.com");  
//  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
