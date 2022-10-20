package projekatDemoQA.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public abstract class WebPage {

    protected WebDriver webDriver;

    public WebPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, webDriver);
    }

    public WebPage() {}
}
