package myTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestMsg {
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

	@Test
	public void testCalculatorMsg3() {
		String m1 = "Sumith";
		String m2 = "Satheesh";
		String m3 = "Sumith";

		Assert.assertTrue(m1.equals(m3), "M1 and M2 are Not Equal");
		Assert.assertFalse(m1.equals(m2), "M1 and M3 are not Equal");
		Assert.assertTrue(m1.equals(m2), "M1 and M2 are Equal");
	}

}
