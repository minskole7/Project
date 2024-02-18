package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	public static WebDriver driver = null;
	
	@BeforeSuite
	public  void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriverNew\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterSuite
	public  void closeBrowser() {
		driver.close();
	}

}
