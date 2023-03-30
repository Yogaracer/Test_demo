package lt.marius.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSeleniumDemo {

    private WebElement driver;

    @Test
// web puslapio atidarymo metodas

    public void seleniumDemo() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*"); //padeda prisijungti prie socketu, norint atidaryti saita
        options.addArguments("start-maximized"); // atidaro pilna puslapio langa
        options.addArguments("--force-device-scale-factor=0.70"); //didina arba mazina puslapio langa. 1 - 100% ir t.t.

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8)); // metodas skirtas uzdelstam web svetaines atidarymui

        // driver.navigate(). - galima naviguoti puslapio viduje
        // driver.switchTo() - galima pereiti i kita langa

        driver.get("https://www.vilniuscoding.lt/"); // metodo get pagalba uzkrauna web svetaine

        try {
            Thread.sleep(5000);  // atidarys web svetaines langa 5 sek
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
        driver.close(); //automatiskai uzdaro langa po auksciau uzduotu 5 sek
    }
//_________________________________________________________________________________________________
// ________________________________________________________________________________________________

    // zemiau pateiktas metodas kaip susirasti web elementa pagal ID ir
    // panaudoti ji tam tikrai uzduociai

    @Test

    public void testFullNameInput_FullNameValueMarius() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("start-maximized");
        options.addArguments("--force-device-scale-factor=1.5");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.get("https://demoqa.com/text-box");

//        WebElement element = driver.findElement(By.id("userName")); // ieskome elemento is web saito kopijuojant jo ID inspect lange
//        element.sendKeys("Marius"); //sendkeys metodas iraso informacija i nurodyta vieta

        WebElement element = driver.findElement(By.xpath("//input[@id='userName']")); // ieskome elemento is web saito kopijuojant jo ID inspect lange
        element.sendKeys("Marius");

        try {
            Thread.sleep(3000);  //
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
        driver.close();
    }


    //truksta paskaitos 2023-03-29 pavyzdziu

    //paskaita 2023-03-30_____________________________________________-


    @Test
    public void testEmailInputValidEmail() {
        String messageEmail = "talalasmarius@gmail.com";
        String expectedResult = "talalasmarius@gmail.com";
        String actualResult;

        WebElement inputUserEmail = driver.findElement(By.xpath("//input [@id='userEmail']"));
        inputUserEmail.sendKeys(messageEmail);
        WebElement buttonSubmit = driver.findElement(By.xpath("//button[@id='submit']"));
        buttonSubmit.click();
        WebElement paragraphUserEmail = driver.findElement(By.xpath("//p[@id='email']"));
        actualResult = paragraphUserEmail.getText();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult)
        );


    }


}
