package testng.attributestest;

import org.testng.annotations.Test;

public class DescriptionAndTimeOut {

    @Test(description = "This is an example of how the attribute description works")
    public void testCases1() {
        System.out.println("Description attribute example !!!");
    }

    @Test(timeOut = 2000)
    public void testCases2() {
        try{
            Thread.sleep(3000);
        } catch (InterruptedException exception) { }
    }

}
