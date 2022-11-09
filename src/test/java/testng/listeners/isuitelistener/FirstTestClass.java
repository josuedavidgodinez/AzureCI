package testng.listeners.isuitelistener;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FirstTestClass {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This method runs before suite");
    }

    @Test
    public void testCase() {
        System.out.println("Test case was executed");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This method runs after suite");
    }

}
