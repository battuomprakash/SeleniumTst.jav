package crossBroswerTesting;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Cross_Browser_Testing2 {
	public WebDriver driver;

	@Parameters("Broswer")
	@BeforeTest
	public void OpenBrowser(String browser) {
		try {
			if(browser.equalsIgnoreCase("ChromeBrowser"))
			{
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
			else if(browser.equalsIgnoreCase("Firefox")) {
				driver = new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("Edge")) {
				driver = new EdgeDriver();
				driver.manage().window().maximize();
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void googlesearch() throws Exception {

		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Crossbrowser Testing in Selenium"+Keys.ENTER);


	}

	@Test
	public void facebook() throws Exception {

		driver.get("https://www.facebook.com");
		Thread.sleep(2000);

	}

	@Test
	public void selenium() throws Exception {

		driver.get("https://www.selenium.dev");
		Thread.sleep(2000);

	}

	@Test
	public void googleSelenium() throws Exception {

		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Pondicherry"+Keys.ENTER);


	}

	@Test
	public void googletest() throws Exception {

		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Arun"+Keys.ENTER);


	}

	@Test
	public void googletechlearn() throws Exception {

		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("techlearn.in"+Keys.ENTER);


	}

	@Test
	public void googletestBeng() throws Exception {

		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Bengaluru"+Keys.ENTER);


	}


}


