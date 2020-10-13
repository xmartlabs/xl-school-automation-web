package com.xlschool.Web.Pages;

import com.xlschool.framework.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.xlschool.framework.driver.DriverHandler.getDriver;
import static com.xlschool.framework.utils.Utils.highlighElement;
import static com.xlschool.framework.utils.Utils.pauseDriver;

public class PracticeFormsPage extends BasePage {
    public static String getRegistrationFormHeader(){
        WebElement headerStudentRegistrationForm  = getDriver().findElement(By.xpath("//div[@class='practice-form-wrapper']//h5[contains(text(), 'Registration')]"));
        highlighElement(headerStudentRegistrationForm);
        pauseDriver();
        return headerStudentRegistrationForm.getText();
    }
}
