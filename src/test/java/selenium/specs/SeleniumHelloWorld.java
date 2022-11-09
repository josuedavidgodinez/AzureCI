package selenium.specs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumHelloWorld {

    //@Test
    public void seleniumFirstTestCase() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8081/login.html");

        WebElement emailInput = driver.findElement(By.id("exampleInputEmail"));
        emailInput.sendKeys("example_email@test.com");

        WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password']"));
        passwordInput.sendKeys("12345");

        WebElement loginButton = driver.findElement(By.xpath("//a[contains(@class, 'btn-primary')]"));
        loginButton.click();

        driver.close();
    }


}
