package dis_ena_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerificationMethodsonElements {
	WebDriver driver;

	@Test
	public void isDisplayedMethod() {
		driver.get("https://www.techlearn.in/admin");
		
		boolean lyp = driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).isDisplayed();
		
		if(lyp==true)
		{
			System.out.println("Lost your password links is Displayed in login page");
			driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).click();
		}
		
		else
		{
			System.out.println("Lost your password links is NOT Displayed in login page");
		}
		
		
	}
	
	
	@Test
	public void isEnabledMethod() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(3000);
		boolean email = driver.findElement(By.xpath("//*[@id=\"user_login\"]")).isEnabled();
		
		if(email==true)
		{
			System.out.println("Username or Email text box is enabled to enter the email");
			driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("omprakash");
		}
		
		else
		{
			System.out.println("Username or Email text box is Not enabled to enter the email");
	
		}
		
		
	}
	
	
	@Test
	public void isSelectedMethod() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		Thread.sleep(2000);

		boolean check = driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).isSelected();
		
		if(check==true)
		{
			System.out.println("Rememeber Me Check box is Selected");
		}
		
		else
		{
			System.out.println("Rememeber Me Check box is NOT Selected");
		}
		
		
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
