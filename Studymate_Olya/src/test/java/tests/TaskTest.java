package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.SdetNurzPage;
import utilities.Driver;

public class TaskTest {
    WebDriver driver;
    LogInPage loginPage;
    SdetNurzPage sdetNurzPage;

    @BeforeMethod
    public void before() {
        driver = Driver.getDriver();
//        driver.get("https://codewise.studymate.us/login");
        loginPage = new LogInPage();
//        loginPage.login.sendKeys("ab.nurzada@gmail.com");
//        loginPage.password.sendKeys("12345678");
//        loginPage.submitButton.click();
        sdetNurzPage = new SdetNurzPage();

    }

    @Test
    public void task() throws InterruptedException {
        sdetNurzPage.taskMethod("This is the input", "This is the comment");

        WebElement message = driver.findElement(By.xpath("//div[@class='sc-hjsNop eydhlT']"));
        Assert.assertTrue(message.isDisplayed());
    }


}
