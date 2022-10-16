package projekatDemoQA.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import projekatDemoQA.PropertiesReader;
import projekatDemoQA.pages.ElementsPage;
import projekatDemoQA.pages.FormsPage;

public class TestFormsPage {

    private WebDriver webDriver;
    private FormsPage formsPage;


    @BeforeMethod
    public void configure() {
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));
        webDriver = new ChromeDriver();
        formsPage = new FormsPage(webDriver);

        webDriver.get("https://demoqa.com/forms");
        webDriver.manage().window().maximize();


    }

    //this test checking for logo link
    @Test
    public void directionFromFormsPageToLogoToolsQaClick() {
        formsPage.directionFromFormsPageToLogoToolsQaClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/", "It should open https://demoqa.com/ url");
    }

            //practice forms section
    @Test
    public void practiceFormSubMenuContentCLick(){
        formsPage.practiceFormSubMenuClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/automation-practice-form", "It should open https://demoqa.com/automation-practice-form url");
    }

    //closing test
 /*   @AfterMethod
    public void closeWebDriver() {
        webDriver.close();}*/



}
