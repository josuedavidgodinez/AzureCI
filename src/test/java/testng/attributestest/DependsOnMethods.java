package testng.attributestest;

import org.testng.annotations.Test;

public class DependsOnMethods {

    @Test(timeOut = 1000)
    public void testCases1() {
        try{
            Thread.sleep(500);
        } catch (InterruptedException exception) {}
        System.out.println("Test Cases 1 PASS");
    }

    @Test(dependsOnMethods = "testCases1")
    public void testCases2() {
        System.out.println("This test will be executed only if the method testCases1 PASS");
    }

}
