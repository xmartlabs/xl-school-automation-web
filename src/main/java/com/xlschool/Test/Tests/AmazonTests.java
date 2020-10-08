package com.xlschool.Test.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonTests {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://amazon.com");
        waiter(3000);

        System.out.println("El titulo de la pagina es: " + driver.getTitle());
        WebElement inputSearch = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        highlighElement(driver,inputSearch);
        inputSearch.sendKeys("aladdin");
        waiter(3000);

        WebElement buttonSearch = driver.findElement(By.id("nav-search-submit-text"));
        highlighElement(driver,buttonSearch);
        buttonSearch.click();
        waiter(5000);

        WebElement storesDropDown = driver.findElement(By.id("searchDropdownBox"));
        highlighElement(driver,storesDropDown);
        waiter(2000);
        storesDropDown.click();
        Select storeSelector = new Select(storesDropDown);
        //storeSelector.deselectByValue("search-alias=warehouse-deals");
        storeSelector.selectByVisibleText("Books");
        waiter(5000);

        driver.close();
        driver.quit();
    }

    private static void waiter(int pTime) {
        try {
            Thread.sleep(pTime);
        } catch (Exception e) {

        }
    }


    public static void highlighElement(WebDriver driver, WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].style.backgroundColor = '#FDFF47';", element);
    }

}
