package AnnodationDemo;

import org.testng.*;


/**
 * Created by muthuselvan on 5/14/17.
 */
public class TestListener implements IInvokedMethodListener,ITestListener {


    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("Before Invocation ....>>>");
        System.out.println("before invocation of " + method.getTestMethod().getMethodName());
                AbstractTestSession testSession = TestSessionFactory.newInstance(method);
        InvokedMethodInformation methodInfo = TestNGUtils.getInvokedMethodInformation(method, testResult);
        testSession.initializeTestSession(methodInfo);

    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("After Invocation....?????");
    }

//    @Override
//    public void onExecutionStart() {
//        System.out.println("Notify by mail that TestNG is going to start ...]");
//    }
//
//    @Override
//    public void onExecutionFinish() {
//        System.out.println("Notify by mail, TestNG is finished");
//    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart.....");

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart - context");
//        AbstractTestSession testSession = TestSessionFactory.newInstance(method);
//        InvokedMethodInformation methodInfo = TestNGUtils.getInvokedMethodInformation(method, testResult);
//        testSession.initializeTestSession(methodInfo);
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish - context");
    }
}
