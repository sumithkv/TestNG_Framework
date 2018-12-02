package testTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoadAndPerformanceTesting {

	@Test(invocationCount = 20, threadPoolSize = 5)
	public void loadTest() {

		System.setProperty("webdriver.gecko.driver", "D:\\Workspace\\MyStudy_Space\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println("Page Title is " + driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
		driver.quit();

	}

}
