package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CoursePage;
import pages.LogInPage;
import utilities.Driver;
import utilities.SeleniumUtils;

public class VideoTest {
    LogInPage logInPage;
    CoursePage coursePage;
    JavascriptExecutor js;
    WebDriver driver;

    @BeforeMethod
    public void beforeTest(){
        driver = Driver.getDriver();
        coursePage = new CoursePage();
        logInPage = new LogInPage();

        js = (JavascriptExecutor) driver;
        driver.get("https://codewise.studymate.us/login");

        logInPage.login.sendKeys("pakolhapak@gmail.com");
        logInPage.password.sendKeys("Codewise123");
        logInPage.submitButton.click();
        coursePage.olyaCourse.click();
        coursePage.testLessons.click();
    }
    @Test
    public void testVideo(){

//        coursePage.myCourseButton.click();
        coursePage.videoLessons.click();
        js.executeScript("window.scrollBy(0,200)");
        SeleniumUtils.waitForSeconds(4);
        coursePage.video.click();
        SeleniumUtils.waitForSeconds(4);
        driver.switchTo().frame(coursePage.iframe);
        driver.manage().window().fullscreen();
        SeleniumUtils.waitForSeconds(3);
        coursePage.videoPlayButton.click();
        SeleniumUtils.waitForSeconds(10);
        driver.switchTo().parentFrame();
        coursePage.closeVideo.click();
        driver.manage().window().minimize();

    }

}
