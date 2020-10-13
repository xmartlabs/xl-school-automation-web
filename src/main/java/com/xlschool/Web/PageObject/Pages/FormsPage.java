package com.xlschool.Web.PageObject.Pages;

import com.xlschool.Web.PageObject.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.xlschool.Web.Utils.WebUtils.highlighElement;
import static com.xlschool.Web.Utils.WebUtils.pauseDriver;

public class FormsPage extends BasePage {

    public static void navigateToPracticeForms(){
        WebElement spanForm = _driver.findElement(By.xpath("//span[contains(string(),'Practice Form')]"));
        highlighElement(spanForm);
        pauseDriver();
        spanForm.click();
        pauseDriver();
    }

}
