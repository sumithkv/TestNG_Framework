package testTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

public class MultiBrowserParallelTesting {

	protected WebDriver driver;

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("##### MultiBrowserParallelTesting Suite Started #####");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("##### MultiBrowserParallelTesting Suite Finished #####");
	}

	@BeforeTest
	@Parameters({ "browser" })
	public void beforeTest(String browser) {
		System.out.println("Test Started in browser: " + browser.toUpperCase());
		BrowserLaunch bl = new BrowserLaunch();
		driver = bl.setWebDriver(browser);
	}

	@AfterTest
	@Parameters({ "browser" })
	public void afterTest(String browser) {
		driver.quit();
		System.out.println("Test Stopped in browser: " + browser.toUpperCase());
	}

	@Test
	public void testMethod() throws Exception {
		System.out.println("...Test_Method_Started...");
		driver.get("file:///D:/Tech%20Docs/Python/Python%20Tutorials/Python%20-%20HTML/index.html");
		System.out.println("The webpage title is... " + driver.getTitle());
		System.out.println("...Test_Method_Finished...");
	}

}
