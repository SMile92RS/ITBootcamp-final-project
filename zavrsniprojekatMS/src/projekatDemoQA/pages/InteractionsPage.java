package projekatDemoQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InteractionsPage {

    private InteractionsPage interactionsPage;
    private WebDriver webDriver;



    public InteractionsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this); // ucitaj sve elemente na web stranici
    }

    //logo
    @FindBy(xpath = "//header/a[1]/img[1]")
    private WebElement logoToolsQa;

        //interaction age section
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/span[1]/div[1]")
    private WebElement interactionPageSection;

        //sortable
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[1]")
    private WebElement sortableSubMenu;

    //selectable
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[2]")
    private WebElement selectableSubMenu;

    //resizabl submenu
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[3]")
    private WebElement resizableSubMenu;

    //droppable submenu
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[4]")
    private WebElement droppableSubMenu;

    //draggable submenu
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[5]")
    private WebElement dragabbleSubMenu;

                //clickable

    //logo
    public void logoToolsQaClick(){logoToolsQa.click();}

    //interaction page section click
    public void interactionPageSectionClick(){interactionPageSection.click();}

    //sortable
    public void sortableSubMenuClick(){sortableSubMenu.click();}

    //selectable click
    public void selectableSubMenuClick(){selectableSubMenu.click();}

    //resizable click
    public void resizableSubMenuClick(){resizableSubMenu.click();}

    //droppable click
    public void droppableSubMenuClick(){droppableSubMenu.click();}

    //dragabble click
    public void dragabbleSubMenuClick(){dragabbleSubMenu.click();}



                        //SCROLL

    //scroll to interactions sub menu
    public void scrollToInteractionsPageSection(){
        WebElement element = webDriver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/span[1]/div[1]"));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);",element);}




            //Scroll to draggable
    public void scrollToDraggable(){
        WebElement element = webDriver.findElement(By.id("item-0"));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);",element);}





}
