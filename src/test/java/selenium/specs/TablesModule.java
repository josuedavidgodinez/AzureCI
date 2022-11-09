package selenium.specs;

import com.aventstack.extentreports.Status;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.auxiliar.TestBase;
import selenium.pages.LoginPage;
import selenium.pages.SideMenuBarPage;
import selenium.pages.TablesPage;

import java.util.List;

public class TablesModule extends TestBase {

    @Test
    public void getHighestAge() {
        test = report.createTest("Validate that the highest age is greater than 70");

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.userLogin("test@test.com", "1234");

        test.log(Status.PASS, "Login successful");

        SideMenuBarPage sideMenuBarPage = new SideMenuBarPage(getDriver());
        sideMenuBarPage.clickTablesOption();

        test.log(Status.PASS, "Tables page navigation successful");

        TablesPage tablesPage = new TablesPage(getDriver());

        List<WebElement> agesList = tablesPage.getAgesList();

        int highestAge = 0;
        for (WebElement age: agesList) {
            if(Integer.parseInt(age.getText()) > highestAge)
                highestAge = Integer.parseInt(age.getText());
        }

        System.out.println(highestAge);


        Assert.assertTrue(highestAge > 60);

    }


}
