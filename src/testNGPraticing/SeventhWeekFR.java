
package testNGPraticing;

import org.testng.annotations.Test;

import junit.framework.Assert;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
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

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;

public class SeventhWeekFR {
	WebDriver driver;

	//	@Parameters("Browser")
	//	@BeforeTest
	//	  public void beforeTest(String Browser) {
	//		 if(Browser.equalsIgnoreCase("ChromeDriver")) {
	//			 driver = new ChromeDriver();
	//			 driver.manage().window().maximize();
	//		 }
	//		 else if(Browser.equalsIgnoreCase("FireFox")) {
	//			 driver = new FirefoxDriver();
	//		 }
	//		 else if(Browser.equalsIgnoreCase("Edge"))
	//		 {
	//			 driver = new EdgeDriver();
	//			 driver.manage().window().maximize();
	//		 }
	//	  }
	//	
	//  @Test
	//  public void login_page() {
	//	  driver.get("https:///www.techlearn.in/admin");
	//	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("logged");
	//	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("PWD");
	//	  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
	//  }


	//  @DataProvider(name = "loginDetails")
	//  public  String[][] login_credetianals(){
	//	return new String[][] {
	//		{"harish", "Kharish1456"},
	//		{"sujith", "sujith5864"},
	//		{"chandu", "prem143"},
	//		{"sunil", "suniljatt2589"},
	//		{"vinod", "Ljeep2534"}
	//	};
	//	  
	//  }
	//  
	//  @Test(dataProvider = "loginDetails")
	//  public void login_page(String user, String pwd) {
	//	  driver.get("https:///www.techlearn.in/admin");
	//	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys(user);
	//	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys(user);
	//	  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
	//	  driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
	//	  
	//  }

	//  @Test
	//  public void headless() {
	//	  ChromeOptions co = new ChromeOptions();
	//	  co.addArguments("headless");
	//	  driver = new ChromeDriver();
	//	  driver.get("https://www.google.com");
	//	  
	//	  String exptitle = "Google";
	//	  System.out.println("Expected is "+exptitle);
	//	  String acttilte = driver.getTitle();
	//	  System.out.println("Actual is "+acttilte);
	//	  Assert.assertEquals(acttilte, exptitle);  
	//  }

	//	public void getScreenshot() throws IOException {
	//		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy_MM__dd__HH__mm");
	//		Date date = new Date();
	//		String time = dateformat.format(date);
	//
	//		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//		FileUtils.copyFile(f, new File("C:\\Users\\OM PRAKASH\\Documents\\Lib\\screenshots\\loginpage_verifying"+time+".png"));
	//	}

	//	@Test
	//	public void Capturing() throws IOException {

	//		driver.get("https:///www.techlearn.in/admin");
	//		try {
	//				  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("kittu");
	//				  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("mohan");
	//				  driver.findElement(By.xpath("//*[@id=\"rememberme\\\"]")).click();
	//				  driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
	//		  File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//			 FileUtils.copyFile(f, new File("C:\\Users\\OM PRAKASH\\Documents\\Lib\\screenshots\\loginpage_validation.png"));

	//		 WebElement lyp = driver.findElement(By.xpath("//*[@id=\"nav\"]/a"));
	//		  File f = lyp.getScreenshotAs(OutputType.FILE);
	//		  FileUtils.copyFile(f, new File("C:\\Users\\OM PRAKASH\\Documents\\Lib\\screenshots\\singlewebelement.png"));

	//full page screenshot
	//		  driver.get("https://www.selenium.dev/");
	//		  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
	//		  Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	//		  ImageIO.write(s.getImage(), "PNG", new File("C:\\Users\\OM PRAKASH\\Documents\\Lib\\screenshots//completedpage.png"));
	//		  
	//		}
	//		catch(Exception e)
	//		{
	//			getScreenshot();
	//			System.out.println(e);
	//		}
	//
	//	@Test
	//	public void scroll_down() throws InterruptedException {
	//		driver.get("https://www.selenium.dev/");
	//		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
	//		JavascriptExecutor js = (JavascriptExecutor)driver;
	//		js.executeScript("scroll(0,3500)");
	//		Thread.sleep(3000);
	//		driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a")).click();
	//		Thread.sleep(2000);
	//		driver.navigate().back();
	////		js.executeScript("scroll(0,-3500)");
	//		js.executeScript("scroll(3500,0)");
	//		Thread.sleep(2000);
	//		driver.findElement(By.xpath("/html/body/div/main/div[2]/div/div/p[2]/a")).click();
	//	}

	//	@Test
	//	public void Identifier_Locator() {
	//		driver.get("https://www.selenium.dev/");
	//		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
	//		
	//		WebElement element =   (WebElement) driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a"));
	//		Coordinates coordinates = ((Locatable)element).getCoordinates();
	//		coordinates.onPage();
	//		coordinates.inViewPort();	
	//		driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a")).click();
	//	}

	//	@Test
	//	public void Newtabs_windows() throws InterruptedException {
	//		driver.get("https://www.techlearn.in/");
	//		driver.findElement(By.xpath("//*[@id=\"mega-menu-item-12\"]/a")).click();
	//		Thread.sleep(2000);
	//		driver.findElement(By.xpath("//*[@id=\"post-57\"]/div/div/div/div/div/div/section/div[3]/a")).click();
	//		ArrayList<String> tabs =   new ArrayList<String>(driver.getWindowHandles());
	//		driver.switchTo().window(tabs.get(1));
	//		Thread.sleep(4000);
	//		driver.switchTo().window(tabs.get(0));

	//new window
	//		driver.switchTo().newWindow(WindowType.TAB);
	//		driver.get("https://www.facebook.com");
	//		Thread.sleep(5000);
	//		driver.switchTo().newWindow(WindowType.WINDOW);
	//		driver.get("https://www.google.com");

	//second way
	//		driver.findElement(By.xpath("//*[@id=\"mega-menu-item-12\"]/a")).click();
	//		Thread.sleep(2000);
	//		driver.findElement(By.xpath("//*[@id=\"post-57\"]/div/div/div/div/div/div/section/div[3]/a")).click();
	//		Set<String> obj = driver.getWindowHandles();
	//		Object s1[]= obj.toArray();
	//		driver.switchTo().window(s1[1].toString());
	//		Thread.sleep(4000);
	//		driver.switchTo().window(s1[0].toString());
	//	}

	//	@Test
	//	public void scrolldown() throws InterruptedException {
	//		driver.get("https://www.selenium.dev/");
	//		Thread.sleep(3000);
	//		driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
	//		JavascriptExecutor jdown = (JavascriptExecutor) driver;
	//		jdown.executeScript("scroll(0,3500)");
	//		Thread.sleep(3000);
	//		driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a")).click();
	//		Thread.sleep(2000);
	//		driver.navigate().back();
	//		JavascriptExecutor jup = (JavascriptExecutor) driver;
	//		jup.executeScript("scroll(0,-3500)");
	//		Thread.sleep(3000);
	//		driver.findElement(By.xpath("/html/body/div/main/div[2]/div/div/p[2]/a")).click();
	//		Thread.sleep(3000);
	//	}

	//	@Test
	//    public void IndentifyLoacatorElement() throws InterruptedException {
	//		driver.get("https://www.selenium.dev/");
	//		Thread.sleep(3000);
	//		driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
	//		{
	//			Thread.sleep(3000);
	//			WebElement element = (WebElement) driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a"));
	//			Coordinates coordinates = ((Locatable)element).getCoordinates();
	//			coordinates.onPage();
	//			coordinates.inViewPort();
	//		}
	//		driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a")).click();
	//	}

	//	@Test
	//	public void iframes() throws InterruptedException {
	//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	//		WebElement frame = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
	//		driver.switchTo().frame(frame);
	//		driver.findElement(By.xpath("/html/body/button")).click();
	//		driver.switchTo().alert().accept();

	//		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"iframeResult\"]")));
	//		driver.findElement(By.xpath("/html/body/button")).click();
	//		driver.switchTo().alert().accept();
	//		
	//		driver.switchTo().frame("iframeResult");
	//		driver.findElement(By.xpath("/html/body/button")).click();
	//		driver.switchTo().alert().accept();
	//		Thread.sleep(3000);
	//		driver.switchTo().defaultContent();
	//		driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]/span")).click();
	//		
	//	}

	//	@Test
	//	public void file_upload() {
	//		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
	//		driver.findElement(By.xpath("//*[@id=\"myFile\"]")).sendKeys("C:\\Users\\OM PRAKASH\\Pictures\\Camera Roll\\WIN_20230311_11_07_18_Pro.jpg");	
	//	}

	//	@Test
	//	public void logger_4j() {
	//		Logger logger = Logger.getLogger("Google Search");
	//		PropertyConfigurator.configure("logger");
	//		
	//		driver = new ChromeDriver();
	//		logger.info("Opening Browser");
	//		driver.manage().window().maximize();
	//		logger.info("Maximize");
	//		
	//		JavascriptExecutor js = (JavascriptExecutor)driver;
	//		js.executeScript("scroll(0,3500)");
	//		
	//	}

	//	 @Test
	//	 public void title_url_text() {
	//		 driver.get("https://www.google.com/");
	//		 String exptitle = "Google";
	//		 System.out.println("Expected is "+exptitle);
	//		 String acttile = driver.getTitle();
	//		 System.out.println("Actual is "+acttile);
	//		 Assert.assertEquals(acttile, exptitle);
	//		 
	//		 driver.get("https://www.selenium.dev/");
	//		 String expurl = "https://www.selenium.dev/";
	//		 System.out.println("Expected is "+expurl);
	//		 String acturl = driver.getCurrentUrl();
	//		 System.out.println("Actual is "+acturl);
	//		 Assert.assertEquals(acturl, expurl);
	//		 
	//		 String exptext = "Store";
	//		 System.out.println("Expected is "+exptext);
	//		 String acttext = driver.findElement(By.xpath("/html/body/div[2]/div[2]/a[2]")).getText();
	//		 System.out.println("Actual is "+acttext);
	//		 Assert.assertEquals(acttext, exptext);

	//	 }

	//	@Test
	//	public void dis_ena_sel() {
	//		 driver.get("https:///www.techlearn.in/admin");

	//		 Boolean displayed = driver.findElement(By.xpath("//*[@id=\"loginform\"]/p[1]/label")).isDisplayed();
	//		 if(displayed==true) {
	//			 driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("sumanth");
	//			 System.out.println("UserName Text is  Displayed");
	//		 }
	//		 else {
	//			 System.out.println("UserName Text is Not Displayed");
	//		 }

	//		 Boolean enabled = driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).isEnabled();
	//		 if(enabled==true) {
	//			 driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Kamdalur");
	//			 System.out.println("Password Box is  Enabled");
	//		 }
	//		 else {
	//			 System.out.println("Password Box is Not Enabled");
	//		 }
	//		 
	//		 
	//		 driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
	//		 Boolean selected = driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).isSelected();
	//		 if(selected==true) {
	//			 driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).click();
	//			 System.out.println("Rememberme Option is Selected");
	//		 }
	//		 else {
	//			 System.out.println("Rememberme Option not Selected");
	//		 }
	//		 
	//	}

	//	@Test
	//	public void A_actions() throws InterruptedException {
	//		driver.get("https://www.techlearn.in/");

	//		Actions act = new Actions(driver);
	//right click
	//		act.contextClick(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-14\"]/a"))).build().perform();
	//double click
	//		driver.get("https://www.techlearn.in/code/double-tap/");
	//		act.doubleClick(driver.findElement(By.xpath("//*[@id=\"post-3320\"]/div/div/div/div/div/div/button"))).build().perform();
	//		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"post-3320\"]/div/div/div/div/div/div/button"))).doubleClick().build().perform();
	//		//mouse over
	//		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-14\"]/a"))).build().perform();
	//		driver.findElement(By.xpath("//*[@id=\"mega-menu-item-45\"]/a")).click();
	//		//drag and drop
	//		driver.get("https://www.techlearn.in/code/drag-and-drop/");
	//		WebElement source = driver.findElement(By.xpath("//*[@id=\"drag1\"]"));
	//		WebElement target = driver.findElement(By.xpath("//*[@id=\"div1\"]"));
	//		act.dragAndDrop(source, target).build().perform();
	//		//keyboard actions
	//		driver.get("https://www.techlearn.in/admin");
	//		act.sendKeys(Keys.TAB).build().perform();
	//		Thread.sleep(5000);
	//		act.sendKeys(Keys.ENTER).build().perform();	
	//	}

	//	@Test
	//	public void drop_downs() throws InterruptedException {
	//	
	//		driver.get("https://www.redmine.org/");
	//		driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
	//		driver.findElement(By.xpath("//*[@id=\"user_mail\"]")).sendKeys("SumanthKamdulur4599@gmail.com");
	//		
	//		Select s = new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
	//		s.selectByVisibleText("Swedish (Svenska)");
	//		Thread.sleep(2000);
	//		s.selectByValue("fi");
	//		Thread.sleep(2000);
	//		s.selectByIndex(10);
	//		Thread.sleep(2000);
	//		s.selectByContainsVisibleText("Vietnamese ");
	//		
	//	}

	//	@Test
	//	public void A_alerts() {
	//simple alert
	//		driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
	//		driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
	//		driver.switchTo().alert().accept();

	//conformation dialog box
	//		driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
	//		driver.switchTo().alert().dismiss();

	//pop_up dialog box
	//		driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
	//		driver.findElement(By.xpath("//*[@id=\"post-748\"]/div/div/div/div/div/div/div/button")).click();
	//		Alert a = driver.switchTo().alert();
	//		a.sendKeys("Sumanth");
	//		a.accept();
	//		a.dismiss();		
	//	}

	//	@Test(description = "Google Webpage")
	//	public void Google() {
	//		driver.get("https://www.google.com");
	//	}
	//
	//	@Test(priority = 0)
	//	public void Facebook() {
	//		driver.get("https://www.facebook.com");
	//	}
	//	
	//	@Test(priority = 5)
	//	public void Selenium() {
	//		driver.get("https://www.selenium.dev");
	//	}
	//	
	//	@Test(priority = 1, timeOut = 4000)
	//	public void Twitter() {
	//		driver.get("https://www.x.com");
	//	}
	//	
	//	@Test(priority = 3)
	//	public void Swiggy() {
	//		driver.get("https://www.swiggy.com");
	//	}
	//	
	//	@Test(priority = 2)
	//	public void Zomato() {
	//		driver.get("https://www.zomato.com");
	//	}
	//	
	//	@Test(priority = 4)
	//	public void Techlearn() {
	//		driver.get("https://www.techlearn.in/admin");
	//	}


	//	@Test
	//	public void method1() {
	//		driver.get("https://www.techlearn.in/admin");
	//	}
	//
	//	@Test(dependsOnMethods ="method1", invocationCount=5)
	//	public void method2() throws InterruptedException {
	//		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("logged");
	//			  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("PWD");
	//			  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
	//			  driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).click();
	//			  driver.navigate().back();
	//			  driver.navigate().refresh();
	//			  Thread.sleep(1000);
	//	}

	//	@Test
	//	public void Css_Selector() throws InterruptedException {
	//		driver.get("https://www.techlearn.in/admin");
	//		driver.findElement(By.cssSelector("#user_login")).sendKeys("Sumanth");
	//		Thread.sleep(1000);
	//		driver.findElement(By.cssSelector("input#user_pass")).sendKeys("Kamdalur");
	//		Thread.sleep(1000);
	//	    driver.navigate().refresh();
	//	    
	//	    
	//		driver.findElement(By.cssSelector(".input")).sendKeys("Sumanth");
	//		Thread.sleep(1000);
	//		driver.findElement(By.cssSelector("a.wp-login-lost-password")).click();
	//		Thread.sleep(1000);	
	//	}

	//	@Test
	//	public void Tag_Name() {
	//		driver.get("https://www.flipkart.com/");
	//		List<WebElement> totallinks = driver.findElements(By.tagName("a"));
	//		System.out.println("Total links "+totallinks.size());
	//		List<WebElement> images = driver.findElements(By.tagName("img"));
	//		System.out.println("Total images "+images.size());
	//	}


	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
}
