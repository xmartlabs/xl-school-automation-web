package com.xlschool.Test.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

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

        try {

            driver.manage().window().maximize();

            driver.get("https://demoqa.com/");
            waiter(3000);

            //Step 2
            WebElement divForms = driver.findElement(By.xpath("//*[@class='category-cards']/div[contains(string(),'Forms')]"));
            highlighElement(driver,divForms);
            waiter(1000);
            divForms.click();
            waiter(2000);

            //Step 3
            WebElement spanForm = driver.findElement(By.xpath("//span[contains(string(),'Practice Form')]"));
            highlighElement(driver,spanForm);
            waiter(1000);
            spanForm.click();

            //Step 4 (Assert Student Registration Form)
            waiter(2000);
            WebElement headerStudentRegistrationForm  = driver.findElement(By.xpath("//div[@class='practice-form-wrapper']//h5[contains(text(), 'Registration')]"));
            highlighElement(driver,headerStudentRegistrationForm);
            waiter(1000);

            String headerStudentRegistrationFormActualText = headerStudentRegistrationForm.getText();
            System.out.println("headerStudentRegistrationFormText = " + headerStudentRegistrationFormActualText);

            String headerStudentRegistrationFormExpectedText = "Student Registration Form";
            boolean resultado;

            resultado = textCompare(headerStudentRegistrationFormActualText, headerStudentRegistrationFormExpectedText);
            System.out.println("El texto del título coincide?" + resultado);


            //Step 5 (Clickear submit)
            waiter(2000);
            WebElement buttonSubmitStudentRegistrationForm = driver.findElement(By.id("submit"));

            //Implementamos el metodo auxiliar 'scrollToElement' que utiliza un JavaScriptExecutor para mover el driver al elemento y hacer el click
            scrollToElement(driver,buttonSubmitStudentRegistrationForm);

            highlighElement(driver,buttonSubmitStudentRegistrationForm);
            waiter(2000);

            buttonSubmitStudentRegistrationForm.click();
            waiter(2000);

            //Step 6 (Validar que sigo en el mismo form)
            scrollToElement(driver,headerStudentRegistrationForm);
            highlighElement(driver,headerStudentRegistrationForm);
            waiter(1000);
            resultado = textCompare(headerStudentRegistrationFormActualText, headerStudentRegistrationFormExpectedText);
            System.out.println("El texto del título coincide? => " + resultado);


            //Step 7 (Ingresar letras en el mobile)
            WebElement inputMobile = driver.findElement(By.xpath("//*[@id='userNumber']"));
            highlighElement(driver,inputMobile);
            waiter(1000);
            inputMobile.sendKeys("trebol");
            String inputMobileBorderColorHexExpected = "#dc3545";
            waiter(1000);
            String inputMobileBorderColorHexActual = Color.fromString(inputMobile.getCssValue("border-color")).asHex();
            boolean resultadoInputColor = textCompare(inputMobileBorderColorHexActual,inputMobileBorderColorHexExpected);
            System.out.println("El color de borde coincide? => " + resultadoInputColor);









            waiter(2000);


        }catch (Exception e) {
            System.out.println("Se rompio" );
            e.printStackTrace();
        }finally {


            dispose(driver);
        }






        waiter(4000);


    }


    private static Boolean textCompare(String pActualText, String pExpectedText) {
        boolean resultado = false;
        if (pActualText.equals(pExpectedText)){
            resultado = true;
        }else if (pActualText.equals(pExpectedText)){
            resultado = false;
        }
        return resultado;
    }

    public static void scrollToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void highlighElement(WebDriver pDriver, WebElement pWebElement) {
        JavascriptExecutor jse = (JavascriptExecutor) pDriver;
        jse.executeScript("arguments[0].style.backgroundColor = '#FDFF47';", pWebElement);
    }


    private static void dispose(WebDriver driver) {
        driver.close();
        driver.quit();
    }

    private static void waiter(int pTime) {
        try {
            Thread.sleep(pTime);
        } catch (Exception e) {

        }
    }
}