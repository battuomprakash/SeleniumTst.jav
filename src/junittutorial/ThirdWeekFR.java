package junittutorial;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class ThirdWeekFR {
	WebDriver driver = new ChromeDriver();
	
	@Disabled
	@Test
	void testNavigation() throws InterruptedException {
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.navigate().to("https://www.facebook.com");
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.navigate().forward();
	Thread.sleep(1000);
	driver.navigate().refresh();
	}
	
	@Test
	void locators() throws InterruptedException
	{
		driver.get("https://www.techlearn.in/admin");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("user_login")).sendKeys("hello");
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys("world");
		Thread.sleep(1000);
		driver.findElement(By.id("rememberme")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("\"Lost your password?")).click();
//		driver.findElement(By.partialLinkText("Lost your ")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("input")).sendKeys("ok");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[2]/p")).getText();
		
//		driver.get("https://www.flipkart.com");
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		System.out.println("no fo links "+links.size());
//		
//		List<WebElement> img = driver.findElements(By.tagName("img"));
//		System.out.println("no of images "+img.size());
	}

}
