package testng.asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.fail;

public class HardAssertExample {

    @Test()
    public void upperCaseTest() {
        String actualResult = "Hard Assert";
        String expectedResult = "HARD ASSERT";

        try{
            Assert.assertEquals(actualResult, expectedResult, "Validation failed");
        } catch (AssertionError error) {
            System.out.println(error.getMessage());
            fail();
        }

        System.out.println("--> Hard Assertion");

    }

}
