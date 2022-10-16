package projekatDemoQA.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import projekatDemoQA.PropertiesReader;
import projekatDemoQA.pages.FormsPage;
import projekatDemoQA.pages.PracticeForm;

public class TestPracticeForm {


    private WebDriver webDriver;
    private PracticeForm practiceForm;


    @BeforeMethod
    public void configure() {
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));
        webDriver = new ChromeDriver();
        practiceForm = new PracticeForm(webDriver);

        webDriver.get("https://demoqa.com/forms");
        webDriver.manage().window().maximize();
    }

    //this test checking for logo link
    @Test
    public void directionFromFormsPageToLogoToolsQaClick() {
        practiceForm.logoToolsQaClick();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://demoqa.com/", "It should open https://demoqa.com/ url");
    }

    //this test is about all fields filled in practice form
    @Test
    public void allFieldsFilledPracticeForm() throws InterruptedException {
        practiceForm.practiceFormSubMenuClick();
        practiceForm.firstNamePracticeForm.sendKeys("Pera");
        practiceForm.lastNamePracticeForm.sendKeys("Peric");
        practiceForm.userEmailPracticeForm.sendKeys("pera@peric.com");
        practiceForm.maleGenderRadioButtonPracticeFormClick();
        practiceForm.userNumberPracticeForm.sendKeys("1234567890");

            //CALENDAR

        practiceForm.dateOfBirthInputPracticeFormClick();

        practiceForm.yearOfBirthInputPracticeFormClick();



        practiceForm.subjectPracticeForm.sendKeys("predmet");
        practiceForm.sportsPracticeFormClick();
        practiceForm.readingPracticeFormClick();
        practiceForm.musicPracticeFormClick();
    }



    //closing test
   /* @AfterMethod
    public void closeWebDriver() {
        webDriver.close();

    }*/
}
