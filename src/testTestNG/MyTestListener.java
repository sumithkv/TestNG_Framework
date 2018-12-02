package testTestNG;

import java.util.List;
import java.util.Set;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class MyTestListener extends TestListenerAdapter {

	@Override
	public void onTestStart(ITestResult result) {

		super.onTestStart(result);

		System.out.println("----->> Started Test Instance : " + result.getInstanceName());
		System.out.println("----->> Started Test Method : " + result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult tr) {

		super.onTestSuccess(tr);

		System.out.println("----->> The Test Case: " + tr.getInstanceName() + " is PASSED");
		System.out.println("----->> Status of the Test is : " + tr.getStatus());
	}

	@Override
	public void onTestFailure(ITestResult tr) {

		super.onTestFailure(tr);

		System.out.println("----->> The Test Case: " + tr.getInstanceName() + " is FAILED");
		System.out.println("----->> Status of the Test is : " + tr.getStatus());

		// Here we can write method for taking screenshots
	}

	@Override
	public void onTestSkipped(ITestResult tr) {

		super.onTestSkipped(tr);

		System.out.println("----->> The Test Case: " + tr.getInstanceName() + " is SKIPPED");
		System.out.println("----->> Status of the Test is : " + tr.getStatus());
	}

	@Override
	public void onStart(ITestContext testContext) {

		super.onStart(testContext);

		System.out.println(
				"*************************************************************************************************");
		System.out.println("--------------->> Start Time: " + testContext.getStartDate());
		System.out.println("--------------->> Test SUITE Name is: " + testContext.getSuite().getName());
		System.out.println("--------------->> Test TEST Name is: " + testContext.getName());
		System.out.println(
				"*************************************************************************************************");
	}

	@Override
	public void onFinish(ITestContext testContext) {

		super.onFinish(testContext);

		System.out.println(
				"*************************************************************************************************");
		System.out.println("--------------->> Number of Passed Tests: " + testContext.getPassedTests().size());
		System.out.println("--------------->> Number of Failed Tests: " + testContext.getFailedTests().size());
		System.out.println("--------------->> Number of Skipped Tests: " + testContext.getSkippedTests().size());

		System.out.println("--------------->> Included Groups: " + testContext.getIncludedGroups());
		System.out.println("--------------->> Excluded Groups: " + testContext.getExcludedGroups());

		System.out.println("&&&&& PASSED TEST NAMES &&&&&");

		Set<ITestResult> s = testContext.getPassedTests().getAllResults();

		int i = 0;
		for (ITestResult r : s) {
			i++;
			System.out.println(i + ": " + r.getInstanceName());
		}

		System.out.println("&&&&& FAILED TEST NAMES &&&&&");

		Set<ITestResult> f = testContext.getFailedTests().getAllResults();

		int j = 0;
		for (ITestResult r : f) {
			j++;
			System.out.println(j + ": " + r.getInstanceName());
		}

		System.out.println("--------------->> Finish Time: " + testContext.getEndDate());
		System.out.println(
				"*************************************************************************************************");

	}

	@Override
	public List<ITestResult> getPassedTests() {

		return super.getPassedTests();
	}

	@Override
	public List<ITestResult> getFailedTests() {

		return super.getFailedTests();
	}

	@Override
	public List<ITestResult> getSkippedTests() {

		return super.getSkippedTests();
	}

	@Override
	public void beforeConfiguration(ITestResult tr) {

		super.beforeConfiguration(tr);
	}

	@Override
	public void onConfigurationSuccess(ITestResult itr) {

		super.onConfigurationSuccess(itr);
	}

	@Override
	public void onConfigurationFailure(ITestResult itr) {

		super.onConfigurationFailure(itr);
	}

	@Override
	public void onConfigurationSkip(ITestResult itr) {

		super.onConfigurationSkip(itr);
	}

}
