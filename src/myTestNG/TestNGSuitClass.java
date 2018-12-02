package myTestNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGSuitClass {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("\n" + "$$$$$ Started the SUIT $$$$$" + "\n");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("\n" + "$$$$$ Stopped the SUIT $$$$$" + "\n");
	}

}
