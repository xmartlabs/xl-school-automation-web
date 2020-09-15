package com.xlschool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQATests {
    public static void main(String[] args) {

        /*
        Guion 2

        1- Ir a https://demoqa.com/
        2- Clickear Forms
        3- Clickear “practice forms”
        4- Assert Student Registration Form
        5- Clickear submit
        6- Validar que sigo en student registration form
        7- Entrar letras en el mobile
        8- Assert que sigue rojo
        9- Entrar 10 dígitos
        10- Assert tick
        11- Entrar información en todos los campos (first name, last name, email, gender, mobile, DOB, subjects, hobbies, state and city).
        12- Click en submit
        13- Assert Thanks for submitting the form
        14- Validar que los valores sean correctos (guardar los valores que iba entrando en variables y usar esas variables)

         */


        //Step 1
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/");
        waiter(3000);

        //Step 2
        WebElement divForms = driver.findElement(By.xpath("//*[@class='category-cards']/div[contains(string(),/Forms/)]"));
        divForms.click();
        waiter(2000);

        //Step 3
        WebElement spanForm = driver.findElement(By.xpath("//span[contains(string(),'Practice Form')]"));


        waiter(4000);


    }

    private static void waiter(int pTime) {
        try {
            Thread.sleep(pTime);
        } catch (Exception e) {

        }
    }
}