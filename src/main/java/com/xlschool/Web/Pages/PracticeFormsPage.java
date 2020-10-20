package com.xlschool.Web.Pages;

import com.xlschool.framework.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.xlschool.framework.driver.DriverHandler.getDriver;
import static com.xlschool.framework.utils.Utils.highlighElement;
import static com.xlschool.framework.utils.Utils.pauseDriver;

public class PracticeFormsPage extends BasePage {

    @FindBy(xpath = "//div[@class='practice-form-wrapper']//h5[contains(text(), 'Registration')]")
    private static WebElement headerStudentRegistrationForm;

    public static String getRegistrationFormHeader(){
        highlighElement(headerStudentRegistrationForm);
        pauseDriver();
        return headerStudentRegistrationForm.getText();
    }

    public static void getLanding() {
        PageFactory.initElements(getDriver(),PracticeFormsPage.class);
    }
}
