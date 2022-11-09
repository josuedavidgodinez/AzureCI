package testng.dataprovider;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InheritedDataProvider {

    @Test(dataProvider = "two-numbers-addup", dataProviderClass = DataProviders.class)
    public void twoNumbersAddUpValidation (int num1, int num2, int result) {
        int total = num1 + num2;
        Assert.assertEquals(result, total);
    }

}
