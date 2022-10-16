package projekatDemoQA.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import projekatDemoQA.PropertiesReader;
import projekatDemoQA.pages.HomePage;

public class TestHomePage {

    private WebDriver webDriver;
    private HomePage homePage;


    @BeforeMethod
    public void configure() {
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));
        webDriver = new ChromeDriver();
        homePage = new HomePage(webDriver);

        webDriver.get("https://demoqa.com/");
        webDriver.manage().window().maximize();


    }

    //this test checking for logo link
    @Test
    public void directionFromHomePageToLogoToolsQa() {
        homePage.logoToolsQaClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/", "It should open https://demoqa.com/ url");
    }

    //this test checking direction for element page
    @Test
    public void directionFromHomePageToElementsPage() {
        homePage.elementsPageLinkClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/elements", "It should open https://demoqa.com/elements url");
    }

    //this test checking direction for forms page
    @Test
    public void directionFromHomePageToFormsPage() {
        homePage.formsPageLinkClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/forms", "It should open https://demoqa.com/forms url");
    }

    //this test checking direction for alerts frames & windows page
    @Test
    public void directionFromHomePageToAlertsFrameWindowsPage() {
        homePage.alertsFrameWindowsPageLinkClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/alertsWindows", "It should open https://demoqa.com/alertsWindows url");
    }

    //this test checking direction for widgets page
    @Test
    public void directionFromHomePageToWidgetsPage() {
        homePage.widgetsLinkClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/widgets", "It should open https://demoqa.com/widgets url");
    }

    //this test checking direction for interacrions page
    @Test
    public void directionFromHomePageToInteractionsPage() {
        homePage.interactionsClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/interaction", "It should open https://demoqa.com/interaction url");
    }


    //this test checking direction for book store application page including scroll
    @Test
    public void directionFromHomePageToBookStoreApplication() {
        homePage.scrollToBookStoreApplicationLink();
        homePage.bookStoreApplicationClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/books", "It should open https://demoqa.com/books url");
    }


    //closing test
    @AfterMethod
    public void closeWebDriver() {
        webDriver.close();

    }
}
