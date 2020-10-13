package com.xlschool.framework.pages.base;

import com.xlschool.framework.driver.DriverHandler;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected static WebDriver _driver;

    public BasePage(){
        _driver = DriverHandler.getDriver();
    }
}
