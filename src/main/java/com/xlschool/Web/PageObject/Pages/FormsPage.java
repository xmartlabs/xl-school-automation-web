package com.xlschool.Web.PageObject.Pages;

import com.xlschool.Web.PageObject.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.xlschool.Web.Driver.DriverHandler.getDriver;
import static com.xlschool.Web.Utils.Utils.highlighElement;
import static com.xlschool.Web.Utils.Utils.pauseDriver;

public class FormsPage extends BasePage {
    public static void navigateToPracticeFormPage(){
        WebElement spanForm = getDriver().findElement(By.xpath("//span[contains(string(),'Practice Form')]"));
        highlighElement(spanForm);
        pauseDriver();
        spanForm.click();
    }
}
