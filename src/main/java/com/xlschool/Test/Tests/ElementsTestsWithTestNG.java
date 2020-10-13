package com.xlschool.Test.Tests;

import com.xlschool.Test.Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementsTestsWithTestNG extends BaseTest {


//
//    @Test
//    public void guionDeLucia(){
//        //Guion de lucia moverlo pa aca
//
//        //Step 2
//        WebElement divForms = getDriver().findElement(By.xpath("//*[@class='category-cards']/div[contains(string(),'Forms')]"));
//        highlighElement(divForms);
//        pauseDriver();
//        divForms.click();
//        pauseDriver();
//
//        //Step 3
//        WebElement spanForm = getDriver().findElement(By.xpath("//span[contains(string(),'Practice Form')]"));
//        highlighElement(spanForm);
//        pauseDriver();
//        spanForm.click();
//
//        //Step 4 (Assert Student Registration Form)
//        pauseDriver();
//        WebElement headerStudentRegistrationForm  = getDriver().findElement(By.xpath("//div[@class='practice-form-wrapper']//h5[contains(text(), 'Registration')]"));
//        highlighElement(headerStudentRegistrationForm);
//        pauseDriver();
//
//        String headerStudentRegistrationFormExpectedText = "Student Registration Form";
//        String headerStudentRegistrationFormActualText = headerStudentRegistrationForm.getText();
//        Assert.assertEquals(headerStudentRegistrationFormActualText,headerStudentRegistrationFormExpectedText);
//
//
//    }
//
//    @Test
//    public void guionDeLucia2(){
//        //Guion de lucia moverlo pa aca
//
//        //Step 2
//        WebElement divForms = getDriver().findElement(By.xpath("//*[@class='category-cards']/div[contains(string(),'Forms')]"));
//        highlighElement(divForms);
//        pauseDriver();
//        divForms.click();
//        pauseDriver();
//
//        //Step 3
//        WebElement spanForm = getDriver().findElement(By.xpath("//span[contains(string(),'Practice Form')]"));
//        highlighElement(spanForm);
//        pauseDriver();
//        spanForm.click();
//
//        //Step 4 (Assert Student Registration Form)
//        pauseDriver();
//        WebElement headerStudentRegistrationForm  = getDriver().findElement(By.xpath("//div[@class='practice-form-wrapper']//h5[contains(text(), 'Registration')]"));
//        highlighElement(headerStudentRegistrationForm);
//        pauseDriver();
//
//        String headerStudentRegistrationFormExpectedText = "Student Registration Form";
//        String headerStudentRegistrationFormActualText = headerStudentRegistrationForm.getText();
//        Assert.assertEquals(headerStudentRegistrationFormActualText,headerStudentRegistrationFormExpectedText);
//
//        //Step 5 (Clickear submit)
//        pauseDriver();;
//        WebElement buttonSubmitStudentRegistrationForm = getDriver().findElement(By.id("submit"));
//        //Implementamos el metodo auxiliar 'scrollToElement' que utiliza un JavaScriptExecutor para mover el driver al elemento y hacer el click
//        scrollToElement(buttonSubmitStudentRegistrationForm);
//        highlighElement(buttonSubmitStudentRegistrationForm);
//        pauseDriver();;
//        buttonSubmitStudentRegistrationForm.click();
//        pauseDriver();;
//
//        //Step 6 (Validar que sigo en el mismo form)
//        scrollToElement(headerStudentRegistrationForm);
//        highlighElement(headerStudentRegistrationForm);
//        pauseDriver();
//        Assert.assertEquals(headerStudentRegistrationFormActualText,headerStudentRegistrationFormExpectedText);
//
//        //Step 7 (Ingresar letras en el mobile)
//        WebElement inputMobile = getDriver().findElement(By.xpath("//*[@id='userNumber']"));
//        highlighElement(inputMobile);
//        pauseDriver();
//        inputMobile.sendKeys("trebol");
//        String inputMobileBorderColorHexExpected = "#dc3545";
//        pauseDriver();
//        String inputMobileBorderColorHexActual = Color.fromString(inputMobile.getCssValue("border-color")).asHex();
//        Assert.assertEquals(inputMobileBorderColorHexActual,inputMobileBorderColorHexExpected);
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////
////
////
////    public static void main(String[] args) {
////
////        /*
////        Guion 2
////
////        2- Clickear Forms
////        3- Clickear “practice forms”
////        4- Assert Student Registration Form
////        5- Clickear submit
////        6- Validar que sigo en student registration form
////        7- Entrar letras en el mobile
////        8- Assert que sigue rojo
////        9- Entrar 10 dígitos
////        10- Assert tick
////        11- Entrar información en todos los campos (first name, last name, email, gender, mobile, DOB, subjects, hobbies, state and city).
////        12- Click en submit
////        13- Assert Thanks for submitting the form
////        14- Validar que los valores sean correctos (guardar los valores que iba entrando en variables y usar esas variables)
////
////         */
////
////
////
////
////        try {
////
////            //Step 2
////            WebElement divForms = driver.findElement(By.xpath("//*[@class='category-cards']/div[contains(string(),'Forms')]"));
////            highlighElement(driver,divForms);
////            pauseDriver();
////            divForms.click();
////            pauseDriver();;
////
////            //Step 3
////            WebElement spanForm = driver.findElement(By.xpath("//span[contains(string(),'Practice Form')]"));
////            highlighElement(driver,spanForm);
////            pauseDriver();
////            spanForm.click();
////
////            //Step 4 (Assert Student Registration Form)
////            pauseDriver();;
////            WebElement headerStudentRegistrationForm  = driver.findElement(By.xpath("//div[@class='practice-form-wrapper']//h5[contains(text(), 'Registration')]"));
////            highlighElement(driver,headerStudentRegistrationForm);
////            pauseDriver();
////
////            String headerStudentRegistrationFormActualText = headerStudentRegistrationForm.getText();
////            System.out.println("headerStudentRegistrationFormText = " + headerStudentRegistrationFormActualText);
////
////            String headerStudentRegistrationFormExpectedText = "Student Registration Form";
////            boolean resultado;
////
////            resultado = textCompare(headerStudentRegistrationFormActualText, headerStudentRegistrationFormExpectedText);
////            System.out.println("El texto del título coincide?" + resultado);
////
////
////            //Step 5 (Clickear submit)
////            pauseDriver();;
////            WebElement buttonSubmitStudentRegistrationForm = driver.findElement(By.id("submit"));
////
////            //Implementamos el metodo auxiliar 'scrollToElement' que utiliza un JavaScriptExecutor para mover el driver al elemento y hacer el click
////            scrollToElement(driver,buttonSubmitStudentRegistrationForm);
////
////            highlighElement(driver,buttonSubmitStudentRegistrationForm);
////            pauseDriver();;
////
////            buttonSubmitStudentRegistrationForm.click();
////            pauseDriver();;
////
////            //Step 6 (Validar que sigo en el mismo form)
////            scrollToElement(driver,headerStudentRegistrationForm);
////            highlighElement(driver,headerStudentRegistrationForm);
////            pauseDriver();
////            resultado = textCompare(headerStudentRegistrationFormActualText, headerStudentRegistrationFormExpectedText);
////            System.out.println("El texto del título coincide? => " + resultado);
////
////
////            //Step 7 (Ingresar letras en el mobile)
////            WebElement inputMobile = driver.findElement(By.xpath("//*[@id='userNumber']"));
////            highlighElement(driver,inputMobile);
////            pauseDriver();
////            inputMobile.sendKeys("trebol");
////            String inputMobileBorderColorHexExpected = "#dc3545";
////            pauseDriver();
////            String inputMobileBorderColorHexActual = Color.fromString(inputMobile.getCssValue("border-color")).asHex();
////            boolean resultadoInputColor = textCompare(inputMobileBorderColorHexActual,inputMobileBorderColorHexExpected);
////            System.out.println("El color de borde coincide? => " + resultadoInputColor);
////
////
////
////
////
////
////
////
////
////            pauseDriver();;
////
////
////        }catch (Exception e) {
////            System.out.println("Se rompio" );
////            e.printStackTrace();
////        }finally {
////
////        }
////
////
////
////    }
//
//


}