package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CoursePage;
import pages.LinksPage;
import pages.LogInPage;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.util.Set;

public class LinkTest {
    LogInPage logInPage;
    CoursePage coursePage;
    JavascriptExecutor js;
    WebDriver driver;
    LinksPage linksPage;

    @BeforeMethod
    public void beforeTest() {
        driver = Driver.getDriver();
//        coursePage = new CoursePage();
//        logInPage = new LogInPage();
//
//        js = (JavascriptExecutor) driver;
//        driver.get("https://codewise.studymate.us/login");
//
//        logInPage.login.sendKeys("pakolhapak@gmail.com");
//        logInPage.password.sendKeys("Codewise123");
//        logInPage.submitButton.click();
//        coursePage.olyaCourse.click();
//        coursePage.testLessons.click();
    }
    @Test
    public void testLik(){
        linksPage = new LinksPage();
        SeleniumUtils.waitForSeconds(3);
        linksPage.link.click();
        String mainWindowHandle = driver.getWindowHandle();

        linksPage.link1.click();

        SeleniumUtils.waitForSeconds(3);
        Set<String> windows = driver.getWindowHandles();
        for (String windowHandle: windows){
            if (!windowHandle.equals(mainWindowHandle)){
                driver.switchTo().window(mainWindowHandle);
            }
        }

    }
}