package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseTest;

public class testClass extends BaseTest{
	
	@Test(enabled = false)
	public static void TestOne() {
		driver.get("https://www.google.com");
		Assert.assertEquals("chinmay","ram") ;
	}
	
	@Test
	public static void FileUpload() {
		driver.get("https://webdriveruniversity.com/File-Upload/index.html?filename=Unit.pdf");
		String file_path = "C:\\Users\\LENOVO\\eclipse-workspace\\seleniumpom\\src\\test\\java\\files\\Unit.pdf";
		WebElement  fileInput = driver.findElement(By.id("myFile"));	
		fileInput.sendKeys(file_path);
		driver.findElement(By.id("submit-button")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String txt = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Assert.assertEquals("Your file has now been uploaded!", txt);
		
	}
	

}
