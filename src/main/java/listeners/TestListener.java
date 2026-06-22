package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import reports.ExtentManager;
import reports.ExtentTestManager;
import utilities.ScreenshotUtil;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        ScreenshotUtil.captureScreenshot(
                result.getName());
        ExtentTestManager.getTest()
        .log(Status.FAIL, result.getThrowable());
    }
    
    @Override
    public void onTestStart(ITestResult result) {

        ExtentTestManager.setTest(
            ExtentManager.getExtentReport()
            .createTest(result.getMethod().getMethodName())
        );
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        ExtentTestManager.getTest()
            .log(Status.PASS, "Test Passed");
    }

    @Override
    public void onFinish(org.testng.ITestContext context) {

        ExtentManager.getExtentReport().flush();
    }
}
