package testng.dataprovider;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProviders {

    @DataProvider(name = "two-numbers-addup")
    public Object[][] twoNumbersAddUp(){
        return new Object[][] {{2,3,5}, {4,3,7}, {2,4,19}};
    }

    @DataProvider(name = "data-provider-with-parameter")
    public Object[][] dataProviderReceivingParameter(Method method) {
        switch (method.getName()) {
            case "add":
                return new Object[][] {{2,3,5}, {4,3,7}, {2,4,19}};
            case "subtract":
                return new Object[][] {{8,3,5}, {10,3,7}, {2,4,-1}};
        }

        return null;
    }

}
