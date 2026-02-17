package frames;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Iframes_Handles  {
	WebDriver driver;
	@Test
	public void frames() throws InterruptedException {
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	   // 1st approach method-1
//		WebElement frame = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
//		driver.switchTo().frame(frame);
//		 driver.findElement(By.xpath("/html/body/button")).click();
		
		// 2nd approach method-2
//		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"iframeResult\"]")));
		
		// 2nd approach
//		driver.switchTo().frame(2);  // doubt
		
		//3rd approach
//		driver.switchTo().frame("iframeResult");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/button")).click();
//		Thread.sleep(2000);
//        driver.switchTo().alert().accept();
		
		//getting back to main page
		
//				driver.switchTo().defaultContent();
//				driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
//				
				// No frame
				
//	        
			
			
		
	}
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}