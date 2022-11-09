package testng.asserts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test
    public void upperCaseTest() {
        SoftAssert softAssert = new SoftAssert();

        String actualResult = "Soft Assert";
        String expectedResult = "SOFT ASSERT";

        softAssert.assertEquals(actualResult, expectedResult);

        System.out.println("--> Soft Assertion");

        softAssert.assertAll();

    }

}
