package testng.listeners.isuitelistener;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuiteListener implements ISuiteListener {

    public void onStart(ISuite suite) {
        System.out.println("--> Method on Start " + suite.getName());
    }

    public void onFinish(ISuite suite) {
        System.out.println("--> Method on Finish " + suite.getName());
    }

}
