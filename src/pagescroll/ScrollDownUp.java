package pagescroll;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.testng.annotations.BeforeTest;

public class ScrollDownUp {
	WebDriver driver;
	@Test
	public void scrolldown() throws InterruptedException {
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
		JavascriptExecutor jdown = (JavascriptExecutor) driver;
		jdown.executeScript("scroll(0,3500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		JavascriptExecutor jup = (JavascriptExecutor) driver;
//		jup.executeScript("scroll(0,-3500)");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div/main/div[2]/div/div/p[2]/a")).click();
//		Thread.sleep(3000);
	}

	@Test(enabled = false)
    public void IndentifyLoacatorElement() throws InterruptedException {
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
		{
			Thread.sleep(3000);
			WebElement element = (WebElement) driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a"));
			Coordinates coordinates = ((Locatable)element).getCoordinates();
			coordinates.onPage();
			coordinates.inViewPort();
		}
		driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a")).click();
	}




	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
