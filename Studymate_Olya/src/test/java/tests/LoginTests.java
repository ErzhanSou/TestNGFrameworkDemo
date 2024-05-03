package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LogInPage;
import utilities.Config;
import utilities.Driver;

public class LoginTests {
    static LogInPage loginPage = new LogInPage();
    static WebDriver driver = Driver.getDriver();

    @BeforeMethod
    public void before (){
        driver.get(Config.getProperty("studymade"));
    }

    @Test
    public void successfulLoginTest(){
        loginPage.setLogin("kalambekova.b@gmail.com", "030200aikol");
        String expectedUrl = "https://codewise.studymate.us/student";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test
    public void caseInsensitivity (){
        loginPage.setLogin("KalamBekova.b@gmail.com", "030200aikol");
        String expectedUrl = "https://codewise.studymate.us/student";
        Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));
    }
    //negative scenario

    @Test
    public void invalidUserName (){
        loginPage.setLogin("KalamBekova@gmail.com", "030200aikol");
        Assert.assertTrue(loginPage.invalidUserName.isDisplayed());
    }
    //negative
    @Test
    public void emptyPasswordField(){
        loginPage.login.sendKeys(Config.getProperty("bakuEmail"));
        loginPage.submitButton.click();
        Assert.assertTrue(loginPage.passwordIsRequired.isDisplayed());
    }

}
