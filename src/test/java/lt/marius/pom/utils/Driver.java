package lt.marius.pom.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;

    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*"); //padeda prisijungti prie socketu, norint atidaryti saita
        options.addArguments("start-maximized"); // atidaro pilna puslapio langa
        options.addArguments("--force-device-scale-factor=0.70"); //didina arba mazina puslapio langa. 1 - 100% ir t.t.

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
    }

}
