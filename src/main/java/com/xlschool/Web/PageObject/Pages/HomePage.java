package com.xlschool.Web.PageObject.Pages;

import com.xlschool.Web.PageObject.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.xlschool.Web.Utils.WebUtils.highlighElement;
import static com.xlschool.Web.Utils.WebUtils.pauseDriver;

public class HomePage extends BasePage {

    public static void navigateToForms(){
        WebElement divForms = _driver.findElement(By.xpath("//*[@class='category-cards']/div[contains(string(),'Forms')]"));
        highlighElement(divForms);
        pauseDriver();
        divForms.click();
        pauseDriver();
    }

    public static void navigateToElements(){

    }
}
