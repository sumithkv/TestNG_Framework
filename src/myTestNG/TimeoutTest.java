package myTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TimeoutTest {
  
    @BeforeClass
    public void beforeClass() {
        System.out.println("***Before Class for Timeout Test***");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("***After Class for Timeout Test***");
    }
    
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("***Before Method for Timeout Test***");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("***Before Method for Timeout Test***");
    }

  
  @Test(timeOut = 5000) 
  public void timePassMethod() throws InterruptedException {
      Thread.sleep(4000);
  }

  @Test(timeOut = 1000)
  public void timeFailMethod() {
      while (true);
  }
}
