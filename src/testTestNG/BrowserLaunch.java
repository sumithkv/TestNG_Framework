package testTestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch {

	protected WebDriver driver;

	protected WebDriver setWebDriver(String Browser) {

		if (Browser.equalsIgnoreCase("firefox"))

		{
			System.setProperty("webdriver.gecko.driver", "D:\\Workspace\\MyStudy_Space\\Drivers\\geckodriver.exe");
			FirefoxProfile fp = new FirefoxProfile();
			fp.setPreference("browser.startup.homepage", "http://google.co.in");
			driver = new FirefoxDriver(fp);
		}

		else if (Browser.equalsIgnoreCase("ie32"))

		{
			System.setProperty("webdriver.ie.driver",
					"D:\\Workspace\\MyStudy_Space\\Drivers\\IE32\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		else if (Browser.equalsIgnoreCase("ie64"))

		{
			System.setProperty("webdriver.ie.driver",
					"D:\\Workspace\\MyStudy_Space\\Drivers\\IE64\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		else if (Browser.equalsIgnoreCase("chrome"))

		{
			System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\MyStudy_Space\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else {
			System.out.println("The Specified Browser Does Not Exists...");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.MINUTES);

		return driver;
	}

}
