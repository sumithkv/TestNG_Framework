package myTestNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;

public class TestNGGroupClass {
    
    @BeforeGroups(groups = "Smoke")
    public void smokeSetUp() {
        System.out.println("@@@@@ Smoke Test Begins @@@@@");
    }
 
    @AfterGroups(groups = "Smoke")
    public void smokeTearDown() {
        System.out.println("@@@@@ Smoke Test Ends @@@@@");
    }
    @BeforeGroups(groups = "Regression")
    public void regressionSetUp() {
        System.out.println("@@@@@ Regression Test Starts @@@@@");
    }
 
    @AfterGroups(groups = "Regression")
    public void regressionTearDown() {
        System.out.println("@@@@@ Regression Test Ends @@@@@");
    }
    @BeforeGroups(groups = "DataBase")
    public void databaseSetUp() {
        System.out.println("@@@@@ DataBase Test Starts @@@@@");
    }
 
    @AfterGroups(groups = "DataBase")
    public void databaseTearDown() {
        System.out.println("@@@@@ DataBase Test Ends @@@@@");
    }
  
}
