package lt.marius.pom.pages.seleniumeasy;

import lt.marius.pom.pages.Common;
import org.openqa.selenium.By;

public class BasicFirstFormPage {

    public static void open() {
        Common.setUpDriver();
        Common.OpenUrl("http://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    public static void closeDriver() {
        Common.closeDriver();
    }

    public static void enterMessage(String inputMessage) {
        Common.sendKeysToElement(
                By.xpath("//input[@id='user-message']"),
                inputMessage);
    }

    public static void clickOnButtonShowMessage() {
        Common.clickOnElement(By.xpath("//button[contains(@onclick,'show')]"));
    }

    public static String readMessage() {
        return Common.getTextFromElement(By.xpath("//*[@id='display']"));
    }
}
