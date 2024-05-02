package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CoursePage {
    public CoursePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
//    @FindBy(xpath = "//div[@class='MuiListItemIcon-root css-1f8bwsm']//preceding::li[@class='MuiListItem-root MuiListItem-gutters MuiListItem-padding sc-hLBbgP kzZhbr css-1yo8bqd']")
//    public  WebElement myCourseButton;
    @FindBy(xpath = "//img[@src=\"https://studymatebucket.s3.eu-central-1.amazonaws.com/jpg/17140180559911593790719_51-p-krasivii-fon-dlya-intro-61.jpg\"]")
    public WebElement olyaCourse;

    @FindBy(xpath = "//p[text()='Test_lessons']")
    public WebElement testLessons;

    @FindBy(xpath = "(//a[@href=\"/student/courses/17/materials/31/video\"])[2]")
    public WebElement videoLessons;

    @FindBy(xpath = "//p[text()='Test-one-video']")
    public WebElement video;

   @FindBy(xpath = "//iframe[@src=\"https://www.youtube.com/embed/TgvO3Gjfg9w\"]")
   public WebElement iframe;
    @FindBy(css ="[class=\"ytp-large-play-button ytp-button ytp-large-play-button-red-bg\"]")
    public WebElement videoPlayButton;

    @FindBy(css = "[d=\"M11 8.64331L18.5429 1.10042C18.9334 0.709893 19.5666 0.709893 19.9571 1.10042L20.8996 2.04287C21.2901 2.4334 21.2901 3.06656 20.8996 3.45708L13.3567 11L20.8996 18.5429C21.2901 18.9334 21.2901 19.5666 20.8996 19.9571L19.9571 20.8995C19.5666 21.2901 18.9334 21.2901 18.5429 20.8995L11 13.3566L3.45711 20.8995C3.06659 21.2901 2.43342 21.2901 2.0429 20.8995L1.10045 19.9571C0.709923 19.5666 0.709924 18.9334 1.10045 18.5429L8.64334 11L1.10045 3.45708C0.709923 3.06656 0.709923 2.43339 1.10045 2.04287L2.0429 1.10042C2.43343 0.709892 3.06659 0.709893 3.45711 1.10042L11 8.64331Z\"]")
    public WebElement closeVideo;
}
