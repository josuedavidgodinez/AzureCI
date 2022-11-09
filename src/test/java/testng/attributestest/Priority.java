package testng.attributestest;

import org.testng.annotations.Test;

public class Priority {

    @Test(priority = 20)
    public void TestCase1() {
     System.out.println("Test case 1 was executed");
    }

    @Test(priority = 30)
    public void TestCase2() {
        System.out.println("Test case 2 was executed");
    }

    @Test(priority = 10)
    public void TestCase3() {
        System.out.println("Test case 3 was executed");
    }

}
