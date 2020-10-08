package Tests;

import com.xlschool.Test.Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormsTestsWithTestNGPlusBaseTest extends BaseTest {



    @Test
    public void guionDeLucia(){
        //Guion de lucia moverlo pa aca

        //Step 2
        WebElement divForms = getDriver().findElement(By.xpath("//*[@class='category-cards']/div[contains(string(),'Forms')]"));
        //navigateToForms();
        highlighElement(divForms);
        pauseDriver();
        divForms.click();
        pauseDriver();

        //Step 3
        WebElement spanForm = getDriver().findElement(By.xpath("//span[contains(string(),'Practice Form')]"));
        highlighElement(spanForm);
        pauseDriver();
        spanForm.click();

        //Step 4 (Assert Student Registration Form)
        pauseDriver();
        WebElement headerStudentRegistrationForm  = getDriver().findElement(By.xpath("//div[@class='practice-form-wrapper']//h5[contains(text(), 'Registration')]"));
        highlighElement(headerStudentRegistrationForm);
        pauseDriver();

        String headerStudentRegistrationFormExpectedText = "Student Registration Form";
        String headerStudentRegistrationFormActualText = headerStudentRegistrationForm.getText();
        Assert.assertEquals(headerStudentRegistrationFormActualText,headerStudentRegistrationFormExpectedText);


    }

    @Test
    public void guionDeLucia2(){
        //Guion de lucia moverlo pa aca

        //Step 2
        WebElement divForms = getDriver().findElement(By.xpath("//*[@class='category-cards']/div[contains(string(),'Forms')]"));
        highlighElement(divForms);
        pauseDriver();
        divForms.click();
        pauseDriver();

        //Step 3
        WebElement spanForm = getDriver().findElement(By.xpath("//span[contains(string(),'Practice Form')]"));
        highlighElement(spanForm);
        pauseDriver();
        spanForm.click();

        //Step 4 (Assert Student Registration Form)
        pauseDriver();
        WebElement headerStudentRegistrationForm  = getDriver().findElement(By.xpath("//div[@class='practice-form-wrapper']//h5[contains(text(), 'Registration')]"));
        highlighElement(headerStudentRegistrationForm);
        pauseDriver();

        String headerStudentRegistrationFormExpectedText = "Student Registration Form";
        String headerStudentRegistrationFormActualText = headerStudentRegistrationForm.getText();
        Assert.assertEquals(headerStudentRegistrationFormActualText,headerStudentRegistrationFormExpectedText);

        //Step 5 (Clickear submit)
        pauseDriver();;
        WebElement buttonSubmitStudentRegistrationForm = getDriver().findElement(By.id("submit"));
        //Implementamos el metodo auxiliar 'scrollToElement' que utiliza un JavaScriptExecutor para mover el driver al elemento y hacer el click
        scrollToElement(buttonSubmitStudentRegistrationForm);
        highlighElement(buttonSubmitStudentRegistrationForm);
        pauseDriver();;
        buttonSubmitStudentRegistrationForm.click();
        pauseDriver();;

        //Step 6 (Validar que sigo en el mismo form)
        scrollToElement(headerStudentRegistrationForm);
        highlighElement(headerStudentRegistrationForm);
        pauseDriver();
        Assert.assertEquals(headerStudentRegistrationFormActualText,headerStudentRegistrationFormExpectedText);

        //Step 7 (Ingresar letras en el mobile)
        WebElement inputMobile = getDriver().findElement(By.xpath("//*[@id='userNumber']"));
        highlighElement(inputMobile);
        pauseDriver();
        inputMobile.sendKeys("trebol");
        String inputMobileBorderColorHexExpected = "#dc3545";
        pauseDriver();
        String inputMobileBorderColorHexActual = Color.fromString(inputMobile.getCssValue("border-color")).asHex();
        Assert.assertEquals(inputMobileBorderColorHexActual,inputMobileBorderColorHexExpected);
    }

}