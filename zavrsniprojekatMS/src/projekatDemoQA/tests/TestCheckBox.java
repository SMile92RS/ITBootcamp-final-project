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
    public void expandAndCollapse() {
        checkBox.expandAllClick();


        Utils.sleepSeconds(1);
        checkBox.scrollToHomeField();
        Utils.sleepSeconds(1);

        checkBox.collapseAllClick();
        Utils.sleepSeconds(0.5);
        checkBox.expandHomeClick();
        Utils.sleepSeconds(0.5);
        checkBox.expandDesktopClick();
        Utils.sleepSeconds(0.5);
        checkBox.expandDocumentsClick();
        Utils.sleepSeconds(0.5);
        checkBox.expandWorkSpaceClick();
        Utils.sleepSeconds(0.5);
        checkBox.expandOfficeClick();
        Utils.sleepSeconds(0.5);
        checkBox.expandDownloadsClick();
        Utils.sleepSeconds(0.5);

                    //checking boxes
        checkBox.getCheckBoxExcelFileClick();
        Utils.sleepSeconds(0.5);
        checkBox.getCheckBoxWordFileClick();
        Utils.sleepSeconds(0.5);
        checkBox.checkBoxDownloadsClick();
        Utils.sleepSeconds(0.5);
        checkBox.checkBoxDownloadsClick();
        Utils.sleepSeconds(0.5);
        checkBox.getCheckBoxGeneralClick();
        Utils.sleepSeconds(0.5);
        checkBox.getCheckBoxClassifiedClick();
        Utils.sleepSeconds(0.5);
        checkBox.getCheckBoxPrivateClick();
        Utils.sleepSeconds(0.5);
        checkBox.getCheckBoxPublicClick();
        Utils.sleepSeconds(0.5);
        checkBox.getCheckBoxOfficeClick();
        Utils.sleepSeconds(0.5);
        checkBox.getCheckBoxOfficeClick();
        Utils.sleepSeconds(0.5);
        checkBox.getCheckBoxVeuClick();
        Utils.sleepSeconds(0.5);
        checkBox.getCheckBoxAngularClick();
        Utils.sleepSeconds(0.5);
        checkBox.getCheckBoxReactClick();
        Utils.sleepSeconds(0.5);
        checkBox.getCheckWorkSpaceClick();
        Utils.sleepSeconds(0.5);
        checkBox.getCheckWorkSpaceClick();
        Utils.sleepSeconds(0.5);
        checkBox.checkBoxDocumentsClick();
        Utils.sleepSeconds(0.5);
        checkBox.checkBoxDocumentsClick();
        Utils.sleepSeconds(0.5);
        checkBox.getCheckBoxCommandsClick();
        Utils.sleepSeconds(0.5);
        checkBox.getCheckBoxNotesClick();
        Utils.sleepSeconds(0.5);
        checkBox.setCheckBoxDesktop();
        Utils.sleepSeconds(0.5);
        checkBox.setCheckBoxDesktop();
        Utils.sleepSeconds(0.5);

        checkBox.expandHomeClick();

    }


    //closing test
  /*  @AfterMethod
    public void closeWebDriver() {
        webDriver.close();

    }*/


}
