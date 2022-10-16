package projekatDemoQA.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeForm {

    private PracticeForm practiceForm;

    private WebDriver webDriver;



    public PracticeForm(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this);
    }

            //logo
    @FindBy (xpath = "//header/a[1]/img[1]")
    private WebElement logoToolsQa;

            //form section
    @FindBy (xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/div[1]")
    private WebElement formsSection;


    //practice form submenu
    @FindBy (xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]")
    private WebElement practiceFormSubMenu;

    //first name
    @FindBy (id = "firstName")
    public WebElement firstNamePracticeForm;

    //last name
    @FindBy (id = "lastName")
    public WebElement lastNamePracticeForm;

    //email
    @FindBy (id = "userEmail")
    public WebElement userEmailPracticeForm;

                    //genders
    //male
    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/div[1]/label[1]")
    private  WebElement maleGenderRadioButtonPracticeForm;

    //female
    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/div[2]/label[1]")
    private  WebElement femaleGenderRadioButtonPracticeForm;

    //other
    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/div[3]/label[1]")
    private  WebElement otherGenderRadioButtonPracticeForm;

    //userNumber
    @FindBy (id = "userNumber")
    public WebElement userNumberPracticeForm;

                //CALENDAR
    @FindBy (id = "dateOfBirthInput")
    public WebElement dateOfBirthInputPracticeForm;

    @FindBy (xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]")
    public WebElement yearOfBirthInputPracticeForm;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")
    public WebElement monthOfBirthInputPracticeForm;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]")
    public WebElement dayOfBirthInputPracticeForm;

    //subject
    @FindBy (xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]")
    public WebElement subjectPracticeForm;

            //HOBBIES
    //sports
    @FindBy (id = "hobbies-checkbox-1")
    private WebElement sportsPracticeForm;

    //reading
    @FindBy (id = "hobbies-checkbox-2")
    private WebElement readingPracticeForm;

    //music
    @FindBy (id = "hobbies-checkbox-3")
    private WebElement musicPracticeForm;


                            //SCROLL

    //currentAddress
    @FindBy (id = "currentAddress")
    private WebElement currentAddressPracticeForm;

                        //STATE
            //state
    @FindBy (id = "state")
    private WebElement statePracticeForm;

    //state ncr
    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[2]/div[1]/div[1]/div[1]/div[1]")
    private WebElement stateNCRPracticeForm;

    //state Uttar Pradesh
    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[2]/div[1]/div[1]/div[1]/div[1]")
    private WebElement stateUttarPradeshPracticeForm;

    //Haryana
    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[2]/div[1]/div[1]/div[1]/div[1]")
    private WebElement stateHaryanaPracticeForm;

    //Rajasthan
    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[2]/div[1]/div[1]/div[1]/div[1]")
    private WebElement stateRajasthanPracticeForm;

        //city
    @FindBy (id = "city")
    private WebElement cityPracticeForm;

    //city delhi
    @FindBy (xpath = "//div[contains(text(),'Delhi')]")
    private WebElement delhiCityPracticeForm;

    //cityGurgaon
    @FindBy (xpath = "//div[contains(text(),'Gurgaon')]")
    private WebElement gurgaonCityPracticeForm;

    //city noida
    @FindBy (xpath = "//div[contains(text(),'Noida')]")
    private WebElement noidaCityPracticeForm;



    //cityAgra
    @FindBy (xpath = "//div[contains(text(),'Agra')]")
    private WebElement agraCityPracticeForm;

    //cityLucknow
    @FindBy (xpath = "//div[contains(text(),'Lucknow')]")
    private WebElement lucknowCityPracticeForm;

    //Merrut
    @FindBy (xpath = "//div[contains(text(),'Merrut')]")
    private WebElement merrutCityPracticeForm;

    //city Karnal
    @FindBy (xpath = "//div[contains(text(),'Karnal')]")
    private WebElement karnalCityPracticeForm;

    //city Panipat
    @FindBy (xpath = "//div[contains(text(),'Panipat')]")
    private WebElement panipatCityPracticeForm;

    //city Jaipur
    @FindBy (xpath = "//div[contains(text(),'Jaipur')]")
    private WebElement jaipurCityPracticeForm;

    //city Jaiselmer
    @FindBy (xpath = "//div[contains(text(),'Jaiselmer')]")
    private WebElement jaiselmerCityPracticeForm;

    //submit button
    @FindBy (id = "submit")
    private WebElement submitButtonOnPracticeForm;








    //click on command

    //logo
    public void logoToolsQaClick(){logoToolsQa.click();}

    //section forms
    public void formsSectionClick(){formsSection.click();}

    //practice forms submenu
    public void practiceFormSubMenuClick(){practiceFormSubMenu.click();}


    //first name
    public void firstNamePracticeFormClick(){firstNamePracticeForm.click();}

    //last name
    public void lastNamePracticeFormClick(){lastNamePracticeForm.click();}

    //email
    public void emailPracticeFormClick(){userEmailPracticeForm.click();}


                    //Gender
    //male
    public void maleGenderRadioButtonPracticeFormClick(){maleGenderRadioButtonPracticeForm.click();}

    //female
    public void femaleGenderRadioButtonPracticeFormClick(){femaleGenderRadioButtonPracticeForm.click();}

    //other
    public void otherGenderRadioButtonPracticeFormClick(){otherGenderRadioButtonPracticeForm.click();}

    //mobile number
    public void userNumberPracticeFormClick(){userEmailPracticeForm.click();}

                            //  CALENDAr
            //date-menu
    public void dateOfBirthInputPracticeFormClick() {dateOfBirthInputPracticeForm.click();}

    //year
    public void yearOfBirthInputPracticeFormClick(){yearOfBirthInputPracticeForm.click();}

    //month
    public void monthOfBirthInputPracticeFormClick(){monthOfBirthInputPracticeForm.click();}


    //subject
    public void subjectPracticeFormClick(){subjectPracticeForm.click();}



                    //HOBBIES
    //sports
    public void sportsPracticeFormClick(){sportsPracticeForm.click();}

    //reading
    public void readingPracticeFormClick(){readingPracticeForm.click();}

    //music
    public void musicPracticeFormClick(){musicPracticeForm.click();}

                                    //SCROLL

    //upload picture

    //current adress
    public void currentAddressPracticeFormClick(){currentAddressPracticeForm.click();}

                        //state and city

    //          State
    public void statePracticeForm(){statePracticeForm.click();}

    //ncr
    public void stateNCRPracticeFormClick(){stateNCRPracticeForm.click();}

    //UttarPradesh
    public void stateUttarPradeshPracticeFormClick(){stateUttarPradeshPracticeForm.click();}

    //haryana
    public void stateHaryanaPracticeFormClick(){stateHaryanaPracticeForm.click();}

    //rajasthan
    public void rajasthanPracticeFormClick(){stateRajasthanPracticeForm.click();}


              //city

    //delhi click
    public void delhiCityPracticeFormClick(){delhiCityPracticeForm.click();}

    //gurgaon click
    public void gurgaonCityPracticeFormClick(){gurgaonCityPracticeForm.click();}

    //noida click
    public void noidaCityPracticeFormClick(){noidaCityPracticeForm.click();}

    //agra click
    public void agraCityPracticeFormClick(){agraCityPracticeForm.click();}

    //lucknow click
    public void lucknowCityPracticeFormClick(){lucknowCityPracticeForm.click();}

    //merrt
    public void merrutCityPracticeFormClick(){merrutCityPracticeForm.click();}

    //karnal
    public void karnalCityPracticeFormClick(){karnalCityPracticeForm.click();}

    //Panipat
    public void panipatCityPracticeFormClick(){panipatCityPracticeForm.click();}

    //jaipur   click
    public void jaipurCityPracticeFormClick(){jaipurCityPracticeForm.click();}

    //jaiselmer   click
    public void jaiselmerCityPracticeFormClick(){jaiselmerCityPracticeForm.click();}

    //submit
    public void SubmitButtonOnPracticeFormClick(){submitButtonOnPracticeForm.click();}



}
