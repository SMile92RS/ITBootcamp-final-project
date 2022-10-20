package projekatDemoQA.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buttons extends WebPage {

    public Buttons(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    //findby

    //logo
    @FindBy(xpath = "//header/a[1]/img[1]")
    private WebElement logoToolsQa;

    //buttons submenu
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]")
    private WebElement buttonsSubMenu;

    //doubleclick btn
    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickButton;

    //right click btn
    @FindBy(id = "rightClickBtn")
    public WebElement rightClickButton;

    //singleclick btn
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/button[1]")
    public WebElement singleClickButton;

    //text
    @FindBy(id = "doubleClickMessage")
    public WebElement displayedText;

   @FindBy(id = "rightClickMessage")
  public WebElement displayedText2;

   @FindBy(id="dynamicClickMessage")
   public WebElement displayedText3;





    //clicking on

    //logo
    public void logoToolsQaClick(){logoToolsQa.click();}

    //buttons click
    public void buttonsMenuClick(){buttonsSubMenu.click();}

    //double click button
    public void doubleClickButtonClick(){doubleClickButton.click();}

    //right click button


    //single click
    public void singleClickButtonClick(){singleClickButton.click();}

    //text...shows inputed data
    public WebElement resultText(){
        return displayedText;
    }

    public WebElement resultText2(){return displayedText2;}

    public WebElement resultText3(){return displayedText3;}

}
