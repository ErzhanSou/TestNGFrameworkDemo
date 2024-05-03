package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import utilities.Driver;

import java.time.Duration;

public class TaskPage {
    static WebDriver driver = Driver.getDriver();
    CoursePage coursePage = new CoursePage();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    public TaskPage() {
        PageFactory.initElements(driver, this);
    }

    public void taskMethod(String input, String comment){
        wait.until(ExpectedConditions.elementToBeClickable(coursePage.inputField)).sendKeys(input);
        wait.until(ExpectedConditions.elementToBeClickable(coursePage.comments)).sendKeys(comment);
        wait.until(ExpectedConditions.elementToBeClickable(coursePage.submitButton)).click();
    }
}
