package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.auxiliar.POMBase;

public class LoginPage extends POMBase {

    @FindBy(id = "exampleInputEmail")
    WebElement emailInput;

    @FindBy(id = "exampleInputPassword")
    WebElement passwordInput;

    @FindBy(xpath = "//a[contains(@class,'btn-primary')]")
    WebElement registerAccountButton;

    @FindBy(xpath = "//a[contains(@class,'btn-google')]")
    WebElement registerWithGoogleButton;

    @FindBy(xpath = "//a[contains(@class,'btn-facebook')]")
    WebElement registerWithFacebookButton;

    public LoginPage (WebDriver driver) {
        super(driver);
    }

    public void sendEmail (String email) {
        sendKeys(emailInput, email);
    }

    public void sendPassword (String password) {
        sendKeys(passwordInput, password);
    }

    public void clickLoginButton() {
        clickElement(registerAccountButton);
    }

    public void clickGoogleButton() {
        clickElement(registerWithGoogleButton);
    }

    public void clickFacebookButton() {
        clickElement(registerWithFacebookButton);
    }

    public void userLogin(String email, String password) {
        sendEmail(email);
        sendPassword(password);
        clickLoginButton();
    }

}
