import LoginPageActions from "../../pages/LoginPageActions";

describe("Validate User Login", ()=> {

    beforeEach("Open landing page", ()=> {
        cy.visit(Cypress.env('base_url'))
    })

    it("Validate that you can login to the application", ()=> {
        const loginPage = new LoginPageActions;
        loginPage.loginProcess();
        cy.url().should("include", "index.html")
    })

})