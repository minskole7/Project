package common;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.testUtils;

public class Listeners extends testUtils implements ITestListener {
	
	@Override
    public void onTestStart(ITestResult result) {
        System.out.println("Staring -----");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Ending -----");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Failed-------");
        getScreenshot();
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Skipped -------");
    }



	
	
	
}
