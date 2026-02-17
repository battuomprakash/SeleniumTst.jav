package junittutorial;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SecoundWeekFRLocators {
	static WebDriver driver;
	
	@Disabled
	@Test
	void testid() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		
	}
	@Disabled
	@Test
	void testName() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("hello");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
	}
	
	@Disabled
	@Test
	void testClassName() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.className("input")).sendKeys("techlearn");
		
	}
	
	@Disabled
	@Test
	void testCssSelector() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlearn.in/admin");
//		driver.findElement(By.cssSelector("#user_login")).sendKeys("techlearn");
//		driver.findElement(By.cssSelector("input#user_pass")).sendKeys("tirupati");
		
//		driver.findElement(By.cssSelector(".input")).sendKeys("techlearn");
//		driver.findElement(By.cssSelector("input.input")).sendKeys("tirupati");
		
	}
	
	@Disabled
	@Test
	void testLinkText() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.linkText("Lost your password?")).click();
		
	}
	
	@Disabled
	@Test
	void testPartialLinkText() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.partialLinkText("Lost your ")).click();
	}
	
	@Disabled
	@Test
	void testTagName() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> links =  driver.findElements(By.tagName("a"));
		System.out.println("total no Links: "+links.size());
		
		List<WebElement> images =  driver.findElements(By.tagName("img"));
		System.out.println("total no Images: "+images.size());
		
	}
	
	@Test
	void testXoath_Absolute_and_Relativer() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.xpath("/html/body/div[1]/form/p[1]/input")).sendKeys("Techlearn");
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("tirupati");
	}

}
