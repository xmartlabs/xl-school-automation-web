package com.xlschool.Web.PageObject.Pages;

import com.xlschool.Web.PageObject.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.xlschool.Web.Driver.DriverHandler.getDriver;
import static com.xlschool.Web.Utils.Utils.highlighElement;
import static com.xlschool.Web.Utils.Utils.pauseDriver;

public class HomePage extends BasePage {
    public static void navigateToFormsPage(){
        WebElement divForms = getDriver().findElement(By.xpath("//*[@class='category-cards']/div[contains(string(),'Forms')]"));
        highlighElement(divForms);
        pauseDriver();
        divForms.click();
        pauseDriver();
    }


}
