package selenium.auxiliar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class POMBase {

    private final Logger LOGGER;

    protected WebDriver driver;

    protected WebDriverWait webDriverWait;

    protected int TIMEOUT_VALUE = 3;

    public POMBase(WebDriver driver) {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(this.driver, Duration.ofSeconds(TIMEOUT_VALUE));
        PageFactory.initElements(new AjaxElementLocatorFactory(this.driver, TIMEOUT_VALUE), this);
        LOGGER = Logger.getLogger(this.getClass().getName());
    }

    public void clickElement(WebElement element) {
        try{
            webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
            scrollIntoView(element);
            element.click();
        } catch(Exception e){
            LOGGER.log(Level.WARNING, e.getMessage());
        }
    }

    public void sendKeys(WebElement element, String text) {
        try{
            webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
            scrollIntoView(element);
            element.clear();
            element.sendKeys(text);
        } catch(Exception e){
            LOGGER.log(Level.WARNING, e.getMessage());
        }
    }

    public void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) this.driver)
                .executeScript("arguments[0].scrollIntoView({ block : 'center'});", element);
    }


}
