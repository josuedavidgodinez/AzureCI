class LoginPage {

    getLoginInput() {
        return cy.get("#exampleInputEmail");
    }

    getPasswordInput() {
        return cy.get("#exampleInputPassword");
    }

    getLoginButton() {
        return cy.get(".btn-primary");
    }

}

export default LoginPage;