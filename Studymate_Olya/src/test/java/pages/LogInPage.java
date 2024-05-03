package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public class LogInPage {
    static WebDriver driver = Driver.getDriver();
    public LogInPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "input[id=':r0:']")
    public WebElement login;

    @FindBy(css = "input[id=':r1:']")
    public WebElement password;

    @FindBy(css = "button[type='submit']")
    public WebElement submitButton;

    public void setLogin(String inputLogin, String inputPassword){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(login)).sendKeys(inputLogin);
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(inputPassword);
        submitButton.click();
    }

}
