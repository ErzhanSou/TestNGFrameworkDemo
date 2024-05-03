package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CoursePage;
import pages.LogInPage;
import utilities.Driver;

import java.time.Duration;

public class VideoTest {
    LogInPage logInPage;
    CoursePage coursePage;
    JavascriptExecutor js;
    WebDriver driver;
    WebDriverWait wait;


    @BeforeSuite
    public void beforePreparation(){
        driver = Driver.getDriver();
        coursePage = new CoursePage();
        logInPage = new LogInPage();
        js = (JavascriptExecutor) driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @BeforeTest
    public void beforeRun(){
        driver.get("https://codewise.studymate.us/login");
        logInPage.setLogin("pakolhapak@gmail.com", "Codewise123");

    }

    @Test (priority = 1)
    public void goToCourse(){
        coursePage.goToCoursePage(coursePage.olyaCourse);
    }

    @Test (priority = 2)
    public void testVideo(){
        wait.until(ExpectedConditions.elementToBeClickable(coursePage.testLessons)).click();
        coursePage.videoLessons.click();
        js.executeScript("window.scrollBy(0,200)");
        wait.until(ExpectedConditions.elementToBeClickable(coursePage.video)).click();
        driver.switchTo().frame(coursePage.iframe);
        driver.manage().window().fullscreen();
        wait.until(ExpectedConditions.elementToBeClickable(coursePage.videoPlayButton)).click();
        driver.switchTo().parentFrame();
        coursePage.closeVideo.click();
        driver.manage().window().minimize();
    }

}
