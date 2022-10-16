package projekatDemoQA.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Droppable {

    private Droppable droppable;
    private WebDriver webDriver;




    public Droppable(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this);


    }

    //logo
    @FindBy(xpath = "//header/a[1]/img[1]")
    private WebElement logoToolsQa;

                 //ELEMENTS IN SIMPLE MENU
    //dragable
    @FindBy(id = "draggable")
    public WebElement draggableSimpleMenu;

    //dropable
    @FindBy(id = "dropabble")
    public WebElement dropableField;

                //ELEMENTS IN ACCEPT MENU

    //droppableExample-tab-accept
    @FindBy(id = "droppableExample-tab-accept")
    private WebElement droppableTab;


    //acceptable
    @FindBy(id = "acceptable")
    private  WebElement acceptableAcceptMenu;

    //notacceptable
    @FindBy(id = "notAcceptable")
    private  WebElement notAcceptableAcceptMenu;

                //elements in droppableExample-tab-preventPropogation

    //droppableExample-tab-preventPropogation
    @FindBy(id = "droppableExample-tab-preventPropogation")
    private WebElement preventPropogationTab;

    //dragBox in prevent propogation
    @FindBy(id = "dragBox")
    private WebElement dragBoxPreventPropogation;

    //notGreedyDropBox in prevent propogation
    @FindBy(id = "notGreedyDropBox")
    private WebElement notGreedyDropBoxPreventPropogation;

    //notGreedyInnerDropBox in prevent propogation
    @FindBy(id = "notGreedyInnerDropBox")
    private WebElement notGreedyInnerDropBoxPreventPropogation;


    //greedyDropBox
    @FindBy(id = "greedyDropBox")
    private WebElement greedyDropBoxPreventPropogation;

    //greedyDropBoxInner
    @FindBy(id = "greedyDropBoxInner")
    private WebElement greedyDropBoxInnerPreventPropogation;

                //droppableExample-tab-revertable
    @FindBy(id = "doppableExample-tab-revertable")
    private WebElement revertDraggableTab;

    //revertable
    @FindBy(id = "revertable")
    private WebElement revertableRevertDraggable;

    //notRevertable
    @FindBy(id = "notRevertable")
    private WebElement notRevertableRevertDraggable;

                         //Clicking actions and similar

               //simple menu
    //dragable in simple menu
    public void draggableSimpleMenuClick(){draggableSimpleMenu.click();}

    //dropable in simle menu
    public void droppableCLick(){dropableField.click();}

    public void dragAndDropElement(){  Actions actions = new Actions(webDriver);
        actions.dragAndDrop(droppable.draggableSimpleMenu, droppable.dropableField).build().perform();}


    //drag and drop in simple menu
    /*public void dragAndDropSimpleMenu(){
        Actions actions = new Actions(webDriver);
       JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", draggableSimpleMenu);

        actions.dragAndDrop(draggableSimpleMenu,dropableField).perform();
    }*/



}
