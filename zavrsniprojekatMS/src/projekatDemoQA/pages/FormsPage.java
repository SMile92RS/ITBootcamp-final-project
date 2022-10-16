package projekatDemoQA.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsPage {

    private FormsPage formsPage;

    private WebDriver webDriver;



    public FormsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this);
    }


    //logo
    @FindBy (xpath = "//header/a[1]/img[1]")
    private WebElement logoToolsQa;


                    //forms section
    @FindBy (xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/div[1]")
    private WebElement formsSection;


            //practice form submenu
    @FindBy (xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]")
    private WebElement practiceFormSubMenu;

                                        //click on command

    //logo
    public void directionFromFormsPageToLogoToolsQaClick(){logoToolsQa.click();}

    //section forms
    public void formsSectionClick(){formsSection.click();}

    //practice forms submenu
    public void practiceFormSubMenuClick(){practiceFormSubMenu.click();}



}
