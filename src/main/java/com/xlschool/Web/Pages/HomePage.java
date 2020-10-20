package com.xlschool.Web.Pages;

import com.xlschool.framework.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.xlschool.framework.driver.DriverHandler.getDriver;
import static com.xlschool.framework.utils.Utils.highlighElement;
import static com.xlschool.framework.utils.Utils.pauseDriver;

public class HomePage extends BasePage {

//    PageFactory
//    @FindBy
//    @FindBys() --> AND
//    @FindAll() --> OR

    @FindBy(xpath = "//*[@class='category-cards']/div[contains(string(),'Forms')]")
    private static WebElement divForms2;

    @FindBy(how = How.XPATH, using = "//*[@class='category-cards']/div[contains(string(),'Forms')]")
    private static WebElement divForms;

    @FindBy(how = How.XPATH, using = "//*[@class='category-cards']/div[contains(string(),'Elements')]")
    private static WebElement divElements;


    @FindBys({
            @FindBy(className = "category-cards"),
            @FindBy(className = "card mt-4 top-card"),
            @FindBy(className = "card-body"),
            @FindBy(tagName = "h5")
    })
    private static List<WebElement> cards;

////*[@id="app"]/div/div/div[2]/div/div[1]/div/div[3]

    //Query de las card
    //   //*[@class='category-cards']//div[@class='card mt-4 top-card']//div[@class='card-body']


    public static void navigateToFormsPage(){
        highlighElement(divForms);
        pauseDriver();
        divForms.click();
        pauseDriver();
        FormsPage.getLanding();
    }

    public static void navigateToElementsPage(){
        highlighElement(divElements);
        pauseDriver();
        divElements.click();
        pauseDriver();
        ElementsPage.getLanding();
    }


    public static void getLanding() {
        PageFactory.initElements(getDriver(),HomePage.class);
    }

    public static List<WebElement> getCards() {
        return cards;
    }
}
