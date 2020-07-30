package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		//System.out.println("Test execution is start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("i successfully executed Listeners pass code");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("i failed executed Listeners failed code" +result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("");
	}

	@Override
	public void onStart(ITestContext result) {
		System.out.println("");
	}

}
