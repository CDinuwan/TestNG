package testng;

import org.testng.annotations.*;

public class AnnotationConfiguration {

    @Test
    public void searchCustomer(){
        System.out.println("Search For Customer");
    }
    @Test
    public void searchProduct(){
        System.out.println("Search For Product");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Open Chrome");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("Close Chrome");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Chrome-Set Up System Property");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("Chrome-Clean Up Cookies");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Open Test Application");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Close Test Application");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Sign In");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("Sign Out");
    }
}
