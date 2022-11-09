package cucumber.auxiliar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CucumberDriver {

    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;

    public WebDriver initDriver() {

        try{
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
            System.setProperty("webdriver.chrome.verboseLogging", "false");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("test-type");

            webDriver = new ChromeDriver(options);
            webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(5));

            return webDriver;
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Fail to initialize the driver.");
            return null;
        }

    }

}
