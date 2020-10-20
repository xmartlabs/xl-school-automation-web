package com.xlschool.Web.Tests;

import com.xlschool.Web.Pages.FormsPage;
import com.xlschool.Web.Pages.HomePage;
import com.xlschool.Web.Pages.PracticeFormsPage;
import com.xlschool.framework.tests.base.BaseTest;
import com.xlschool.framework.utils.WebUtils;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FormsTestsWithPageFactory extends BaseTest {



//    @Test
    public void guionDeLucia(){
        HomePage.navigateToFormsPage();//Inside FormsPage
        FormsPage.navigateToPracticeFormPage();//Inside PracticeFormPage
        String headerStudentRegistrationFormExpectedText = "Student Registration Form";
        String headerStudentRegistrationFormActualText = PracticeFormsPage.getRegistrationFormHeader();
        Assert.assertEquals(headerStudentRegistrationFormActualText,headerStudentRegistrationFormExpectedText);
    }

    @Test
    public void printCardsTest(){
        List<WebElement> cards = HomePage.getCards();

        for (WebElement card: cards) {
            System.out.println("Card name: " + card.getText());
        }
    }




}