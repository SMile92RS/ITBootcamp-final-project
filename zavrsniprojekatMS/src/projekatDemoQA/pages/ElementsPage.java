package projekatDemoQA.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage {

    private ElementsPage elements;
    private WebDriver webDriver;



    public ElementsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this); // ucitaj sve elemente na web stranici
    }

                //logo
    @FindBy (xpath = "//header/a[1]/img[1]")
    private WebElement logoToolsQa;


                        //ELEMENTS
                //elements section
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]")
    private WebElement elementsSection;

                //textbox submenu
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")
    private WebElement textBoxSubMenu;

    //checkbox submenu
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]")
    private WebElement checkBoxSubMenu;

    //radiobutton submenu
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]")
    private WebElement radioButtonSubMenu;

    //webtables submenu
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]")
    private WebElement webTablesSubMenu;

    //buttons submenu
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]")
    private WebElement buttonsSubMenu;


    //moram da skrolujem na dole da se vidi

    //links submenu
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[6]")
    private WebElement linksSubMenu;



    //broken links images submenu
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[7]")
    private WebElement brokenLinksImagesSubMenu;

    //upload and downlad submenu
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]")
    private WebElement uploadAndDownloadSubMenu;

    //dynamic properties submenu
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[9]")
    private WebElement dynamicPropertiesSubMenu;



    //clicking on
    public void logoToolsQaClick(){logoToolsQa.click();}

                    //elements section click
    public void elementsSectionClick(){elementsSection.click();}

            //textBoxSubMenu click
    public void textBoxSubMenuClick(){textBoxSubMenu.click();}

    //check box click
    public void checkBoxSubMenuClick(){checkBoxSubMenu.click();}

    //radiobutton click
    public void radioButtonSubMenuClick(){radioButtonSubMenu.click();}

    //webtables click
    public void webTablesSubMenuClick(){webTablesSubMenu.click();}

    //buttons click
    public void buttonsbMenuClick(){buttonsSubMenu.click();}


                //odavde ide skrol
    //links click
    public void linksSubMenuCLick(){linksSubMenu.click();}

    //brokenlinks images click
    public void brokenLinksImagesSubMenuClick(){brokenLinksImagesSubMenu.click();}

    //uploaad and downloads click
    public void uploadAndDownloadSubMenuClick(){uploadAndDownloadSubMenu.click();}

    //upload and downloads click
    public void dynamicPropertiesSubMenuClick(){dynamicPropertiesSubMenu.click();}





}
