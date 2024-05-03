package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LinksPage {
    public LinksPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(css = "[href=\"/student/courses/17/materials/31/link\"]")
    public WebElement link;

    @FindBy(css = "[href=\"https://www.atlasobscura.com/\"]")
    public WebElement linkAtlasobscura;
}
