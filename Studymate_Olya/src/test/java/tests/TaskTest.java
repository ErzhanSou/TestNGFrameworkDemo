package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CoursePage;
import pages.LogInPage;
import pages.TaskPage;
import utilities.Driver;

import java.time.Duration;

public class TaskTest {
    WebDriver driver;
    LogInPage loginPage;
    TaskPage sdetNurzPage;
    CoursePage coursePage;
    WebDriverWait wait;

    @BeforeSuite
    public void beforePreparation() {
        driver = Driver.getDriver();
        loginPage = new LogInPage();
        sdetNurzPage = new TaskPage();
        coursePage = new CoursePage();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

//    @BeforeTest
//    public void beforeRun() {
//        driver.get("https://codewise.studymate.us/login");
//        loginPage.setLogin("ab.nurzada@gmail.com", "12345678");
//    }
    @Test (priority = 1)
    public void goToCourse() {
        wait.until(ExpectedConditions.elementToBeClickable(coursePage.goToBackCourses)).click();
        coursePage.goToCoursePage(coursePage.sdet_nurz);
    }

    @Test (priority = 2)
    public void taskTest() {
        wait.until(ExpectedConditions.elementToBeClickable(coursePage.lesson)).click();
        wait.until(ExpectedConditions.elementToBeClickable(coursePage.task)).click();
        wait.until(ExpectedConditions.elementToBeClickable(coursePage.homeAssignment)).click();
        wait.until(ExpectedConditions.elementToBeClickable(coursePage.updateButton)).click();
    }

    @Test (priority = 3)
    public void inputsComments() {
        sdetNurzPage.taskMethod("This is the input", "This is the comment");
    }

    @Test (priority = 4)
    public void checkText() {
        WebElement message = driver.findElement(By.xpath("//div[@class='sc-hjsNop eydhlT']"));
        Assert.assertTrue(message.isDisplayed());
    }

}
