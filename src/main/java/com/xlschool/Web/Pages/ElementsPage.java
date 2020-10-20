package com.xlschool.Web.Pages;


import com.xlschool.framework.pages.base.BasePage;
import org.openqa.selenium.support.PageFactory;

import static com.xlschool.framework.driver.DriverHandler.getDriver;

public class ElementsPage extends BasePage {
    public static void getLanding() {
        PageFactory.initElements(getDriver(),ElementsPage.class);
    }
}
