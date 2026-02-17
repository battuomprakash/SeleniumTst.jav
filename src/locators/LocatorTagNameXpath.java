package locators;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



class LocatorTagNameXpath {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Disabled
	@Test
	void tagName() {
	       driver.get("https://www.redmine.org/");
	       List<WebElement> totallinks = driver.findElements(By.tagName("a"));
	       System.out.println("Total no of links "+totallinks.size());
	       List<WebElement> img = driver.findElements(By.tagName("img"));
	       System.out.println("Total no of images "+img.size());
 
		}
	
	@Test
	public void xpath() throws Exception {
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.xpath("/html/body/div[1]/form/p[1]/input")).sendKeys("Sumanth");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Kamdalur");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).click();

		}

}
