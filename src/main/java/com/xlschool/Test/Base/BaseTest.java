package com.xlschool.Test.Base;

import com.xlschool.Web.Driver.DriverHandler;
import com.xlschool.Web.PageObject.Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.xlschool.Web.Driver.DriverHandler.dispose;

public class BaseTest {

    @BeforeMethod
    public void beforeMethod(){
        new HomePage();
    }

    @AfterMethod
    public void afterMethod(){
        dispose();
    }

}
