package lt.marius.pom.tests.seleniumeasy;

import io.github.bonigarcia.wdm.WebDriverManager;
import lt.marius.pom.pages.demoqa.TextBoxPage;
import lt.marius.pom.pages.seleniumeasy.BasicFirstFormPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

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

//        WebElement inputEnterValueA = driver.findElement(By.xpath("//input[@id='sum1']"));
//        inputEnterValueA.sendKeys(enterValueA);
//
//        WebElement inputEnterValueB = driver.findElement(By.xpath("//input[@id='sum2']"));
//        inputEnterValueB.sendKeys(enterValueB);
//
//        WebElement buttonSGetTotal = driver.findElement(By.xpath("//form[@id='gettotal']//button"));
//        buttonSGetTotal.click();
//
//        WebElement elementTotal = driver.findElement(By.xpath("//span[@id='displayvalue']"));
//        actualResult = elementTotal.getText();
//
//        Assert.assertEquals(actualResult, expectedResult);
//        String.format("Actual: %s; Expected: %s", actualResult, expectedResult);

    }

    @Test
    public void testTwoInputFieldsNegative() {
        String enterValueA = "5";
        String enterValueB = "aa";
        String expectedResult = "NaN";
        String actualResult;

//        WebElement inputEnterValueA = driver.findElement(By.xpath("//input[@id='sum1']"));
//        inputEnterValueA.sendKeys(enterValueA);
//
//        WebElement inputEnterValueB = driver.findElement(By.xpath("//input[@id='sum2']"));
//        inputEnterValueB.sendKeys(enterValueB);
//
//        WebElement buttonSGetTotal = driver.findElement(By.xpath("//form[@id='gettotal']//button"));
//        buttonSGetTotal.click();
//
//        WebElement elementTotal = driver.findElement(By.xpath("//span[@id='displayvalue']"));
//        actualResult = elementTotal.getText();
//
//        Assert.assertEquals(actualResult, expectedResult);
//        String.format("Actual: %s; Expected: %s", actualResult, expectedResult);

    }

    @AfterMethod
    public void tearDown() {
        BasicFirstFormPage.closeDriver();
    }
}


