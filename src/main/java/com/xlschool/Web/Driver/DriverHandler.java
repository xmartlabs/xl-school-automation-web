package com.xlschool.Web.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static com.xlschool.Web.Utils.Utils.pauseDriver;

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

        try{
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            _driver = new ChromeDriver();
            setDriverParameters();
            navigateToHome();
            pauseDriver();
        }catch (Exception e){
            System.out.println("Something went wrong when initializing the driver. ");
            e.printStackTrace();

        }
    }

    public static void navigateToHome() {
        _driver.get(_baseUrl);
    }

    private static void setDriverParameters() {
        _driver.manage().window().maximize();
        _driver.manage().deleteAllCookies();
    }

    public static void dispose(){
        try{
            if (_driver != null){
                _driver.close();
                _driver.quit();
            }
            if (INSTANCE != null){
                INSTANCE = null;
            }
        }catch (Exception e){
            System.out.println("Something went wrong when killing the driver or killing the DriverHandler INSTANCE");
            e.printStackTrace();
        }
    }
}
