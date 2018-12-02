package myTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestMsg1 {
	@BeforeMethod
	public void beforeMethod() {

		System.out.println("...BEFORE METHOD of TestMsg.java...");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("...AFTER METHOD of TestMsg.java...");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("...BEFORE CLASS of TestMsg.java...");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("...AFTER CLASS of TestMsg.java...");
	}

	@Test
	public void testCalculatorMsg1() {
		Calculator cal1 = new Calculator();
		String msg = cal1.msg("Basic Calculator");
		String m1 = "Basic Calculator";
		Assert.assertEquals(msg, m1, "1st Test Method...");

	}

	@Test
	public void testCalculatorMsg2() {
		Calculator cal2 = new Calculator();
		String msg = cal2.msg("Scientific Calculator");
		String m1 = "Basic Calculator";
		Assert.assertNotEquals(msg, m1, "2nd Test Method...");
	}

}
