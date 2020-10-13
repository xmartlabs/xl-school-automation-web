package com.xlschool.Web.PageObject.Pages;

import com.xlschool.Web.PageObject.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.xlschool.Web.Utils.WebUtils.highlighElement;
import static com.xlschool.Web.Utils.WebUtils.pauseDriver;

public class PracticeFormsPage extends BasePage {

    public static String getRegistrationFormTitle(){
        WebElement headerStudentRegistrationForm  = _driver.findElement(By.xpath("//div[@class='practice-form-wrapper']//h5[contains(text(), 'Registration')]"));
        highlighElement(headerStudentRegistrationForm);
        pauseDriver();
        return headerStudentRegistrationForm.getText();
    }
}
