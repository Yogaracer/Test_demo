package lt.marius.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumEasyBasicFirstForm {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("start-maximized");
        options.addArguments("--force-device-scale-factor=1.5");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    @Test
    public void testSingleInputField() {

        String inputMessage = "Kelinta siandien diena?";
        String expectedResult = "Kelinta siandien diena?";
        String actualResult;

        WebElement inputUserMessage = driver.findElement(By.xpath("//input[@id='user-message']"));
        inputUserMessage.sendKeys(inputMessage);

        WebElement buttonShowMessage = driver.findElement(By.xpath("//button[contains(@onclick,'show')]"));
        buttonShowMessage.click();

        WebElement elementYourMessage = driver.findElement(By.xpath("//*[@id='display']"));
        actualResult = elementYourMessage.getText();

        Assert.assertEquals(actualResult, expectedResult);
        String.format("Actual: %s; Expected: %s", actualResult, expectedResult);
    }


    @Test
    public void testTwoInputFieldsPositive() {
        String enterValueA = "5";
        String enterValueB = "8";
        String expectedResult = "13";
        String actualResult;

        WebElement inputEnterValueA = driver.findElement(By.xpath("//input[@id='sum1']"));
        inputEnterValueA.sendKeys(enterValueA);

        WebElement inputEnterValueB = driver.findElement(By.xpath("//input[@id='sum2']"));
        inputEnterValueB.sendKeys(enterValueB);

        WebElement buttonSGetTotal = driver.findElement(By.xpath("//form[@id='gettotal']//button"));
        buttonSGetTotal.click();

        WebElement elementTotal = driver.findElement(By.xpath("//span[@id='displayvalue']"));
        actualResult = elementTotal.getText();

        Assert.assertEquals(actualResult, expectedResult);
        String.format("Actual: %s; Expected: %s", actualResult, expectedResult);

    }

