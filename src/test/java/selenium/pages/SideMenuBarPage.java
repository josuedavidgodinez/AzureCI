package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.auxiliar.POMBase;

public class SideMenuBarPage extends POMBase {

    @FindBy(xpath = "(//ul[@id='accordionSidebar']/a/div)[2]")
    WebElement homeOption;

    @FindBy(xpath = "//a[contains(@href,'tables')]")
    WebElement tablesOption;

    @FindBy(xpath = "//a[contains(@href,'charts')]")
    WebElement chartsOption;

    @FindBy(xpath = "//a[contains(@aria-controls,'Pages')]")
    WebElement pagesOption;

    @FindBy(xpath = "//a[contains(@aria-controls,'Utilities')]")
    WebElement utilitiesOption;

    @FindBy(xpath = "//a[contains(@aria-controls,'collapseTwo')]")
    WebElement componentsOption;

    public SideMenuBarPage (WebDriver driver) {
        super(driver);
    }

    public void clickTablesOption() {
        clickElement(tablesOption);
    }

}
