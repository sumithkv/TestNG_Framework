package myTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class DataProviderTest {
  
  @BeforeMethod
  public void beforeMethod() {
      System.out.println("^^^^^BEFORE METHOD^^^^^");
  }

  @AfterMethod
  public void afterMethod() {
      System.out.println("^^^^^AFTER METHOD^^^^^");
  }
  @BeforeClass
  public void beforeClass() {
      System.out.println("^^^^^BEFORE CLASS^^^^^");
  }
  @AfterClass
  public void afterClass() {
      System.out.println("^^^^^AFTER CLASS^^^^^");
  }

  @DataProvider (name = "testDataProvider")
  public Object[][] testDataProvider() {
    return new Object[][] {
       { 1, "Sumith", 33333 }, { 2, "Suyog", 66666 },{ 3, "Saurabh", 99999 }, { 4, "Deepak", 44444 }, { 5, "Bageesh", 77777 }
    };
  }
  
  @Test(dataProvider = "testDataProvider")
  public void myFunction(int a, String b, int c) {
      
      System.out.println(a + " : "  + b + " : " + c);
  }
  
}
