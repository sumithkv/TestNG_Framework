package myTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class GroupTest {

	@BeforeClass(groups = { "DataBase", "Smoke", "Regression" })
	public void beforeClass() {
		System.out.println("+++++ Before Class for Group Test +++++");
	}

	@AfterClass(groups = { "DataBase", "Smoke", "Regression" })
	public void afterClass() {
		System.out.println("+++++ After Class for Group Test +++++");
	}

	@Test(groups = "Smoke")
	public void f1() {
		System.out.println("SMOKE --- 1111111111111111111");
	}

	@Test(groups = "Regression")
	public void f2() {
		System.out.println("REGRESSION --- 22222222222222222222");
	}

	@Test(groups = "DataBase")
	public void f3() {
		System.out.println("DATABASE --- 3333333333333333333");
	}

	@Test(groups = "Smoke")
	public void f4() {
		System.out.println("SMOKE --- 44444444444444444444");
	}

	@Test(groups = "Regression")
	public void f5() {
		System.out.println("REGRESSION --- 555555555555555555555");
	}
}
