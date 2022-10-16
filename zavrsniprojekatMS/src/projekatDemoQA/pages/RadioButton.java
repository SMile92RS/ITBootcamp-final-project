package projekatDemoQA.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButton {

    private RadioButton radioButton;

    private WebDriver webDriver;



    public RadioButton(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this);
    }

                //findby

                            //logo
    @FindBy (xpath = "//header/a[1]/img[1]")
    private WebElement logoToolsQa;

    //radiobutton submenu
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]")
    private WebElement radioButtonSubMenu;

    //radiobutton yes button
    @FindBy(xpath = "//label[contains(text(),'Yes')]")
    public WebElement yesRadioButton;

    //radiobutton
    @FindBy(xpath = "//label[contains(text(),'Impressive')]")
    public WebElement impressiveRadioButton;

        //text
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/p[1]")
    public WebElement displayedText;


                //public void

    //logoToolsQa
    public void logoToolsQaClick(){logoToolsQa.click();}

    //radiobutton click
    public void radioButtonSubMenuClick(){radioButtonSubMenu.click();}

    //yes radio btn click
    public void yesRadioButtonClick(){yesRadioButton.click();}

    //impressive radio btn click
    public void impressiveRadioButtonClick(){impressiveRadioButton.click();}

    //text...shows inputed data
    public WebElement resultText(){
        return displayedText;
    }



}
