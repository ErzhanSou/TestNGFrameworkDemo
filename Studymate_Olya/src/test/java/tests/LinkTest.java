package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.LinksPage;
import utilities.Driver;

import java.time.Duration;
import java.util.Set;

public class LinkTest {
    WebDriver driver;
    LinksPage linksPage;
    WebDriverWait wait;

    @BeforeSuite
    public void beforeTest() {
        driver = Driver.getDriver();
        linksPage = new LinksPage();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    @Test (priority = 1)
    public void testLik(){
        wait.until(ExpectedConditions.elementToBeClickable(linksPage.link)).click();
        String mainWindowHandle = driver.getWindowHandle();
        wait.until(ExpectedConditions.elementToBeClickable(linksPage.linkAtlasobscura)).click();

        Set<String> windows = driver.getWindowHandles();
        for (String windowHandle: windows){
            if (!windowHandle.equals(mainWindowHandle)){
                driver.switchTo().window(mainWindowHandle);
            }
        }

    }
}