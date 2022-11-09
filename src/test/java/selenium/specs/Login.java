package selenium.specs;

import org.testng.annotations.Test;
import selenium.auxiliar.TestBase;
import selenium.pages.LoginPage;

public class Login extends TestBase {

    @Test
    public void userLogin() {
        LoginPage loginPage = new LoginPage(this.getDriver());

        loginPage.sendEmail("test@test.com");
        loginPage.sendPassword("123");
        loginPage.clickLoginButton();

    }

}
