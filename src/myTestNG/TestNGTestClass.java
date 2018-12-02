package myTestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNGTestClass {

	@BeforeTest
	public void beforeTest() {
		System.out.println("\n" + "##### Started the TESTS #####" + "\n");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("\n" + "##### Stopped the TESTS #####" + "\n");
	}

}
