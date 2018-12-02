package myTestNG;

import org.testng.annotations.DataProvider;

public class TestNGdataProviderClass {
 
  @DataProvider (name = "dataAdd")
  public static Object[][] dataAdd() {
    return new Object[][] {{6,4,10},{16,44,2},{60,70,130},{1,2,2},{7,4,19},{100,11,111},};
  }
  
  @DataProvider (name = "dataMul")
  public static Object[][] dataMul() {
    Object[][] obj = new Object[4][3];
    
    obj[0][0] = 4;
    obj[0][1] = 5;
    obj[0][2] = 20;
    obj[1][0] = 10;
    obj[1][1] = 6;
    obj[1][2] = 60;
    obj[2][0] = 7;
    obj[2][1] = 3;
    obj[2][2] = 36;
    obj[3][0] = 0;
    obj[3][1] = 4;
    obj[3][2] = 0;
    
    return obj;
    };

  @DataProvider (name = "dataMsg")
  public static Object[][] dataMsg() {
    return new Object[][] {{"Welcome"},{"Thank You"}};
  }
}
