package testng.listeners.itestlistener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ITestListeners.class)
public class TestClass {

    @Test  //Success Test
    public void addTwoNumbers() {
        int result = 5 + 15;
        Reporter.log("Transaction completed successful");
    }

    @Test //Failed Test
    public void textCompare() {
        Assert.assertEquals("failtest", "FAILTEST", "String are in different Case");
    }
    private int i = 0;

    @Test (successPercentage = 80, invocationCount = 3)
    public void failingWithinSuccess() {
        i++;
        System.out.println("i:" + i);
        if(i < 2){
            Assert.assertEquals(i , i);
        } else {
            Assert.fail(i + " !> 2");
        }
    }

    @Test  // Skip Test
    public void skipTest() {
        throw new SkipException("Skipping The Test Method ");
    }

}
