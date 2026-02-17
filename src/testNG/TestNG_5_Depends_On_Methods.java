package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class  TestNG_5_Depends_On_Methods  {
	WebDriver driver;

	@Test(dependsOnMethods  = "method2")
	public void method1()
	{
		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Sumanth");
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Kamdalur");
		driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).click();
	}
	
	@Test
	public void method2()
	{
		driver.get("https://www.techlearn.in/admin"); 

		
	}
	

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
