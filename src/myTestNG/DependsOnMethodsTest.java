package myTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class DependsOnMethodsTest {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("<<<<< Before Method for DEPENDENCY Test >>>>>");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("<<<<< After Method for DEPENDENCY Test >>>>>");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println(">>>>> Before Clasee for DEPENDENCY Test <<<<<");
    }

    @AfterClass
    public void afterClass() {
        System.out.println(">>>>> After Clasee for DEPENDENCY Test <<<<<");
    }
    
    @Test
    public void greater() {
        System.out.println(".....EXECUTING GREATER METHOD.....");
        
        Assert.fail("????? Failing this Test ?????");
        
    }
    @Test
    public void lesser() {
        System.out.println(".....EXECUTING LESSER METHOD.....");
    }
    
  
  @Test (dependsOnMethods = "greater")
  public void add() {
      
      System.out.println("DEPENDS ON ***GREATER***METHOD");
  }
  @Test (dependsOnMethods = "lesser")
  public void sub() {
      
      System.out.println("DEPENDS ON ***LESSER*** METHOD");
  } 
  @Test (dependsOnMethods = {"greater", "lesser"})
  public void mul() {
      System.out.println("DEPENDS ON BOTH OF THE METHODS");
  } 
  @Test
  public void div() {
      System.out.println("DEPENDS ON NONE OF THE METHODS");
  } 
   
}
