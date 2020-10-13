package com.xlschool.framework.tests.base;

import com.xlschool.Web.Pages.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.xlschool.framework.driver.DriverHandler.dispose;

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
