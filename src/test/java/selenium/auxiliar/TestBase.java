package selenium.auxiliar;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.logging.Level;
import java.util.logging.Logger;


public class TestBase {

    public ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static final String APPLICATION_URL = "http://localhost:8081/login.html";

    public static final String APPLICATION_URL2 = "https://www.w3schools.com/bootstrap/tryit.asp?filename=trybs_dropdown-menu&stacked=h";


    private final static Logger LOGGER = Logger.getLogger(TestBase.class.getName());

    public ExtentSparkReporter htmlReporter;
    public ExtentReports report;
    public ExtentTest test;

    @BeforeMethod(alwaysRun = true)
    public void initDriver() {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("window")) {
                System.setProperty("webdriver.chrome.driver", "resources/windows_chromedriver.exe");
            } else if (System.getProperty("os.name").toLowerCase().contains("mac")) {
                System.setProperty("webdriver.chrome.driver", "resources/mac_chromedriver");
            } else {
                System.setProperty("webdriver.chrome.driver", "resources/linux_chromedriver");
            }

            ChromeOptions options = new ChromeOptions();
            options.addArguments("test-type");
            options.addArguments("disable-popup-blocking");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--headless");

            driver.set(new ChromeDriver(options));

            this.getDriver().get(APPLICATION_URL);
        }catch (Exception e) {
            LOGGER.log(Level.WARNING, e.getMessage());
        }
    }

    @BeforeTest
    public void startReport() {
        htmlReporter = new ExtentSparkReporter("target/reports/TestsResults.html");
        report = new ExtentReports();
        report.attachReporter(htmlReporter);

        htmlReporter.config().setDocumentTitle("SwissContact - Extent Report Demo");
        htmlReporter.config().setReportName("Test Report");
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
    }

    public WebDriver getDriver() {
        return this.driver.get();
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver(ITestResult result) {
        try {
            if (this.getDriver() != null) this.getDriver().quit();

            if(result.getStatus() == ITestResult.FAILURE) {
                test.log(Status.FAIL,result.getThrowable());
            }
            else if(result.getStatus() == ITestResult.SUCCESS) {
                test.log(Status.PASS, result.getTestName());
            }
            else {
                test.log(Status.SKIP, result.getTestName());
            }

        } catch (Exception e) {
            LOGGER.log(Level.WARNING, e.getMessage());
        }
    }

    @AfterTest
    public void cleanReport() {
        report.flush();
    }

}
