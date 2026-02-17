package testNGPraticing;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class SecoundWeekSeleniumFeatures {
	WebDriver driver;
	//  @Test
	//  public void popup() {
	//simple alert-box
	//	  driver.get("https://www.techlearn.in/code/how-to-handle-alert-box-using-selenium/");
	//	  driver.findElement(By.xpath("//*[@id=\"post-689\"]/div/div/button")).click();
	//	  driver.switchTo().alert().accept();

	//confirmation dialog_box
	//	  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
	//	  driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
	//	  driver.switchTo().alert().accept();
	//	  driver.switchTo().alert().dismiss();

	//prompt dialog-box
	//	  driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
	//	  driver.findElement(By.xpath("//*[@id=\"post-748\"]/div/div/div/div/div/div/div/button")).click();
	//	  driver.findElement(By.xpath("//*[@id=\"post-748\"]/div/div/div/div/div/div/div/button")).click();
	//	  driver.switchTo().alert().sendKeys("Subash Chandra Bose");
	//	  driver.switchTo().alert().accept();
	//	  driver.switchTo().alert().dismiss();

	//	  Alert a = driver.switchTo().alert();
	//	  a.sendKeys("bosu");
	//	  a.accept();
	//	  a.dismiss();
	//  }

	//	@Test
	//	public void dropdown() throws InterruptedException {
	//		driver.get("https://www.redmine.org/");
	//		driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
	//		driver.findElement(By.xpath("//*[@id=\"user_mail\"]")).sendKeys("Sumanth123@gamil.com");
	//		Select obj = new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
	//		Thread.sleep(2000);
	//		obj.selectByContainsVisibleText("Dutch");
	//		Thread.sleep(2000);
	//	    obj.selectByIndex(11);
	//	    Thread.sleep(2000);
	//	    obj.selectByValue("mn");
	//	    Thread.sleep(2000);
	//	    obj.selectByVisibleText("Vietnamese (Tiếng Việt)");
	//	}

	//	@Test
	//	public void RCDCMHDDKF() throws InterruptedException {
	//		
	//right-click
	//		driver.get("https://www.techlearn.in/admin");
	//		Actions act = new Actions(driver);
	//		act.contextClick(driver.findElement(By.xpath("//*[@id=\"user_login\"]"))).build().perform();

	//double-click-> two type of method to perform double-tap
	//		driver.get("https://www.techlearn.in/code/double-tap/");
	//		Actions act1 = new Actions(driver);
	//		act1.doubleClick(driver.findElement(By.xpath("//*[@id=\"post-3320\"]/div/div/div/div/div/div/button"))).build().perform();
	//		act1.moveToElement(driver.findElement(By.xpath("//*[@id=\"post-3320\"]/div/div/div/div/div/div/button"))).doubleClick().build().perform();
	//		driver.switchTo().alert().accept();

	//mousehover
	//		driver.get("https://www.techlearn.in/");
	//		Actions act2 = new Actions(driver);
	//		act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-14\"]/a"))).build().perform();
	//		act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-45\"]/a"))).click().build().perform();

	//drag and drop
	//		driver.get("https://www.techlearn.in/code/drag-and-drop/");
	//		Actions act3 = new Actions(driver);
	//		WebElement source = driver.findElement(By.xpath("//*[@id=\"drag1\"]"));
	//		WebElement target = driver.findElement(By.xpath("//*[@id=\"div1\"]"));
	//		act3.dragAndDrop(source, target).build().perform();

	//keyword-functions
	//		driver.get("https://www.techlearn.in/admin");
	//		Actions act4 = new Actions(driver);
	//		act4.moveToElement(driver.findElement(By.xpath("//*[@id=\"user_pass\"]"))).sendKeys(Keys.TAB).build().perform();
	//		Thread.sleep(3000);
	//		act4.moveToElement(driver.findElement(By.xpath("//*[@id=\"user_pass\"]"))).sendKeys(Keys.ENTER).build().perform();

	//	}

	@Test
	//	public void TestTabText_CurrentUrl_Text() {
	//		driver.get("https://www.google.com/");
	//		String exptab = "Google";
	//		System.out.println("Expected Tab is "+exptab);
	//		String acttab = driver.getTitle();
	//		System.out.println("Actual Tab is "+acttab);
	//		Assert.assertEquals(acttab, exptab);

	//		driver.get("https://www.facebook.com/");
	//		String exturl = "https://www.facebook.com/";
	//		System.out.println("Expected URL is: "+exturl);
	//		String acturl = driver.getCurrentUrl();
	//		System.out.println("Actual URL is: "+acturl);
	//		
	//		Assert.assertEquals(acturl, exturl);

	//		driver.get("https://www.google.com/");
	//		String exttext = "India";
	//		System.out.println("Expected Text is: "+exttext);
	//		String acttext = driver.findElement(By.xpath("/html/body/div[2]/div[7]/div/div[1]")).getText();
	//		System.out.println("Actual Text is: "+acttext);
	//		
	//		Assert.assertEquals(acttext, exttext);
	//		
	//	}

	public void isdisplayed_isenabled_isselected() {
		//			driver.get("https://www.techlearn.in/admin");
		//		boolean dis = driver.findElement(By.xpath("//*[@id=\"loginform\"]/p[1]/label")).isDisplayed();
		//			if(dis==true)
		//			{
		//				System.out.println("userid is displayed");
		//			}
		//			else
		//			{
		//				System.out.println("userid is not displayed");
		//			}

		//		    driver.get("https://www.techlearn.in/admin");
		//		    driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("gowri");
		//		    boolean enab = driver.findElement(By.xpath("//*[@id=\"user_login\"]")).isEnabled();
		//		    if(enab==true)
		//		    {
		//		    	System.out.println("userid is enabled");
		//		    }
		//		    else 
		//		    {
		//		    	System.out.println("userid is not enabled");
		//		    }

		            driver.get("https://www.techlearn.in/admin");
		            driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		            boolean select = driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).isSelected();
		            if(select==true)
		            {
		            	System.out.println("Rememberbox is Selected");
		            }
		            else
		            {
		            	System.out.println("Rememberbox is NotSelected");
		            }
   }

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
