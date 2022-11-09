package cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage {

    @FindBy(id = "exampleFirstName")
    protected WebElement firstName;

    @FindBy(id = "exampleLastName")
    protected WebElement lastName;

    @FindBy(xpath = "//input[contains(@type,'email')]")
    protected WebElement email;

    @FindBy(xpath = "//input[contains(@placeholder,'Password')]")
    protected WebElement password;

    @FindBy(css = "#exampleRepeatPassword")
    protected WebElement rPassword;

    @FindBy(xpath = "//a[contains(text(),'Register Account')]")
    protected WebElement registerBtn;

}
