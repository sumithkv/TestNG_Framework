package testTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class IncludeExcludeMethods {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("---- Test Started -----");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("---- Test Finished -----");
	}

	@Test
	public void m1() {
		System.out.println("***** Running Method One *****");
	}

	@Test
	public void m2() {
		System.out.println("***** Running Method Two *****");
	}

	@Test
	public void m3() {
		System.out.println("***** Running Method Three *****");
	}

	@Test
	public void m4() {
		System.out.println("***** Running Method Four *****");
	}

	@Test
	public void m5() {
		System.out.println("***** Running Method Five *****");
	}

}
