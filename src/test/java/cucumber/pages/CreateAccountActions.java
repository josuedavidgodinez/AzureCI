package cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountActions extends  CreateAccountPage{

    private WebDriver driver;
    private WebDriverWait wait;

    public CreateAccountActions(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    public void createAccountProcess(){
        fillFirstName("default");
        fillLastName("default");
        fillEmail("default@gmail.com");
        fillPassword("default");
        fillRepeatPassword("default");
        clickRegisterButton();
    }

    public void fillFirstName(String text){
        wait.until(ExpectedConditions.visibilityOf(firstName)).sendKeys(text);
    }

    public void fillLastName(String text){
        wait.until(ExpectedConditions.visibilityOf(lastName)).sendKeys(text);
    }

    public void fillEmail(String text){
        wait.until(ExpectedConditions.visibilityOf(email)).sendKeys(text);
    }

    public void fillPassword(String text){
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(text);
    }

    public void fillRepeatPassword(String text){
        wait.until(ExpectedConditions.visibilityOf(rPassword)).sendKeys(text);
    }

    public void clickRegisterButton(){
        wait.until(ExpectedConditions.visibilityOf(registerBtn)).click();
    }

    public String getCurrentPageUrl(){
        return  driver.getCurrentUrl();
    }
}

