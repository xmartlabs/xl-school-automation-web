package com.xlschool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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
            divForms.click();
            waiter(2000);

            //Step 3
            WebElement spanForm = driver.findElement(By.xpath("//span[contains(string(),'Practice Form')]"));
            spanForm.click();

            //Step 4 (Assert Student Registration Form)
            waiter(4000);
            WebElement headerStudentRegistrationForm  = driver.findElement(By.xpath("//div[@class='practice-form-wrapper']//h5[contains(text(), 'Registration')]"));
            String headerStudentRegistrationFormActualText = headerStudentRegistrationForm.getText();
            System.out.println("headerStudentRegistrationFormText = " + headerStudentRegistrationFormActualText);

//            String headerStudentRegistrationFormText2 = headerStudentRegistrationForm.getAttribute("text");
//            System.out.println("headerStudentRegistrationFormText2 = " + headerStudentRegistrationFormText2);

            String headerStudentRegistrationFormExpectedText = "Student Registration Form";
            String resultado = "";

            if (headerStudentRegistrationFormActualText.equals(headerStudentRegistrationFormExpectedText) == true ){
                resultado = "Coincide";
            }else if (headerStudentRegistrationFormActualText.equals(headerStudentRegistrationFormExpectedText) == false){
                resultado = "No coincide y tamo leyendo cualquiera";
            }

            System.out.println("El texto del título coincide?" + resultado);


            //Step 5 (Clickear submit)
            waiter(4000);
            WebElement buttonSubmitStudentRegistrationForm = driver.findElement(By.id("submit"));


            // Acá se programa un actions para poder hacer scroll primero al elemento, para que sea visible, y posteriormente hacerle click.
            Actions action = new Actions(driver);
            action.moveToElement(buttonSubmitStudentRegistrationForm).build().perform();
            buttonSubmitStudentRegistrationForm.click();



//            6- Validar que sigo en student registration form
//            7- Entrar letras en el mobile
//            8- Assert que sigue rojo
//            9- Entrar 10 dígitos
//            10- Assert tick
//            11- Entrar información en todos los campos (first name, last name, email, gender, mobile, DOB, subjects, hobbies, state and city).
//            12- Click en submit
//            13- Assert Thanks for submitting the form
//            14- Validar que los valores sean correctos (guardar los valores que iba entrando en variables y usar esas variables)



        }catch (Exception e) {
            System.out.println("Se rompio" );
            e.printStackTrace();
        }finally {


            driver.close();
            driver.quit();
        }






        waiter(4000);


    }

    private static void waiter(int pTime) {
        try {
            Thread.sleep(pTime);
        } catch (Exception e) {

        }
    }
}