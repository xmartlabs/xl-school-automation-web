package com.xlschool.Web.Pages;

import com.xlschool.framework.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.xlschool.framework.driver.DriverHandler.getDriver;
import static com.xlschool.framework.utils.Utils.highlighElement;
import static com.xlschool.framework.utils.Utils.pauseDriver;

public class HomePage extends BasePage {
    public static void navigateToFormsPage(){
        WebElement divForms = getDriver().findElement(By.xpath("//*[@class='category-cards']/div[contains(string(),'Forms')]"));
        highlighElement(divForms);
        pauseDriver();
        divForms.click();
        pauseDriver();
    }


}
