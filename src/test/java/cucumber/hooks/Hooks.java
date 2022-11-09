package cucumber.hooks;

import cucumber.auxiliar.CucumberDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hooks {

    private ShareData shareData;

    public Hooks(ShareData shareData) {
        this.shareData = shareData;
    }

    @Before
    public void initDriver() {
        CucumberDriver driver = new CucumberDriver();
        shareData.webDriver = driver.initDriver();
        shareData.webDriverWait = new WebDriverWait(shareData.webDriver, Duration.ofSeconds(5));
    }

    @After
    public void closeDriver() {
        shareData.webDriver.quit();
    }

}
