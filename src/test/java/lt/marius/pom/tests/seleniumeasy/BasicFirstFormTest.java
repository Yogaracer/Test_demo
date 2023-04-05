package lt.marius.pom.tests.seleniumeasy;

import lt.marius.pom.pages.seleniumeasy.BasicFirstFormPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicFirstFormTest {

    @BeforeTest
    public void setUp() {
        BasicFirstFormPage.open();
    }

    @Test
    public void testSingleInputField() {

        String inputMessage = "Kelinta siandien diena?";
        String expectedResult = "Kelinta siandien diena?";
        String actualResult;

        BasicFirstFormPage.enterMessage(inputMessage);
        BasicFirstFormPage.clickOnButtonShowMessage();
        actualResult = BasicFirstFormPage.readMessage();

        Assert.assertEquals(actualResult, expectedResult);
        String.format("Actual: %s; Expected: %s", actualResult, expectedResult);
    }


    @Test
    public void testTwoInputFieldsPositive() {
        String enterValueA = "5";
        String enterValueB = "8";
        String expectedResult = "13";
        String actualResult;

        BasicFirstFormPage.inputValueA(enterValueA);
        BasicFirstFormPage.inputValueB(enterValueB);
        BasicFirstFormPage.clickButtonGetTotal();
        actualResult = BasicFirstFormPage.readMessageTotal();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTwoInputFieldsNegative() {
        String enterValueA = "5";
        String enterValueB = "aa";
        String expectedResult = "NaN";
        String actualResult;

        BasicFirstFormPage.inputValueA(enterValueA);
        BasicFirstFormPage.inputValueB(enterValueB);
        BasicFirstFormPage.clickButtonGetTotal();
        actualResult = BasicFirstFormPage.readMessageTotal();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @AfterMethod
    public void tearDown() {
        BasicFirstFormPage.closeDriver();
    }
}


