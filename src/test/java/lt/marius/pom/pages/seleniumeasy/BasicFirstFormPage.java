package lt.marius.pom.pages.seleniumeasy;

import lt.marius.pom.pages.Common;
import org.openqa.selenium.By;

public class BasicFirstFormPage {

    public static void open() {
        Common.setUpDriver();
        Common.OpenUrl("http://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    public static void closeDriver() {

        Common.sleep(3000);
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

    public static void inputValueA(String value) {
        Common.sendKeysToElement(
                By.xpath("//input[@id='value1']"),
                value);
    }

    public static void inputValueB(String value) {
        Common.sendKeysToElement(
                By.xpath("//input[@id='value2']"),
                value);
    }

    public static void clickButtonGetTotal() {
        Common.clickOnElement(By.xpath("//form[@id='gettotal']//button"));
    }

    public static String readMessageTotal() {
        return Common.getTextFromElement(By.xpath("//span[@id='displayvalue']"));
    }
}
