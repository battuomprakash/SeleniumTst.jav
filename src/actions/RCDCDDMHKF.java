package actions;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class RCDCDDMHKF  {
	WebDriver driver;

	@Ignore	
	@Test
	public void Rightclick() {
		driver.get("https://www.techlearn.in/");
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-12\"]/a"))).click().build().perform();
		
	}

	//note:- ekkada doubleclicka and doubleclick(Webelement target) untundhi 
	// appudu doubleclick element tesukovali, right click kuda same. 
	@Ignore
	@Test
	public void Doubleclick() {
		driver.get("https://www.techlearn.in/code/double-tap/");
		Actions act = new Actions(driver);
		//firstway in double click
//		act.doubleClick(driver.findElement(By.xpath("//*[@id=\"post-3320\"]/div/div/div/div/div/div/button"))).build().perform();
		//secound way in double click
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"post-3320\"]/div/div/div/div/div/div/button"))).doubleClick().build().perform();
         //just using alert box
		driver.switchTo().alert().accept();
	}
	
	@Ignore
	@Test
	public void mousehover() throws InterruptedException {
		driver.get("https://www.techlearn.in/");
		Actions act = new Actions(driver);
    	act.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-14\"]/a"))).build().perform();
    	Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"mega-menu-item-14\"]/a")).click();  
    	// note:- but this normal way but we using actions class 
        // to retrieve the all acions method in reallife we don't use normal ways.
        act.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-45\"]/a"))).click().build().perform();
	}
	
	@Test
	public void DragDrop() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/drag-and-drop/");
	    Actions act = new Actions(driver);
	    // mouse ki findelement returntype use cheyali adhi webelement uu 
	    WebElement source = driver.findElement(By.xpath("//*[@id=\"drag1\"]"));
	    WebElement target = driver.findElement(By.xpath("//*[@id=\"div1\"]"));
	    act.dragAndDrop(source, target).build().perform();
	}
	
	@Test
	public void KeyboardFunctions() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
//		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).click(); // normal way
		Actions act = new Actions(driver);
		// using TAB go to password section and then we press enter we go the pop_up
		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).submit();
		
		// two ways in from submission 
		// 1. normal inspect and get the element and using click() method.
		// 2. interview person ask without using the click() how to submission the form in that
		//    situation we can use subimt().
		// 3. inka emi ayina vunaya anta using junit3 pre
		}

	
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
