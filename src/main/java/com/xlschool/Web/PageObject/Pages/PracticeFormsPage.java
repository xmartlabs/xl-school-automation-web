package com.xlschool.Web.PageObject.Pages;

import com.xlschool.Web.PageObject.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.xlschool.Web.Driver.DriverHandler.getDriver;
import static com.xlschool.Web.Utils.Utils.highlighElement;
import static com.xlschool.Web.Utils.Utils.pauseDriver;

public class PracticeFormsPage extends BasePage {
    public static String getRegistrationFormHeader(){
        WebElement headerStudentRegistrationForm  = getDriver().findElement(By.xpath("//div[@class='practice-form-wrapper']//h5[contains(text(), 'Registration')]"));
        highlighElement(headerStudentRegistrationForm);
        pauseDriver();
        return headerStudentRegistrationForm.getText();
    }
}
