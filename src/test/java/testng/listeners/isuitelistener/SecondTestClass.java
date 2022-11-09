package testng.listeners.isuitelistener;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SecondTestClass {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This method runs before suite, second test class");
    }

    @Test
    public void testCase() {
        System.out.println("Test case was executed, second test class");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This method runs after suite, second test class");
    }

}
