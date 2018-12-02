package myTestNG;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ParameterTest {
 
  @BeforeMethod
  public void beforeMethod() {
      System.out.println("~~~~~ BEFORE METHOD ~~~~~");
  }

  @AfterMethod
  public void afterMethod() {
      System.out.println("~~~~~ AFTER METHOD ~~~~~");
  }

  @BeforeClass
  public void beforeClass() {
      System.out.println("~~~~~ BEFORE CLASS ~~~~~");
  }

  @AfterClass
  public void afterClass() {
      System.out.println("~~~~~ AFTER CLASS ~~~~~");
  }
  
  @Test
  @Parameters({ "num1", "num2", "num3" })
  public void divNumbers(int num1, int num2, int num3) {
      
      Calculator cal = new Calculator();
      System.out.println("Division Operation Using Parameters... " + "Usning " + num1 + " & " + num2 + " & " + num3);
      Assert.assertEquals(cal.div(num1, num2), num3);
      
  }
  @Test
  @Parameters({ "num1", "num2", "num3" })
  public void compareNumbers(int num1, int num2, int num3) {
      System.out.println("Checking Num1 < Num2... ");
      
      Assert.assertTrue(num1 < num2, "Num1 < Num2");
  }
  
  @Test
  @Parameters({ "num1", "num2", "num3" })
  public void sameHeap(int num1, int num2, int num3) {
      System.out.println("To verify that Num1 and Num2 pointing to same Heap... ");
      num1 = num3;
      num2 = num3;
      Assert.assertSame(num1, num2, "Num1 = Num2");
      
  }

}
