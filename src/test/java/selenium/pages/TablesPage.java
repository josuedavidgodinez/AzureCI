package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.auxiliar.POMBase;

import java.util.List;

public class TablesPage extends POMBase {

    @FindBy(xpath = "//tr/td[count(//th[contains(text(),'Age') and @class='sorting']/preceding-sibling::*) + 1]")
    List<WebElement> agesList;

    public TablesPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getAgesList() {
        return agesList;
    }

}
