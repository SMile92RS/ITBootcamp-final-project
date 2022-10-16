package projekatDemoQA.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import projekatDemoQA.PropertiesReader;
import projekatDemoQA.pages.ElementsPage;
import projekatDemoQA.pages.TextBox;

import java.time.Duration;

public class TestTextBox {
    private WebDriver webDriver;
    private TextBox textBox;


    @BeforeMethod
    public void configure() {
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));
        webDriver = new ChromeDriver();
        textBox = new TextBox(webDriver);

        webDriver.get("https://demoqa.com/elements");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));


    }

    //this test checking for logo link
    @Test
    public void directionFromElementsPageToLogoToolsQa() {
        textBox.logoToolsQaClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/", "It should open https://demoqa.com/ url");
    }


                        //not finished
                //in this test...there is checked and filled textbox form
    @Test
    public void filledTextBox(){
        textBox.textBoxSubMenuClick();
        textBox.userNameTextBox.sendKeys("Pera Peric");
        textBox.userEmailTextBox.sendKeys("pera.peric@yahoo.com");
        textBox.currentAddressTextBox.sendKeys("Current address numb. 23");
        textBox.permanentAddressTextBox.sendKeys("Permanent address numb. 007");

                            //scroll

textBox.scrollToSumbitButtonOnTextBox();

                            //ovo se konstruise u text box i poziva se ovdje
       // WebElement element = webDriver.findElement(By.id("submit"));
       // ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);


        textBox.submitTextBoxClick();

        //probjeriti submit ocekivani i pravi rezultati



    }
    //closing test
  /*  @AfterMethod
    public void closeWebDriver() {
        webDriver.close();
    }*/
}
