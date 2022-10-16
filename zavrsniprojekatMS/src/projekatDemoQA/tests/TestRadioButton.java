package projekatDemoQA.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import projekatDemoQA.PropertiesReader;
import projekatDemoQA.pages.RadioButton;

public class TestRadioButton {

    private WebDriver webDriver;
    private RadioButton radioButton;


    @BeforeMethod
    public void configure() {
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));
        webDriver = new ChromeDriver();
        radioButton = new RadioButton(webDriver);

        webDriver.get("https://demoqa.com/elements");
        webDriver.manage().window().maximize();


    }

    //this test checking for logo link
    @Test
    public void directionFromElementsPageToLogoToolsQa() {
        radioButton.logoToolsQaClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/", "It should open https://demoqa.com/ url");
    }

                    //click on radio button YES
    @Test
    public void clickOnYesRadioButton(){
        radioButton.radioButtonSubMenuClick();
        radioButton.yesRadioButtonClick();
        Assert.assertTrue(radioButton.resultText().getText().contains("You have selected Yes"));

    }

    //click on radio button impressive
    @Test
    public void clickOnImpressiveRadioButton(){
        radioButton.radioButtonSubMenuClick();
        radioButton.impressiveRadioButtonClick();
        Assert.assertTrue(radioButton.resultText().getText().contains("You have selected Impressive"));

    }

    //closing test
 /*   @AfterMethod
    public void closeWebDriver() {
        webDriver.close();
    }*/
}
