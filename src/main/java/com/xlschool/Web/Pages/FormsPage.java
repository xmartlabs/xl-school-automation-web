package com.xlschool.Web.Pages;

import com.xlschool.framework.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.xlschool.framework.driver.DriverHandler.getDriver;
import static com.xlschool.framework.utils.Utils.highlighElement;
import static com.xlschool.framework.utils.Utils.pauseDriver;

public class FormsPage extends BasePage {
    public static void navigateToPracticeFormPage(){
        WebElement spanForm = getDriver().findElement(By.xpath("//span[contains(string(),'Practice Form')]"));
        highlighElement(spanForm);
        pauseDriver();
        spanForm.click();
    }
}
