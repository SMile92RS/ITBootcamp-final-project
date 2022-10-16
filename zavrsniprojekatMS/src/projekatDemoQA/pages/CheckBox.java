package projekatDemoQA.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class CheckBox {
    private CheckBox checkBox;

    private WebDriver webDriver;



    public CheckBox(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this);
    }

    //findby WEB ELEMENt

    //logo
    @FindBy(xpath = "//header/a[1]/img[1]")
    private WebElement logoToolsQa;

    //expand all via plus
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/button[1]")
    public WebElement expandAll;

    //collapse
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/button[2]")
    private WebElement collapseAll;

    //expand home
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/button[1]/*[1]")
    private WebElement expandHome;

    //expand desktop
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/button[1]/*[1]")
    private  WebElement expandDesktop;

    //expand documents
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/button[1]/*[1]")
    private  WebElement expandDocuments;

    //expand downloads
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/span[1]/button[1]/*[1]")
    private  WebElement expandDownloads;

    //expand workspae
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/span[1]/button[1]/*[1]")
    private WebElement expandWorkSpace;

    //expand office
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/span[1]/button[1]/*[1]")
    private WebElement expandOffice;

    //checkBoxHome
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]")
    private WebElement checkBoxHome;

    //checkBoxDesktop
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]")
    private WebElement checkBoxDesktop;

    //checkBoxDocuments
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[1]")
    private WebElement checkBoxDocuments;

    //checkBoxDownloads
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/span[1]/label[1]/span[1]/*[1]")
    private WebElement checkBoxDownloads;

    //checkBoxNotes
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]")
    private WebElement getCheckBoxNotes;

    //checkBoxCommands
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[1]")
    private WebElement getCheckBoxCommands;

    //checkBoxWorkSpace
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]")
    private WebElement getCheckWorkSpace;

    //office
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[1]")
    private WebElement getCheckBoxOffice;

    //react
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]")
    private WebElement getCheckBoxReact;

    //angular
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[1]")
    private WebElement getCheckBoxAngular;

    //veu
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/ol[1]/li[3]/span[1]/label[1]/span[1]/*[1]")
    private WebElement getCheckBoxVeu;

    //public
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]")
    private WebElement getCheckBoxPublic;

    //private
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[1]")
    private WebElement getCheckBoxPrivate;

    //classified
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/ol[1]/li[3]/span[1]/label[1]/span[1]/*[1]")
    private WebElement getCheckBoxClassified;

    //general
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/ol[1]/li[4]/span[1]/label[1]/span[1]/*[1]")
    private WebElement getCheckBoxGeneral;

    //wordfile
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]")
    private WebElement getCheckBoxWordFile;

    //excelfile
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[1]")
    private WebElement getCheckBoxExcelFile;

                                //C L I C K
    //expand all click
    public void expandAllClick(){expandAll.click();}

    //collapse
    public void collapseAllClick(){collapseAll.click();}

    //expand home click
    public void expandHomeClick(){expandHome.click();}

    //checkbox home click
    public void checkBoxHomeClick(){checkBoxHome.click();}

    //expand desktop click
    public void expandDesktopClick(){expandDesktop.click();}

    //checkbox desktop click
    public void setCheckBoxDesktop(){expandDesktop.click();}

    //checkbox notes click
    public void getCheckBoxNotesClick(){getCheckBoxNotes.click();}

    //comands checkbox
    public void getCheckBoxCommandsClick(){getCheckBoxCommands.click();}

    //expand documents click
    public void expandDocumentsClick(){expandDocuments.click();}

    //checkbox documents
    public void checkBoxDocumentsClick(){checkBoxDocuments.click();}

    //expand workspace click
    public void expandWorkSpaceClick(){expandWorkSpace.click();}

    //checkbox works[ace
    public void getCheckWorkSpaceClick(){getCheckWorkSpace.click();}

    //react checkbox click
    public void getCheckBoxReactClick(){getCheckBoxReact.click();}

    //angular checkbox click
    public void getCheckBoxAngularClick(){getCheckBoxAngular.click();}

    //veu checkbox click
    public void getCheckBoxVeuClick(){getCheckBoxVeu.click();}

    //expand office click
    public void expandOfficeClick(){expandOffice.click();}

    //office checkbox click
    public void getCheckBoxOfficeClick(){getCheckBoxOffice.click();}

    //public checkbox click
    public void getCheckBoxPublicClick(){getCheckBoxPublic.click();}

    //private checkbox click
    public void getCheckBoxPrivateClick(){getCheckBoxPrivate.click();}

    //classified checkbox click
    public void getCheckBoxClassifiedClick(){getCheckBoxClassified.click();}

    //general checkbox click
    public void getCheckBoxGeneralClick(){getCheckBoxGeneral.click();}

    //expand download click
    public void expandDownloadsClick(){expandDownloads.click();}

    //download checkbox click
    public void checkBoxDownloadsClick(){checkBoxDownloads.click();}

    //word checkbox click
    public void getCheckBoxWordFileClick(){getCheckBoxWordFile.click();}

    //excel checkbox click
    public void getCheckBoxExcelFileClick(){getCheckBoxExcelFile.click();}

    //scroll to office option
    public void scrollToHomeField(){
        Actions actions = new Actions(webDriver);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", expandHome);
        actions.moveToElement(expandHome).perform();
    }












}
