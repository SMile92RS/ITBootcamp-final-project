package projekatDemoQA.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import projekatDemoQA.PropertiesReader;
import projekatDemoQA.pages.Droppable;

import java.time.Duration;

public class TestDroppable {

    private WebDriver webDriver;
    private Droppable droppable;
    private Object actions;



    @BeforeMethod
    public void configure() {
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));
        webDriver = new ChromeDriver();
        droppable = new Droppable(webDriver);

        webDriver.get("https://demoqa.com/droppable");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));





    }


    //closing test
   /* @AfterMethod
    public void closeWebDriver() {
        webDriver.close();

    }*/


}
