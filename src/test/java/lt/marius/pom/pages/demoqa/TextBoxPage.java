package lt.marius.pom.pages.demoqa;

import lt.marius.pom.pages.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextBoxPage {
    public static void open() {
        Common.setUpDriver();
        Common.OpenUrl("https://demoqa.com/text-box");
    }

    public static void closeDriver() {
        Common.closeDriver();
    }

    public static void enterFullName(String messageFullName) {

        Common.sendKeysToElement(
                By.xpath("//input [@id='userName']"),
                messageFullName
        );
    }

    public static void clickOnButtonSubmit() {
        Common.clickOnElement(By.xpath("//button[@id='submit']"));
    }

    public static String readFullNameMessage() {

        return Common.getTextFromElement(By.xpath("//[p@id='name']"));
    }

    public static void enterEmailAdress(String messageEmail) {
        Common.sendKeysToElement(
                By.xpath("//input[@id='userEmail']"),
                messageEmail
        );
    }

    public static String readEmailMessage() {
        return Common.getTextFromElement(By.xpath("//p[@id='email']"));
    }
}
