package junittutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DemoBasic {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
  
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}
    @Disabled
	@Test
	void Google() {
		driver.get("https://www.google.com/");
	}
    @Disabled  // this disabled method used for Disabled the testcase
	@Test
	void Facebook() {
		driver.get("https://www.facebook.com/");
	}
    
    @Disabled
	@Test
	void X() {
		driver.get("https://www.x.com/");
	}
    
    @Disabled
	@Test
	void Zomato() {
		driver.get("https://www.zomato.com/");
	}
    
    @Ignore // ignore istha work kadhu becauese this annotation is used in junit3&4 and 
               // now we are using disabled annotation for disabled the testcase 
	@Test
	void Techlearn() {
		driver.get("https://www.techlearn.in/");
	}
    
    @Test
	void Swiggy() {
		driver.get("https://www.swiggy.com/");
	}

}
