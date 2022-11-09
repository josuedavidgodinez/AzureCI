import LoginPage from "./LoginPage";

class LoginPageActions extends LoginPage {

    fillEmail() {
        this.getLoginInput().type("test");
    }

    fillPassword() {
        this.getPasswordInput().type("test123pass");
    }

    clickLogin() {
        this.getLoginButton().click();
    }

    loginProcess() {
        this.fillEmail();
        this.fillPassword();
        this.clickLogin();
    }


}

export default LoginPageActions;