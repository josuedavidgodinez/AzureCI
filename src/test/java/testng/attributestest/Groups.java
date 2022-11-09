package testng.attributestest;

import org.testng.annotations.Test;

public class Groups {

    @Test(groups = {"regression", "smoke"})
    public void TestCase1() {
        System.out.println("Test case 1 is included for regression and smoke ");
    }

    @Test(groups = "smoke")
    public void TestCase2() {
        System.out.println("Test case 2 is included for smoke ");
    }

    @Test(groups = "regression")
    public void TestCase3() {
        System.out.println("Test case 3 is included for regression ");
    }

}
