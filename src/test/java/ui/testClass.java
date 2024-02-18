package ui;
import static org.junit.Assert.assertArrayEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseTest;

public class testClass extends BaseTest{
	
	@Test
	public static void TestOne() {
		driver.get("https://www.google.com");
		Assert.assertEquals("chinmay","ram") ;
	}
	

}
