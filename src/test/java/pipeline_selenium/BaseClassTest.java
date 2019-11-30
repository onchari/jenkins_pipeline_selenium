package pipeline_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClassTest {
   public WebDriver driver;
	
  
    @BeforeTest
    public void launchBrowser() {
  	 WebDriverManager.chromedriver().setup();
  	 driver = new ChromeDriver();
		 driver.manage().window().maximize();
    }
 
    @AfterTest
    public void afterTest() {
    	 driver.quit();
    }
    
}
