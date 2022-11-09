package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.auxiliar.POMBase;

public class W3SchoolPage extends POMBase {

    @FindBy(xpath = "//button[contains(@class,'dropdown')]/..")
    WebElement dropDownButton;

    public W3SchoolPage (WebDriver driver) {
        super(driver);
    }

    public void selectDropDownOption (String option) {
        //clickElement(dropDownButton);
        dropDownButton.click();
        clickElement(this.driver.findElement(By.xpath("//li/a[contains(text(),'"+option+"')]")));
    }

}
