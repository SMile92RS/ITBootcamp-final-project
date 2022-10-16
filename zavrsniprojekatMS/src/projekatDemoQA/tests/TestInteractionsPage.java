package projekatDemoQA.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import projekatDemoQA.PropertiesReader;
import projekatDemoQA.pages.Buttons;
import projekatDemoQA.pages.InteractionsPage;

import java.time.Duration;

public class TestInteractionsPage {

    private WebDriver webDriver;
    private InteractionsPage interactionsPage;
    private Object actions;


    @BeforeMethod
    public void configure() {
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));
        webDriver = new ChromeDriver();
        interactionsPage = new InteractionsPage(webDriver);

        webDriver.get("https://demoqa.com/interaction");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

    }

                    //sortable submenu checking
    @Test
    public void sortableSubMenu(){
        interactionsPage.scrollToInteractionsPageSection();
          interactionsPage.scrollToDraggable();
          interactionsPage.sortableSubMenuClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/sortable", "It should open https://demoqa.com/sortable url");
    }

    //selectable submenu checking
    @Test
    public void selectableSubMenu(){
        interactionsPage.scrollToInteractionsPageSection();
        interactionsPage.scrollToDraggable();
        interactionsPage.selectableSubMenuClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/selectable", "It should open https://demoqa.com/selectable url");
    }

    //resizable submenu checking
    @Test
    public void resizableSubMenu(){
        interactionsPage.scrollToInteractionsPageSection();
        interactionsPage.scrollToDraggable();
        interactionsPage.resizableSubMenuClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/resizable", "It should open https://demoqa.com/resizable url");
    }

    //droppable submenu checking
    @Test
    public void dropabbleSubMenu(){
        interactionsPage.scrollToInteractionsPageSection();
        interactionsPage.scrollToDraggable();
        interactionsPage.droppableSubMenuClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/droppable", "It should open https://demoqa.com/droppable url");
    }

    //dragabble submenu checking
    @Test
    public void dragabbleSubMenu(){
        interactionsPage.scrollToInteractionsPageSection();
        interactionsPage.scrollToDraggable();
        interactionsPage.dragabbleSubMenuClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/dragabble", "It should open https://demoqa.com/dragabble url");
    }

    //closing test
   /* @AfterMethod
    public void closeWebDriver() {
        webDriver.close();

    }*/
}
