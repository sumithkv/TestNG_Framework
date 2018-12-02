package myTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class CalculatorDataProviderTest {
  
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("=====BEFORE METHOD=====");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("=====AFTER METHOD=====");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("=====BEFORE CLASS=====");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("=====AFTER CLASS=====");
    }

  
  @Test (dataProviderClass = TestNGdataProviderClass.class, dataProvider = "dataAdd")
  public void addNumbers(int a, int b, int c) {
      
      Calculator cal1 = new Calculator();
      System.out.println("Adding " + a + " & " + b + "... Result is : " + c);
      Assert.assertEquals(cal1.add(a, b), c);
  }
  
  @Test (dataProviderClass = TestNGdataProviderClass.class, dataProvider = "dataMul")
  public void mulNumbers(int a, int b, int c) {
      
      Calculator cal1 = new Calculator();
      System.out.println("Multiplying " + a + " & " + b + "... Result is : " + c);
      Assert.assertEquals(cal1.mult(a, b), c, "MULTIPLICATION FAILED");
  }
  
  @Test (dataProviderClass = TestNGdataProviderClass.class, dataProvider = "dataMsg")
  public void printMessage(String m) {
     
      Calculator cal1 = new Calculator();
      System.out.println(cal1.msg(m));
  }
  
}
