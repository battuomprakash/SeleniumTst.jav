package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class LogReports {
	WebDriver driver;
  @Test
  public void log4j() {
	  Logger log= Logger.getLogger("Google Search");
	  PropertyConfigurator.configure("Log4j.properties");
	  
	  driver = new ChromeDriver();
	  log.info("opened broswer");
	  driver.manage().window().maximize();
	  log.info("maximized");
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("scroll(0,3500)");
  
  }
}


