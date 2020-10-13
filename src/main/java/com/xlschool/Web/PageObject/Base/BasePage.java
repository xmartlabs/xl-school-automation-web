package com.xlschool.Web.PageObject.Base;

import com.xlschool.Web.Driver.DriverHandler;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected static WebDriver _driver;

    public BasePage(){
        _driver = DriverHandler.getDriver();
    }
}
