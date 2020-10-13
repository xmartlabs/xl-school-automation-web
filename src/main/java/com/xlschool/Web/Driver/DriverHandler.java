package com.xlschool.Web.Driver;

import com.xlschool.Web.PageObject.Base.BasePage;
import com.xlschool.Web.PageObject.Pages.FormsPage;
import com.xlschool.Web.PageObject.Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.xlschool.Web.Utils.WebUtils.pauseDriver;
import static org.openqa.selenium.support.PageFactory.*;

public class DriverHandler {

    private static DriverHandler INSTANCE;
    private static WebDriver _driver;
    private static String _baseUrl = "https://demoqa.com/";

    private DriverHandler(){
        this.createDriver();
    }

    public static WebDriver getDriver(){
        getInstance();
        return _driver;
    }

    private static DriverHandler getInstance(){
        if (INSTANCE == null){
            INSTANCE = new DriverHandler();
        }
        return INSTANCE;
    }

    private void createDriver(){
        try {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            _driver = new ChromeDriver();
            navigateToHomePage();
        }catch (Exception e){
            System.out.println("Something went wrong when creating the driver. Check -->");
            e.printStackTrace();
        }
    }

    private static void setDriverParameters() {
        _driver.manage().window().maximize();
        _driver.manage().deleteAllCookies();
    }

    public static void dispose(){
        try {
            if (_driver != null){
            _driver.close();
            _driver.quit();
            }
            if (INSTANCE != null){
                INSTANCE = null;
            }
        }catch (Exception e){
            System.out.println("Something went wrong when killing the driver INSTANCE the driver. Check -->");
            e.printStackTrace();
        }
    }


    public static void navigateToHomePage() {
        setDriverParameters();
        _driver.get(_baseUrl);
        pauseDriver();
    }

    public static FormsPage navigateToFormsPage() {
        setDriverParameters();
        _driver.get(_baseUrl + "/Forms");
        pauseDriver();
        return initElements(DriverHandler.getDriver(),FormsPage.class);
    }

    public static BasePage navigateToDesiredPage(BasePage pDesiredPage) {
        setDriverParameters();
        _driver.get(_baseUrl + "/Elements");
        pauseDriver();
        return initElements(DriverHandler.getDriver(),pDesiredPage.getClass());
    }
}
