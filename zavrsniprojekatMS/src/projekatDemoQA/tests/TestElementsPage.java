package projekatDemoQA.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import projekatDemoQA.PropertiesReader;
import projekatDemoQA.pages.ElementsPage;

public class TestElementsPage {

    private WebDriver webDriver;
    private ElementsPage elements;


    @BeforeMethod
    public void configure() {
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));
        webDriver = new ChromeDriver();
        elements = new ElementsPage(webDriver);

        webDriver.get("https://demoqa.com/elements");
        webDriver.manage().window().maximize();


    }

    //this test checking for logo link
    @Test
    public void directionFromElementsPageToLogoToolsQa() {
        elements.logoToolsQaClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/", "It should open https://demoqa.com/ url");
    }


    //content textbox
    @Test
    public void textBoxSubMenuContent() {
        elements.textBoxSubMenuClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/text-box", "It should open https://demoqa.com/text-box url");
    }

    //content checkbox
    @Test
    public void checkBoxMenuContent() {
        elements.checkBoxSubMenuClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/checkbox", "It should open https://demoqa.com/checkbox url");
    }

    //content radiobutton
    @Test
    public void radioButtonMenuContent() {
        elements.radioButtonSubMenuClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/radio-button", "It should open https://demoqa.com/radio-button url");
    }

    //content webtables
    @Test
    public void webTablesMenuContent() {
        elements.webTablesSubMenuClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/webtables", "It should open https://demoqa.com/webtables url");
    }

    //content buttons
    @Test
    public void buttonsMenuContent() {
        elements.buttonsbMenuClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/buttons", "It should open https://demoqa.com/buttons url");
    }

    //ISPOD DOLE MORA SKROL
    //links content
    @Test
    public void linksMenuContent() {
        elements.linksSubMenuCLick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/links", "It should open https://demoqa.com/links url");
    }

    //content broken link images
    @Test
    public void brokenLinksImagesMenuContent() {
        elements.brokenLinksImagesSubMenuClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/broken", "It should open https://demoqa.com/broken url");
    }

    //content upload and download
    @Test
    public void uploadAndDownloadMenuContent() {
        elements.uploadAndDownloadSubMenuClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/upload-download", "It should open https://demoqa.com/upload-download url");
    }

    //content dynamic properties
    @Test
    public void dynamicPropertiesMenuContent() {
        elements.dynamicPropertiesSubMenuClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/dynamic-properties", "It should open https://demoqa.com/dynamic-properties url");
    }


    //closing test
   /* @AfterMethod
    public void closeWebDriver() {
        webDriver.close();

    }*/
     }



