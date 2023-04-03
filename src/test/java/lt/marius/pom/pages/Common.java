package lt.marius.pom.pages;

import lt.marius.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Common {

    public static void setUpDriver() {

        Driver.setDriver();
    }

    public static void OpenUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void closeDriver() {
        Driver.closeDriver();
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    private static List<WebElement> getElements(By locator){
        return Driver.getDriver().findElements(locator);
    }

    public static void sendKeysToElement(By locator, String sendKeys) {
//        WebElement element = getElement(locator); // pirmas variantas
//        element.sendKeys(sendKeys);
        getElement(locator).sendKeys(sendKeys); // antras variantas
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }
}
