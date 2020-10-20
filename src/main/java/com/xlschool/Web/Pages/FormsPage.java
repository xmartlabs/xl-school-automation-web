package com.xlschool.Web.Pages;

import com.xlschool.framework.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.xlschool.framework.driver.DriverHandler.getDriver;
import static com.xlschool.framework.utils.Utils.highlighElement;
import static com.xlschool.framework.utils.Utils.pauseDriver;

public class FormsPage extends BasePage {

    @FindBy(xpath = "//span[contains(string(),'Practice Form')]")
    private static WebElement spanForm;

    public static void navigateToPracticeFormPage(){
        highlighElement(spanForm);
        pauseDriver();
        spanForm.click();
        pauseDriver();
        PracticeFormsPage.getLanding();
    }

    public static void getLanding() {
        PageFactory.initElements(getDriver(),FormsPage.class);
    }
}
