package com.xlschool.Test.Base;

import com.xlschool.Web.PageObject.Pages.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.xlschool.Web.Driver.DriverHandler.*;

public class BaseTest {

    @BeforeMethod
    public void beforeMethod(){
        navigateToHomePage();
    }

    @AfterMethod
    public void afterMethod(){
        dispose();
    }

}
