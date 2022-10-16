package projekatDemoQA.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import projekatDemoQA.PropertiesReader;
import projekatDemoQA.pages.Buttons;

import java.time.Duration;

public class TestButtons {

    private WebDriver webDriver;
    private Buttons buttons;
    private Object actions;


    @BeforeMethod
    public void configure() {
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));
        webDriver = new ChromeDriver();
        buttons = new Buttons(webDriver);

        webDriver.get("https://demoqa.com/elements");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));



    }

            //test about double click on element
    @Test
    public void doubleClickOnElement(){
        buttons.buttonsMenuClick();

        Actions actions = new Actions(webDriver);
        actions.doubleClick(buttons.doubleClickButton).perform();
        Assert.assertTrue(buttons.resultText().getText().contains("You have done a double click"), "it should display 'You have done a double click' ");

    }


                    //test about right click on element
    @Test
    public void rightClickOnElement(){
        buttons.buttonsMenuClick();
        Actions actions = new Actions(webDriver);
        actions.contextClick(buttons.rightClickButton).perform();
        Assert.assertTrue(buttons.resultText2().getText().contains("You have done a right click"), "it should display 'You have done a right click' ");

    }

            //test about click on element
    @Test
    public void clickOnElement(){
        buttons.buttonsMenuClick();
        buttons.singleClickButtonClick();
        Assert.assertTrue(buttons.resultText3().getText().contains("You have done a dynamic click"), "it should display 'You have done a dynamic click' ");
    }

    //closing test
    @AfterMethod
    public void closeWebDriver() {
        webDriver.close();

    }
}
