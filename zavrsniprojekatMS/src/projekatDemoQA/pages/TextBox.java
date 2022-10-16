package projekatDemoQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBox {

    private TextBox textBox;

    private WebDriver webDriver;



    public TextBox(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this);
    }


    //logo
    @FindBy(xpath = "//header/a[1]/img[1]")
    private WebElement logoToolsQa;


            //elements section
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]")
    private WebElement elementsSection;

    //textbox submenu
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")
    private WebElement textBoxSubMenu;

                //username textbox
    @FindBy(id = "userName")
    public WebElement userNameTextBox;

                //userEmail textbox
    @FindBy (id = "userEmail")
    public WebElement userEmailTextBox;

        //currentAddress textbox
    @FindBy (id = "currentAddress")
    public WebElement currentAddressTextBox;

    //permanentAddress textbox
    @FindBy (id = "permanentAddress")
    public WebElement permanentAddressTextBox;



                            //Trebao bih skrolovati
    //submit textbox
    @FindBy (id = "submit")
    public WebElement submitTextBox;


    //logoToolsQa
    public void logoToolsQaClick(){logoToolsQa.click();}

    //elements section click
    public void elementsSectionClick(){elementsSection.click();}

    //textBoxSubMenu click
    public void textBoxSubMenuClick(){textBoxSubMenu.click();}

    //username textboxclick
    public void userNameTextBoxClick(){userNameTextBox.click();}

    //useremail textboxclic
    public void userEmailTextBoxClick(){userEmailTextBox.click();}

    //current address textboxclic
    public void currentAddressTextBoxClick(){currentAddressTextBox.click();}

    //permanent address textboxclic
    public void permanentAddressTextBoxClick(){permanentAddressTextBox.click();}

                    //skrol

    public void scrollToSumbitButtonOnTextBox(){
        WebElement element = webDriver.findElement(By.id("submit"));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
    }




                //trebaobih skrolovati
    //submit textboxclic
    public void submitTextBoxClick(){submitTextBox.click();}
}
