package locators;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumLocators {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Disabled
	@Test
	public void idnameclassname() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.id("user_login")).sendKeys("Sumanth");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("Kamdalur");
		Thread.sleep(2000);
		driver.findElement(By.name("rememberme")).click();
		driver.findElement(By.linkText("Lost your password?")).click();
		driver.findElement(By.partialLinkText("Lost password?")).click();
		
	
	}
	
	@Disabled
	@Test
	public void cssSelector() throws InterruptedException
	{
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.cssSelector("#user_login")).sendKeys("Sumanth");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#user_pass")).sendKeys("Kamdalur");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".wp-login-lost-password")).click();
//		driver.findElement(By.cssSelector("a.wp-login-lost-password")).click();
	}
	
	@Test
	public void linkedtextandPartiallinkedtext() throws InterruptedException
	{
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.id("user_login")).sendKeys("Sumanth");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("Kamdalur");
		Thread.sleep(2000);
		driver.findElement(By.name("rememberme")).click();
//		driver.findElement(By.linkText("Lost your password?")).click();
		driver.findElement(By.partialLinkText("Lost your")).click();
	}
	
	

}
