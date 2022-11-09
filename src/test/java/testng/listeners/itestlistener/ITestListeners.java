package testng.listeners.itestlistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListeners implements ITestListener {

    public void onStart(ITestContext context) {
        System.out.println("--> onStart, method started");
    }

    public void onFinish(ITestContext context) {
        System.out.println("--> onFinish, method finished");
    }

    public void onTestStart(ITestResult result) {
        System.out.println("--> onTestStart, new test started" + result.getTestName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("--> onTestSuccess, test case" + result.getTestName() + " was executed successful");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("--> onTestFailure, test case" + result.getTestName() + " failed");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("--> onTestSkipped, test case " + result.getTestName() + " skipped");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("--> withinSuccessPercentage, test case " + result.getTestName());
    }



}
