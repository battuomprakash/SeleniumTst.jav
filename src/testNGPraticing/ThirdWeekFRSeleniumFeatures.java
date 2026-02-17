package testNGPraticing;

import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v142.page.model.Screenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class ThirdWeekFRSeleniumFeatures {
	WebDriver driver;
	
  @Ignore
  @Test
  public void popupAlerts() throws InterruptedException {
	  // Simple-alertBox
	  driver.get("https://www.techlearn.in/code/how-to-handle-alert-box-using-selenium/");
	  driver.findElement(By.xpath("//*[@id=\"post-689\"]/div/div/button")).click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	  //Confirmation dialoge-box
	  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
	  driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
	  driver.switchTo().alert().accept();
	  driver.switchTo().alert().dismiss();
	  //prompt dialoge-box
	  driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
	  driver.findElement(By.xpath("//*[@id=\"post-748\"]/div/div/div/div/div/div/div/button")).click();
	  Alert alt = driver.switchTo().alert();
	  alt.sendKeys("Kangalu");
	  Thread.sleep(2000);
	  alt.accept();
	  alt.dismiss();
  }
  
  @Ignore
  @Test 
  public void DropDown() throws InterruptedException {
	  driver.get("https://www.redmine.org/");
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"user_mail\"]")).sendKeys("sumanth@123gmail.com");
	  Thread.sleep(3000);
	  Select s = new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
	  s.selectByVisibleText("French (Français)");
	  Thread.sleep(1000);
	  s.selectByIndex(11);
	  Thread.sleep(1000);
	  s.selectByValue("da");
	  Thread.sleep(1000);
	  s.selectByContainsVisibleText("Hungarian ");	  
  }
  
  @Ignore
  @Test
  public void Keywords() throws InterruptedException {
	driver.get("https://www.techlearn.in/");
	driver.get("https://www.techlearn.in/admin");
	driver.get("https://www.techlearn.in/code/double-tap/");
    driver.get("https://www.techlearn.in/code/drag-and-drop/");
	Actions a = new Actions(driver);
	//right-click
	a.contextClick(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-16\"]/a"))).build().perform();
//    double-click
	a.doubleClick(driver.findElement(By.xpath("//*[@id=\"post-3320\"]/div/div/div/div/div/div/button"))).build().perform();
	a.moveToElement(driver.findElement(By.xpath("//*[@id=\"post-3320\"]/div/div/div/div/div/div/button"))).doubleClick().build().perform();
	driver.switchTo().alert().accept();
	//mouse-hover
    a.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-14\"]/a"))).build().perform();
    a.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-45\"]/a"))).click().build().perform();
	//drag and drop
	WebElement source = driver.findElement(By.xpath("//*[@id=\"drag1\"]"));
	WebElement target = driver.findElement(By.xpath("//*[@id=\"div1\"]"));
	a.dragAndDrop(source, target).build().perform();
	//keyword keys
    a.sendKeys(Keys.TAB).build().perform();
    Thread.sleep(2000);
    a.sendKeys(Keys.ENTER).build().perform();
  }
  
  @Ignore
  @Test
  public void title_url_text() throws InterruptedException {
	  driver.get("https://www.google.com");
	  //tab title
	  String exptitle = "Google";
	  Thread.sleep(2000);
	  System.out.println("Expected is "+exptitle);
	  String acttitle = driver.getTitle();
	  Thread.sleep(2000);
	  System.out.println("Actual is "+acttitle);
	  Assert.assertEquals(acttitle, exptitle);
	  // Url
	  String expurl = "https://www.google.com/";
	  Thread.sleep(2000);
	  System.out.println("Expected is "+expurl);
	  String acturl = driver.getCurrentUrl();
	  Thread.sleep(2000);
	  System.out.println("Actual is "+acturl);
	  Assert.assertEquals(acturl, expurl);
	  //Text
	  String exptext = "Store";
	  Thread.sleep(2000);
	  System.out.println("Expected is "+exptext);
	  String acttext = driver.findElement(By.xpath("/html/body/div[2]/div[2]/a[2]")).getText();
	  Thread.sleep(2000);
	  System.out.println("Actual is "+acttext);
	  Assert.assertEquals(acttext, exptext);
  }
  
  @Ignore
  @Test
  public void isDisplayed_isEnabled_isSelected() {
	  driver.get("https://www.techlearn.in/admin");
	  //isDisplayed
	  Boolean dis = driver.findElement(By.xpath("//*[@id=\"loginform\"]/p[1]/label")).isDisplayed();
	  if(dis==true)
	  {
		  System.out.println("isDisplayed");
		  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Hello");
	  }
	  else
	  {
		  System.out.println("Not displayed");
	  }
	  //isEnabled
	 Boolean ena = driver.findElement(By.xpath("//*[@id=\"user_login\"]")).isEnabled();
	  if(ena==true)
	  {
		  System.out.println("isEnabled");
         driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("world");
	  }
	  else
	  {
		  System.out.println("Not Enabled");
	  }
	  //isSelected
	  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
	  Boolean sel = driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).isSelected();
	  if(sel==true)
	  {
		  System.out.println("isSelected ");

	  }
	  else
	  {
		  System.out.println("Not Selected");
	  }
  }

  @Ignore
  @Test
  public void frames_switching() {
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  //1st approach
	  WebElement frame = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
	  driver.switchTo().frame(frame); //kinda element select cheyalii diniki
	  driver.findElement(By.xpath("/html/body/button")).click();
	  //2nd approach
	  driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"iframeResult\"]")));
	  driver.findElement(By.xpath("/html/body/button")).click();
	  //3rd approach
	  driver.switchTo().frame("iframeResult");
	  driver.findElement(By.xpath("/html/body/button")).click();
	  driver.switchTo().alert().accept();	  
  }
  
  @Ignore
  @Test
  public void scroll_up_down() throws InterruptedException {
	  driver.get("https://www.selenium.dev/");
	  // one way using x-axis and y-axis
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
	  JavascriptExecutor js = (JavascriptExecutor) driver; 
	  js.executeScript("scroll(0, 3500)");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a")).click();
	  Thread.sleep(3000);
	  driver.navigate().back();
	  js.executeScript("scroll(3500,0)");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div/main/div[2]/div/div/p[2]/a")).click();
	// secoud way using x-axis and y-axis
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
	  JavascriptExecutor jsp = (JavascriptExecutor) driver; 
	  jsp.executeScript("scroll(0, 3500)");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a")).click();
	  Thread.sleep(3000);
	  driver.navigate().back();
	  jsp.executeScript("scroll(0,-3500)");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div/main/div[2]/div/div/p[2]/a")).click();
	  // third way
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
	  Thread.sleep(3000);
	  // e method u a page lo manaki kavaalasina element dagaraki tesukoni pothindhi anta mala kind 
	  // manam perform cheyali
	  {
		  WebElement element = (WebElement) driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a"));
		  Coordinates coordinates = ((Locatable)element).getCoordinates();
		  coordinates.onPage();
		  coordinates.inViewPort();
	  }
	  driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a")).click();
  }
  
  @Ignore
  @Test
  public void newTab_newWindow() throws InterruptedException {
	  driver.get("https://www.techlearn.in");
	  // Tabs Switchingg
	  driver.findElement(By.xpath("//*[@id=\"mega-menu-item-12\"]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"post-57\"]/div/div/div/div/div/div/section/div[3]/a")).click();
	  ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab.get(1));
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div/main/div[2]/div/div/p[2]/a")).click();
	  Thread.sleep(3000);
	  driver.navigate().back();
	  driver.switchTo().window(tab.get(0));
	  driver.findElement(By.xpath("//*[@id=\"mega-menu-item-16\"]/a")).click();
	  //NEW TAB AND Nw Window
	  ArrayList<String> tabandWindowSwitching = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().newWindow(WindowType.TAB);
	  driver.get("https://www.google.com");
	  driver.switchTo().newWindow(WindowType.WINDOW);
	  driver.get("https://www.facebook.com");	 
	  //using set 
	  Set<String> obj = driver.getWindowHandles();
	  Object s[] = obj.toArray();
	  driver.switchTo().window(s[0].toString());
	  
  }
  
  public void getScreenshot() throws InterruptedException, IOException {
	  SimpleDateFormat dateformat = new SimpleDateFormat("yyyy_MM__dd__HH__mm__ss");
	  Date date = new Date();
	  String time = dateformat.format(date);
	  
	  File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f, new File("C:\\Users\\OM PRAKASH\\Documents\\Lib\\screenshots\\Errorindentified"+time+".png"));
	  
  }
  

  @Test
  public void AllTypeofScreenshots() throws InterruptedException, IOException  {
	  driver.get("https://www.techlearn.in/admin");
//		driver.findElement(By.id("user_login")).sendKeys("Sumanth");
//		Thread.sleep(2000);
//		driver.findElement(By.name("pwd")).sendKeys("Kamdalur");
//		Thread.sleep(2000);
//		driver.findElement(By.name("rememberme")).click();
//		driver.findElement(By.linkText("Lost your password?")).click();
//		getScreenshot();
	  //selected WebElement Screenshot
//	  WebElement lyp = driver.findElement(By.xpath("//*[@id=\"nav\"]/a"));
//	  File f = lyp.getScreenshotAs(OutputType.FILE);
//	  FileUtils.copyFile(f, new File("C:\\Users\\OM PRAKASH\\Documents\\Lib\\screenshots\\SelectedWebElement.jpg"));
	  //where error we get the screenshot
	  try {
	  driver.findElement(By.id("user_login")).sendKeys("Sumanth");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("Kamdalur");
		Thread.sleep(2000);
		driver.findElement(By.name("rememberme")).click();
		driver.findElement(By.linkText("Lost your password???")).click();
		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("123465");
	  }
	  catch(Exception e)
	  {
		  System.out.println("Exception occur "+e);
		  getScreenshot();
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}


// Logger log = Logger.getLogger("");
// Property.Configurator congigure("");
