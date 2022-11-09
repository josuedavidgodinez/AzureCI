package cucumber.stepdefinition;

import cucumber.hooks.ShareData;
import cucumber.pages.CreateAccountActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterAccount {

    private ShareData shareData;
    private CreateAccountActions createAccountPOMActions;

    public RegisterAccount(ShareData shareData){
        this.shareData = shareData;
        createAccountPOMActions =  new CreateAccountActions(shareData.webDriver, shareData.webDriverWait);
    }

    @Given("a user reach the page {string}")
    public void aUserReachThePage(String url) {
        shareData.webDriver.get(url);
    }

    @When("the user fills the firstname value with {string}")
    public void theUserFillsTheFirstnameValueWith(String firstnameText) {
        createAccountPOMActions.fillFirstName(firstnameText);
    }

    @And("the user fills the lastname field with {string}")
    public void theUserFillsTheLastnameFieldWith(String lastnameText) {
        createAccountPOMActions.fillLastName(lastnameText);
    }

    @And("the user fills the email field with {string}")
    public void theUserFillsTheEmailFieldWith(String emailText) {
        createAccountPOMActions.fillEmail(emailText);
    }

    @And("the user fills the password field with {string}")
    public void theUserFillsThePasswordFieldWith(String passwordText) {
        createAccountPOMActions.fillPassword(passwordText);
    }

    @And("the user fills the Repeat password field with {string}")
    public void theUserFillsTheRepeatPasswordFieldWith(String repeatPasswordText) {
        createAccountPOMActions.fillRepeatPassword(repeatPasswordText);
    }

    @And("the user cicks the register account button")
    public void theUserCicksTheRegisterAccountButton() {
        createAccountPOMActions.clickRegisterButton();
    }

    @Then("the user should be redirected to {string}")
    public void theUserShouldBeRedirectedTo(String expectedUrl) {
        final String currentUrl = createAccountPOMActions.getCurrentPageUrl();
        if(!currentUrl.contains(expectedUrl)){
            Assert.fail("The url was not the expected :(");
        }
    }
}
