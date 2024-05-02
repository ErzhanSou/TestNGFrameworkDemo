package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SdetNurzPage {
    public SdetNurzPage() {

        Driver.getDriver();
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath="//div[text()='SDET_NURZ']")
    public WebElement sdet_nurz;
    @FindBy(xpath="//p[text()='Lesson-one']")
    public WebElement lesson;
    @FindBy(xpath="//a[@href='/student/courses/15/materials/34/task']")
    public WebElement task;
    @FindBy(xpath="//div[@class='sc-iWOQzb UgwiX']")
    public  WebElement homeAssignment;

    @FindBy(xpath="//div[@class='MuiFormControl-root MuiTextField-root css-1jsik9j']/following::button")
    public WebElement updateButton;
    @FindBy(xpath="//p[@class='PlaygroundEditorTheme__paragraph']")
    public WebElement inputField;
    @FindBy(xpath="//button[text()='Submit']")
    public WebElement submitButton;
    @FindBy(xpath ="//input[@name='comments']")
    public WebElement comments;


    public void taskMethod(String input, String comment) throws InterruptedException {
        sdet_nurz.click();
        Thread.sleep(2000);
        lesson.click();
        Thread.sleep(2000);
        task.click();
        homeAssignment.click();
        Thread.sleep(2000);
        updateButton.click();
        Thread.sleep(2000);
        inputField.sendKeys(input);
        comments.sendKeys(comment);
        submitButton.click();

    }



}
