package projekatDemoQA.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import projekatDemoQA.PropertiesReader;
import projekatDemoQA.pages.Buttons;
import projekatDemoQA.pages.CheckBox;

import java.time.Duration;

public class TestCheckBox {

    private WebDriver webDriver;
    private CheckBox checkBox;
    private Object actions;


    @BeforeMethod
    public void configure() {
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));
        webDriver = new ChromeDriver();
        checkBox = new CheckBox(webDriver);

        webDriver.get("https://demoqa.com/checkbox");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

            //This test testing all expand and collapse buttons(plus, minus, checkboxes)
    @Test
    public void expandAndCollapse() throws InterruptedException {
        checkBox.expandAllClick();


        Thread.sleep(1000);
        checkBox.scrollToHomeField();
        Thread.sleep(1000);

        checkBox.collapseAllClick();
        Thread.sleep(500);
        checkBox.expandHomeClick();
        Thread.sleep(500);
        checkBox.expandDesktopClick();
        Thread.sleep(500);
        checkBox.expandDocumentsClick();
        Thread.sleep(500);
        checkBox.expandWorkSpaceClick();
        Thread.sleep(500);
        checkBox.expandOfficeClick();
        Thread.sleep(500);
        checkBox.expandDownloadsClick();
        Thread.sleep(500);

                    //checking boxes
        checkBox.getCheckBoxExcelFileClick();
        Thread.sleep(500);
        checkBox.getCheckBoxWordFileClick();
        Thread.sleep(500);
        checkBox.checkBoxDownloadsClick();
        Thread.sleep(500);
        checkBox.checkBoxDownloadsClick();
        Thread.sleep(500);
        checkBox.getCheckBoxGeneralClick();
        Thread.sleep(500);
        checkBox.getCheckBoxClassifiedClick();
        Thread.sleep(500);
        checkBox.getCheckBoxPrivateClick();
        Thread.sleep(500);
        checkBox.getCheckBoxPublicClick();
        Thread.sleep(500);
        checkBox.getCheckBoxOfficeClick();
        Thread.sleep(500);
        checkBox.getCheckBoxOfficeClick();
        Thread.sleep(500);
        checkBox.getCheckBoxVeuClick();
        Thread.sleep(500);
        checkBox.getCheckBoxAngularClick();
        Thread.sleep(500);
        checkBox.getCheckBoxReactClick();
        Thread.sleep(500);
        checkBox.getCheckWorkSpaceClick();
        Thread.sleep(500);
        checkBox.getCheckWorkSpaceClick();
        Thread.sleep(500);
        checkBox.checkBoxDocumentsClick();
        Thread.sleep(500);
        checkBox.checkBoxDocumentsClick();
        Thread.sleep(500);
        checkBox.getCheckBoxCommandsClick();
        Thread.sleep(500);
        checkBox.getCheckBoxNotesClick();
        Thread.sleep(500);
        checkBox.setCheckBoxDesktop();
        Thread.sleep(500);
        checkBox.setCheckBoxDesktop();
        Thread.sleep(500);

        checkBox.expandHomeClick();

    }


    //closing test
  /*  @AfterMethod
    public void closeWebDriver() {
        webDriver.close();

    }*/


}
