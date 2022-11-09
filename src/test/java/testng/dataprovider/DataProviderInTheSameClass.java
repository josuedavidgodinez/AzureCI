package testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInTheSameClass {

    @Test(dataProvider = "data-provider")
    public void dataProviderExample(String text) {
        System.out.println("Parameter passed by the Data provider is: " + text);
    }

    @DataProvider(name = "data-provider")
    public Object[][] dataProvider() {
        return new Object[][] {{"First-Value"}, {"Second-Value"}, {"Third-Value"}};
    }

}
