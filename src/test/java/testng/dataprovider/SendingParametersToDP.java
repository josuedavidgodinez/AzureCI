package testng.dataprovider;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SendingParametersToDP {

    @Test(dataProvider = "data-provider-with-parameter", dataProviderClass = DataProviders.class)
    public void add(int num1, int num2, int result) {
        int total = num1 + num2;
        Assert.assertEquals(result, total);

    }

    @Test(dataProvider = "data-provider-with-parameter", dataProviderClass = DataProviders.class)
    public void subtract(int num1, int num2, int result) {
        int total = num1 - num2;
        Assert.assertEquals(result, total);
    }

}
