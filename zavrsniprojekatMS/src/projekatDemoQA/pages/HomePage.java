package projekatDemoQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    private HomePage homePage;

    private WebDriver webDriver;



    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this);
    }


                    //FIND BY -----------radi
    @FindBy (xpath = "//header/a[1]/img[1]")
    private WebElement logoToolsQa;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/*[1]")
    private WebElement elementsPageLink;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")
    private WebElement formsPageLink;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]")
    private WebElement alertsFrameWindowsPageLink;


    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]")
    private WebElement widgetsPageLink;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]")
    private WebElement interactionsPageLink;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]")
    private WebElement bookStoreApplicationPageLink;



                            //public void -izvrsavanje (stranica).click

    public void logoToolsQaClick(){logoToolsQa.click();}

public void elementsPageLinkClick() {elementsPageLink.click();}

    public void formsPageLinkClick() {formsPageLink.click();}

    public void alertsFrameWindowsPageLinkClick() {alertsFrameWindowsPageLink.click();}

    public void widgetsLinkClick() {widgetsPageLink.click();}

    public void interactionsClick() {interactionsPageLink.click();}


    //skrol

    public void scrollToBookStoreApplicationLink(){
        WebElement element = webDriver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]"));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);

    }
    public void bookStoreApplicationClick() {bookStoreApplicationPageLink.click();}






}


