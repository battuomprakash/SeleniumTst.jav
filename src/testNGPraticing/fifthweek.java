package testNGPraticing;

import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import javax.imageio.ImageIO;

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

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class fifthweek {
	WebDriver driver;

	//	@DataProvider (name= "loginCredetials")
	//	public String[][] logindetails() {
	//		return new String[][]{
	//			{"sumanth","kamdalur@123"},
	//			{"hari","hari@223"},
	//			{"ravi","ravi@113"},
	//			{"jyothi","jyothi@122"},
	//			{"kittu","kittu@133"}
	//		};
	//		
	//	}
	//	
	//	
	//	
	//  @Test(dataProvider = "loginCredetials")
	//  public void datasets(String user, String pwd) {
	//	  driver.get("https://www.techlearn.in/admin");
	//	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys(user);
	//	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys(pwd);
	//	  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
	//	  driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).clear();
	//	  
	//  }

	//	@Parameters("Browser")
	//	@BeforeTest
	//	public void beforeTest(String Browser) {
	//		if(Browser.equalsIgnoreCase("ChromeBrowser")) {
	//			driver = new ChromeDriver();
	//			driver.manage().window().maximize();
	//		}
	//		else if(Browser.equalsIgnoreCase("Firefox")){
	//			driver = new FirefoxDriver();
	//		}
	//		else if(Browser.equalsIgnoreCase("EdgeBrowser")) {
	//			driver = new EdgeDriver();
	//			driver.manage().window().maximize();
	//		}
	//
	//	}
	//
	//  @Test
	//	  public void logindetails() {
	//		  driver.get("https://www.techlearn.in/admin");
	//		  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("hello");
	//		  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("world");
	//		  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
	////		  driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).clear();
	//		  
	//	  }
	//	
	//}

	//	public void getScreenshot() throws IOException {
	//		SimpleDateFormat dataformat = new SimpleDateFormat("yyyy_MM__dd_HH__mm__ss");
	//		Date date = new Date();
	//		String time = dataformat.format(date);
	//		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//		FileUtils.copyFile(f, new File("C:\\Users\\OM PRAKASH\\Documents\\Lib\\screenshots\\LoginPageError"+time+".png"));
	//
	//	}

	//@Test
	//public void logindetails() throws IOException {
	//	
	//	try {
	//	  driver.get("https://www.techlearn.in/admin");
	//	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("hello");
	//	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("world");
	//	  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
	//	  driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).clear();

	//	  WebElement usertxt = driver.findElement(By.xpath("//*[@id=\"loginform\"]/p[1]/label"));
	//	  File f = usertxt.getScreenshotAs(OutputType.FILE);
	//	  FileUtils.copyFile(f, new File("C:\\Users\\OM PRAKASH\\Documents\\Lib\\screenshots\\UserText.png"));

	//	}
	//	catch(Exception e)
	//	{
	//		getScreenshot();
	//		System.out.println("Exception"+e);
	//	}
	//}

	//	@Test
	//	public void FullPageScreenshot() throws InterruptedException, IOException {
	//		driver.get("https://www.selenium.dev/");
	//		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
	//		Thread.sleep(3000);
	//		Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	//		ImageIO.write(s.getImage(), "PNG", new File("C:\\Users\\OM PRAKASH\\Documents\\Lib\\screenshots\\fullpage.png"));
	//		
	//	}

	//	@Test
	//	public void tab_windows_switching() throws InterruptedException {
	//	driver.get("https://www.techlearn.in/");
	//	driver.findElement(By.xpath("//*[@id=\"mega-menu-item-12\"]/a")).click();
	//	Thread.sleep(2000);
	//	driver.findElement(By.xpath("//*[@id=\"post-57\"]/div/div/div/div/div/div/section/div[3]/a")).click();
	//	Thread.sleep(2000);
	//	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	//	driver.switchTo().window(tabs.get(1));
	//	driver.findElement(By.xpath("/html/body/div/main/div[2]/div/div/p[2]/a")).click();
	//	Thread.sleep(2000);
	//	
	//	driver.switchTo().window(tabs.get(0));
	//	driver.findElement(By.xpath("//*[@id=\"mega-menu-item-16\"]/a")).click();

	//tabs and windows switching
	//	driver.switchTo().newWindow(WindowType.TAB);
	//	driver.switchTo().newWindow(WindowType.WINDOW);
	//	driver.get("https://www.google.com");
	//
	//	}

	//	@Test
	//	public void newtab() throws InterruptedException {
	//	driver.get("https://www.techlearn.in/");
	//	driver.findElement(By.xpath("//*[@id=\"mega-menu-item-12\"]/a")).click();
	//	Thread.sleep(2000);
	//	driver.findElement(By.xpath("//*[@id=\"post-57\"]/div/div/div/div/div/div/section/div[3]/a")).click();
	//	Thread.sleep(2000);
	//	Set<String> obj = driver.getWindowHandles();
	//	Object s[] = obj.toArray();
	//	driver.switchTo().window(s[1].toString());
	//	driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();
	//	Thread.sleep(2000);
	//	driver.switchTo().window(s[0].toString());
	//	driver.findElement(By.xpath("//*[@id=\"mega-menu-item-16\"]/a")).click();
	//	}

	// @Test
	// public void scrolling() throws InterruptedException {
	//	 driver.get("https://www.selenium.dev/");
	//	 driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
	//	 JavascriptExecutor js =  (JavascriptExecutor)driver;
	//	 js.executeScript("scroll(0,3500)");
	//	 Thread.sleep(2000);
	//	 driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a")).click();
	//	 driver.navigate().back();
	//	 Thread.sleep(2000);
	//	 js.executeScript("scroll(0,-3500)");
	//	 Thread.sleep(2000);
	//	 driver.findElement(By.xpath("/html/body/div/main/div[2]/div/div/p[2]/a")).click();

	//2nd way of scroll page
	//	 {
	//	 WebElement element =  driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a"));
	//	 Coordinates coordinate = ((Locatable)element).getCoordinates();
	//	 coordinate.onPage();
	//	 coordinate.inViewPort();
	//	 }
	//	 driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a")).click();
	// }

	//@Test
	//public void Iframes() throws InterruptedException {
	//	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	//	WebElement frm = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
	//	driver.switchTo().frame(frm);
	//	driver.findElement(By.xpath("/html/body/button")).click();
	//	driver.switchTo().alert().accept();

	//	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"iframeResult\"]")));
	//	driver.findElement(By.xpath("/html/body/button")).click();
	//	driver.switchTo().alert().accept();
	//	
	//	driver.switchTo().frame("iframeResult");
	//	driver.findElement(By.xpath("/html/body/button")).click();
	//	driver.switchTo().alert().accept();
	//	Thread.sleep(2000);
	//	driver.switchTo().defaultContent();
	//	Thread.sleep(2000);
	//	driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
	//}

	//	@Test
	//	public void dis_ena_sel() {
	//		driver.get("https://www.techlearn.in/admin");
	//		
	//		Boolean usrtext = driver.findElement(By.xpath("//*[@id=\"loginform\"]/p[1]/label")).isDisplayed();
	//		if(usrtext==true)
	//		{
	//			
	//			System.out.println("UserName is Displayed");
	//		}
	//		else
	//		{
	//			System.out.println("UserName is Not Displayed");
	//			
	//		}
	//		
	//		Boolean usrinput = driver.findElement(By.xpath("//*[@id=\"user_login\"]")).isEnabled();
	//		if(usrinput==true)
	//		{
	//			driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Sumanth");
	//			System.out.println("UserName Field is Enabled");
	//		}
	//		else {
	//			System.out.println("UserName Field is Not Enabled");
	//		}
	//		
	//		driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
	//		Boolean sel = driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).isSelected();
	//		if(sel==true)
	//		{
	//			System.out.println("RememberMe is Selected");
	//		}
	//		else
	//		{
	//			System.out.println("RememberMe is Not Selected");
	//		}
	//	}

	//	@Test
	//	public void tab_title_url_text() {
	//		driver.get("https://www.google.com");
	//		String exptitle = "Google";
	//		System.out.println("Expected Title is "+exptitle);
	//		String acttitle = driver.getTitle();
	//		System.out.println("actual Title is "+acttitle);
	//		Assert.assertEquals(acttitle, exptitle);
	//		
	//		String expurl = "https://www.google.com/";
	//		System.out.println("Expected Url is "+expurl);
	//		String acturl = driver.getCurrentUrl();
	//		System.out.println("Actual Url is "+acturl);
	//		Assert.assertEquals(acturl, expurl);
	//		
	//		String exptext = "Store";
	//		System.out.println("Expected Text is "+exptext);
	//		String acttext = driver.findElement(By.xpath("/html/body/div[2]/div[2]/a[2]")).getText();
	//		System.out.println("Actual+ Text is "+acttext);
	//		Assert.assertEquals(acttext, exptext);
	//	}

	//	@Test
	//	public void Rc_Dc_Mh_Dd_Kf() throws InterruptedException {
	//		Actions a = new Actions(driver);
	//Right Click
	//		driver.get("https://www.techlearn.in/");
	//		a.contextClick(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-14\"]/a"))).build().perform();
	//		Thread.sleep(2000);
	//Double Click
	//		driver.get("https://www.techlearn.in/code/double-tap/");
	//		a.doubleClick(driver.findElement(By.xpath("//*[@id=\"post-3320\"]/div/div/div/div/div/div/button"))).build().perform();
	//		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"post-3320\"]/div/div/div/div/div/div/button"))).doubleClick().build().perform();
	//		Thread.sleep(2000);
	//		driver.switchTo().alert().accept();
	//Mouse hover
	//		driver.get("https://www.techlearn.in/");
	//		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-14\"]/a"))).build().perform();
	//drag and drop
	//		driver.get("https://www.techlearn.in/code/drag-and-drop/");
	//		WebElement source = driver.findElement(By.xpath("//*[@id=\"drag1\"]"));
	//		WebElement target = driver.findElement(By.xpath("//*[@id=\"div1\"]"));
	//		a.dragAndDrop(source, target).build().perform();
	//keyword Function
	//		driver.get("https://www.techlearn.in/admin");
	//		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys(Keys.TAB);
	//		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys(Keys.ENTER);
	//		}

	//		@Test
	//		public void Drop_Down() throws InterruptedException {
	//			driver.get("https://www.redmine.org/");
	//			driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
	//			driver.findElement(By.xpath("//*[@id=\"user_mail\"]")).sendKeys("Sumanth@gmail.com");
	//			
	//			Select s = new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
	//			s.selectByVisibleText("Bosnian (Bosanski)");
	//			Thread.sleep(2000);
	//			s.selectByIndex(11);
	//			Thread.sleep(2000);
	//			s.selectByValue("it");
	//			Thread.sleep(2000);
	//			s.selectByContainsVisibleText("Mongolian ");
	//		}

	//	@Test
	//	public void Pop_up() {
	//simple alert box
	//		driver.get("https://www.techlearn.in/code/how-to-handle-alert-box-using-selenium/");
	//		driver.findElement(By.xpath("//*[@id=\"post-689\"]/div/div/button")).click();
	//		driver.switchTo().alert().accept();

	//conformation dialog box
	//		 driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
	//		 driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
	//		 driver.switchTo().alert().accept();
	//		 driver.switchTo().alert().dismiss();

	//prompt dialog box
	//		driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
	//		driver.findElement(By.xpath("//*[@id=\"post-748\"]/div/div/div/div/div/div/div/button")).click();
	//		Alert a = driver.switchTo().alert();
	//		a.sendKeys("sumanth");
	//		a.accept();
	//		a.dismiss();
	//		
	//	}

//	@Test(description = "Google Homepage",priority =1)
//    public void google() {
//		driver.get("https://www.google.com");
//	}
//	
//	@Test(priority=0)
//    public void facebook() {
//		driver.get("https://www.facebook.com");
//	}
//	
//	@Test(priority=3, timeOut = 30000)
//    public void twitter() {
//		driver.get("https://www.x.com/");
//	}
//	
//	@Test(priority=2)
//    public void zomato() {
//		driver.get("https://www.zomato.com");
//	}
//	
//	@Test(priority=4)
//    public void swiggy() {
//		driver.get("https://www.swiggy.com");
//	}
	
	@Test(invocationCount=5, dependsOnMethods = "method2")
    public void method1() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Surri");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Babu");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		Thread.sleep(1000);
		driver.navigate().refresh();
	}
	
	@Test
    public void method2() {
		driver.get("https://www.techlearn.in/admin");
	}




	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
