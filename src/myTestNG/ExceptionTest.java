package myTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ExceptionTest {
  
  @BeforeMethod
  public void beforeMethod() {
      System.out.println("***** Before Method for Exception Test *****");
  }

  @AfterMethod
  public void afterMethod() {
      System.out.println("***** After Test Method for Exception Test *****");
  }

  @BeforeClass
  public void beforeClass() {
      System.out.println("***** Before Class for Exception Test *****");
  }

  @AfterClass
  public void afterClass() {
      System.out.println("***** After Class for Exception Test *****");
  }
  
  @Test (expectedExceptions = IllegalArgumentException.class)
  public void test1() {
      Calculator myCal1 = new Calculator();
      
      myCal1.div(72, 36);
  }
  
  @Test (expectedExceptions = IllegalArgumentException.class)
  public void test2() {
      Calculator myCal2 = new Calculator();
      
      myCal2.div(24, 36);
  }
  
  @Test (expectedExceptions =ArithmeticException.class)
  public void test3() {
      Calculator myCal3 = new Calculator();
      
      myCal3.div(24, 36);
  }
  @Test (expectedExceptions = ArithmeticException.class)
  public void test4() {
      Calculator myCal4 = new Calculator();
      
      myCal4.div(24, 0);
  }
  @Test (expectedExceptions = {ArithmeticException.class, IllegalArgumentException.class})
  public void test5() {
      Calculator myCal5 = new Calculator();
      
      myCal5.div(-8, 0);
  }
  @Test (expectedExceptions = {ArithmeticException.class, IllegalArgumentException.class})
  public void test6() {
      Calculator myCal6 = new Calculator();
      
      myCal6.div(7, 2);
  }
}
