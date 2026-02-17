package screenshots;

import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTest {
	WebDriver driver;

	public void GetScreenshot() throws IOException {
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		Date date = new Date();
		String time = dateformat.format(date);

		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\OM PRAKASH\\Documents\\Lib\\screenshots\\loginPage.png"));
	}


	//  @Test
	//  public void capture() throws IOException, InterruptedException {
	//	  try {
	//	  driver.get("https://www.techlearn.in/admin"); 
	//		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Charan");
	//		Thread.sleep(1500);
	//		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("Test@12345");
	//		Thread.sleep(1500);
	//		driver.findElement(By.xpath("//input[@id='rememberme'']")).click();
	//	  }
	//	  catch(Exception e) {
	//		  System.out.println("Tescase failed"+e);
	//		  GetScreenshot();
	//	  }
	//	  
	//	  
	//  }
	
	@Test
	public void Specific_Element() throws IOException {
		
//		driver.get("https://www.techlearn.in/admin"); 
//		WebElement element = driver.findElement(By.xpath("//*[@id=\"loginform\"]/p[1]/label"));
//		File f = element.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(f, new File("C:\\Users\\OM PRAKASH\\Documents\\Lib\\screenshots\\userName.png"));
//			driver.get("https://www.selenium.dev/");
//			Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
//			ImageIO.write(s.getImage(),"PNG", new File("C:\\Users\\OM PRAKASH\\Documents\\Lib\\screenshots\\fullSeleniumPage.png"));
//			Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	}
	
	
	
	
	
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
